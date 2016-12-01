package miage.domaine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ContactDAO {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/dsMyDB";

	
	
	public void addContact(Long id, String firstName, String lastName, 
					String email) {
		try {
			final Context context = new InitialContext();
			final DataSource  ds = (DataSource) context.lookup(RESOURCE_JDBC);
			final Connection cnx = ds.getConnection();
			final PreparedStatement ps = 
					cnx.prepareStatement("INSERT INTO CONTACT(FIRSTNAME, LASTNAME, EMAIL) VALUES(?, ?, ?)");
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			
			ps.executeUpdate();			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
