package miage.servletaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import miage.actionform.AddContactValidationForm;
import miage.domaine.ContactDAO;

import org.apache.struts.action.*;
import org.apache.tomcat.jni.Mmap;

public class AddContactAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
							HttpServletRequest request, HttpServletResponse response) throws Exception {
		
			AddContactValidationForm f = (AddContactValidationForm) form;
			String firstName = f.getFirstName();
			String lastname = f.getLastName();
			String email = f.getEmail();
			String login = f.getLogin();
			
			System.out.println("firstname, lastname, email, login = "
					+ firstName + ", " + lastname + ", " + email + ", " + login);
			
			
			
			ContactDAO cdao = new ContactDAO();
			cdao.addContact(Long.parseLong("10"), firstName, lastname, email);
			
			return mapping.findForward("success");
	}
}


