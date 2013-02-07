package fr.livescore;

public class Evenement {
	// Attributs de la classe 
	private int id;
	private String commentaire;
	
	// Getters
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return commentaire;
	}
	
	// Setters
	public void setId(int i) {
		id = i;
	}
	
	public void setNom(String c) {
		commentaire = c;
	}
}
