package miage.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activite {
	private int id;
	private String name;
	private int somme;
	public List<Integer> listPersons;
	public Map<Integer, Double> mapPourcentageDeBaseApayer;
	public Map<Integer, Double> mapPaiementReel;
	
	
	public Activite(String name){
		listPersons = new ArrayList();
		mapPourcentageDeBaseApayer = new HashMap();
		mapPaiementReel = new HashMap();		
	}
	
	
	public Activite(List listPersons, Map mapPourcentageDeBaseApayer, Map mapPaiementReel){
		this.listPersons = listPersons;
		this.mapPaiementReel = mapPaiementReel;
		this.mapPaiementReel = mapPaiementReel;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSomme() {
		return somme;
	}
	
	

}
