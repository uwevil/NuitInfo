package miage.model;

import java.util.List;
import java.util.Map;


public class Personne {
	
	private int id ;
	private String nom ;
	public List<Activite> listActivities ;
	public Map<Integer, Double> mapPersonQuiDoitPayer;
	public Map<Integer, Double> mapPersonRedevant;
	
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	
	
	

	

}
