package miage.domaine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ContactDAO {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/dsMyDB";
	/* uniquement pour zaki*/ 
	String host = "localhost";
	 String base = "contact";
	 String url = "jdbc:mysql://localhost:3306/jee";
	 String driver = "com.mysql.jdbc.Driver";
		String uid = "root"; String passwd = "zaki";
		java.sql.Connection cx = null;
		java.sql.PreparedStatement preparedStatement;
	
	
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
	public Personne getPersonne(int id) throws SQLException, ClassNotFoundException{
		String Query = "select * from personne where id = '"+id+"' ";
		Class.forName(driver);
		cx = DriverManager.getConnection(url, uid, passwd);
		Personne ctc = new Personne(); 
		//ctc=null;
		 preparedStatement = cx.prepareStatement(Query);
		 	
			ResultSet result = preparedStatement.executeQuery();
			int i=0;
			while (result.next()) {
				i++;
				ctc.setAboutme(result.getString("id"));
				ctc.setAddresse(result.getString("addresse"));
				ctc.setCity(result.getString("city"));
				ctc.setCountry(result.getString("contry"));
				ctc.setEmail(result.getString("email"));
				ctc.setFirstName(result.getString("name"));
				ctc.setId(result.getInt("id"));
				ctc.setLastName(result.getString("lastname"));
				ctc.setPostal(result.getInt("postal"));
				ctc.setUserName(result.getString("username"));

			}
			preparedStatement.close();
			if (i==0) ctc=null;
		return ctc;	
		
	}

}
