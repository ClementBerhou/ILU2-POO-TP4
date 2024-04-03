package Produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom = "Sanglier";
	private Unite unite = Unite.KILOGRAMME;
	
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String description() {
		return (nom + " de " + poids + unite.toString() 
				+ " chassé par " + chasseur.getNom());
	}
}