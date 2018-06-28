package evolution;

import java.util.ArrayList;
import java.util.Scanner;



	public class Batiments {
		private byte compteur = 0;
		private byte id;
		private String nom;
		private Ressource ressource;
		private String description;
		private ArrayList<Mechant> mechants;
		private short  stock;
	
	
	public byte getID() {
		return this.id;
	}
	
	public void setNom(String nomBatiment) {
		this.nom = nomBatiment;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Ressource getRessource() {
		return this.ressource;
	}
	
	public short getStock() {
		return this.stock;
	}
	
	public void setStock(short stockBatiment) {
		this.stock = stockBatiment;
	}
	
	public Mechant[] getMechants() {
		return (Mechant[]) this.mechants.toArray();
	}
	
	public Batiments() 
	{
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du Batiment : ");
		this.nom = clavier.nextLine();
		this.mechants = new ArrayList<Mechant>();
		this.ressource = ressource.BIERE;
		this.stock = 10;
		this.description = " ";
	}
	
	public Batiments (Ressource ressource, String nomBatiment, short stock, String description)
	{
		compteur++;
		this.id = compteur;
		this.nom = nomBatiment;
		this.mechants = new ArrayList<Mechant>();
		this.ressource = ressource;
		this.stock = stock;
		this.description = description;
	}

}
