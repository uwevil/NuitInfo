package miage.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactValidationForm extends ActionForm {
	private String firstName;
	private String lastName;
	private String email;
	private String login;
	
	
	
	public ActionErrors validate(ActionMapping am, HttpServletRequest hsr){
		ActionErrors ae = new ActionErrors();
		if(firstName == null){
			//test
			//ae.add("first name", new ActionMessage("creation.fn.error.required") );
			ae.add("error1", new ActionMessage("error.firstname.required"));
			System.out.println("First name nulll...");
		}
		return ae;
	}

	
	

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public String getLogin() {
		return login;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
}
