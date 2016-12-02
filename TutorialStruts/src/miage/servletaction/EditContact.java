package miage.servletaction;


import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import miage.actionform.EditContactForm;
import miage.domaine.ContactDAO;
import miage.domaine.Personne;



public class EditContact extends Action {
	
	public ActionForward execute(final ActionMapping pMapping,
			ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) throws ClassNotFoundException, SQLException {
		
		final EditContactForm lForm=(EditContactForm)pForm;
		
	 long id = lForm.getId();
		String firstName  = lForm.getFirstName();
		 String lastName = lForm.getLastName();
		 
		String userName = lForm.getUserName();
	     String email = lForm.getEmail();
		 String city = lForm.getCity() ;
	     int postal = lForm.getPostal();
		 String addresse = lForm.getAddresse();
	     String country = lForm.getCountry() ;
	     String aboutme = lForm.getAboutme();

		// create a new Contact
		 ContactDAO lDAOContact = new ContactDAO();
	
		Personne ctc = new Personne();
		ctc.setAboutme(aboutme);
		ctc.setAddresse(addresse);
		ctc.setCity(city);
		ctc.setCountry(country);
		ctc.setEmail(email);
		ctc.setFirstName(firstName);
		ctc.setId(id);
		ctc.setLastName(lastName);
		ctc.setPostal(postal);
		ctc.setUserName(userName);
		
		lDAOContact.UpdatePersonne(ctc);

		return null;
	}
}

