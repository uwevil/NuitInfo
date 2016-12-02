package miage.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class EditContactForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 long id ;
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostal() {
		return postal;
	}
	public void setPostal(int postal) {
		this.postal = postal;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	String firstName ;
	 String lastName ;
	 
	String userName;
     String email;
	 String city ;
     int postal;
	 String addresse;
     String country ;
     String aboutme;
	 
	 



	public void reset(ActionMapping mapping, HttpServletRequest request) {
		  	this.id=0;
		    //this.firstName=null;
		    //this.lastName=null;
		    //this.email=null;
	  }
	  public ActionErrors validate( 
		      ActionMapping mapping, HttpServletRequest request ) {
		      ActionErrors errors = new ActionErrors();
		      
		     
		      
		     // ContactDAO cs = new ContactDAO();
		      
	
		      
	
		      if( getFirstName()== null || getFirstName().length() < 1 ) {
		        errors.add("firstName",new ActionMessage("creation.firstname.error.required"));
		      }
		      if( getLastName()== null || getLastName().length() < 1 ) {
			        errors.add("lastName",new ActionMessage("creation.lastname.error.required"));
			 }
		      if( getLastName()== null || getLastName().length() < 1 ) {
			        errors.add("lastName",new ActionMessage("creation.lastname.error.required"));
			 }
                return errors;
			 
	  
}
}
