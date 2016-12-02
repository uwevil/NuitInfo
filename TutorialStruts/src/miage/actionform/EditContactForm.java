package miage.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class EditContactForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public int id=0; 
	 
	 


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		  	this.id=0;
		    //this.firstName=null;
		    //this.lastName=null;
		    //this.email=null;
	  }
	  public ActionErrors validate( 
		      ActionMapping mapping, HttpServletRequest request ) {
		      ActionErrors errors = new ActionErrors();
		      
		     
		     /* 
		     // ContactDAO cs = new ContactDAO();
		      
		      try {
		      /* if (cs.SearchContact(getId())!=null) {
			 errors.add("id",new ActionMessage("existe.id.error.required"));

				  }
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		      if ( getId()<=0 ) {
			        errors.add("id",new ActionMessage("creation.id.error.required"));
			        
			      }
		      if( getFirstName()== null || getFirstName().length() < 1 ) {
		        errors.add("firstName",new ActionMessage("creation.firstname.error.required"));
		      }
		      if( getLastName()== null || getLastName().length() < 1 ) {
			        errors.add("lastName",new ActionMessage("creation.lastname.error.required"));
			 }
			 if( getEmail() == null || getEmail().length() < 1  || (!email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ))) {
			     errors.add("email", new ActionMessage("creation.email.error.required"));
			 }
		
			 if( ((getZip().length() > 1)|| (getCity().length()>1) || (getStreet().length() > 1 )) && (getCity().length()==0) ) {
			     errors.add("city", new ActionMessage("creation.city.error.required"));
			 }
			 if( ((getCity()!= null)|| (getCountry()!= null) || (getStreet()!= null )) && (getZip().length()==0) ) {

			     errors.add("zip", new ActionMessage("creation.zip.error.required"));
			 }
			 if( ((getCity()!= null)|| (getCountry()!= null) || (getZip()!= null )) && (getStreet().length()==0) ) {

			     errors.add("street", new ActionMessage("creation.street.error.required"));
			 }
			 if( ((getCity()!= null)|| (getStreet()!= null) || (getZip()!= null )) && (getCountry().length()==0) ) {

			     errors.add("country", new ActionMessage("creation.country.error.required"));
			 }
			 try { 
				 int i = Integer.parseInt(getZip()); 
				 
				 } 
				 catch (Exception e) { 
				   errors.add("zip", new ActionMessage("no.Integer"));
				 } */
			
			      return errors;
			 
	  
}
}
