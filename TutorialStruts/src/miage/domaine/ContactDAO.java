package miage.domaine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDAO {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/dsMyDB";

	public void addGroup(String nameGroup){
		//jhjh
		final String driver= "com.mysql.jdbc.Driver";
		final String url="jdbc:mysql://localhost/weecop_miage_nanterre";
		final String login="root";
		final String mdp="root";
		Statement stmt = null;
		Connection connect = null;
		
		
		String requete = "insert into 'group' (name) values('"+nameGroup+"')";
		
		try{
			Class.forName(driver);
			connect= DriverManager.getConnection(url,login,mdp);
			stmt=connect.createStatement();
			stmt.executeUpdate(requete); // Exécute la requête

			//System.out.println("Insertion : exécuté");

		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Echec de la connexion");
		}finally{
			try{

				if(stmt !=null){
					stmt.close();
				}
				if(connect !=null){
					connect.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}

	}
	
	public void afficheGroup(){
		final String driver= "com.mysql.jdbc.Driver";
		final String url="jdbc:mysql://localhost/weecop_miage_nanterre";
		final String login="root";
		final String mdp="root";
		Statement stmt = null;
		Connection connect = null;
		
		
		String requete = "select * from group";
		
		try{
			Class.forName(driver);
			connect= DriverManager.getConnection(url,login,mdp);
			stmt=connect.createStatement();
			stmt.executeUpdate(requete); // Exécute la requête

			//System.out.println("select : exécuté");

		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Echec de la connexion");
		}finally{
			try{

				if(stmt !=null){
					stmt.close();
				}
				if(connect !=null){
					connect.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	}

	
	public boolean deleteGroup(String idGroup)
	{
		boolean result = false;
		
		String driver= "com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/weecop_miage_nanterre ";
		String login="root";
		String mdp="root";
		String requete = "DELETE from group where id='" +idGroup+"'";
		
		System.out.println("La requete suppression = " +requete);
		
		Statement stmt = null;
		Connection connect = null;
		
		try{
			Class.forName(driver);
			connect= DriverManager.getConnection(url,login,mdp);
			stmt=connect.createStatement();
			// Exécute la requête
			stmt.executeUpdate(requete); 
			result = true;
			
			//System.out.println("Passage Supression");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Echec de la connexion");
		}finally{
			try{

				if(stmt !=null){
					stmt.close();
				}
				if(connect !=null){
					connect.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
		return result;
	}

}
