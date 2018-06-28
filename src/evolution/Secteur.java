package evolution;

import java.util.Scanner;

public class Secteur {
	private byte compteur = 0;
	private byte id;
	private String nom;
	private Ville[] villes;

	public byte getID() 
	{
		return this.id;
	}
	
	public void setNom(String nomSecteur) 
	{
		this.nom = nomSecteur;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	public Ville[] getVilles()
	{
		return this.villes;
	}
	
	public void addVille(int index, Ville ville) 
	{
		this.villes[index] = ville;
	}
	
	public Secteur() 
	{
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du secteur : ");
		this.nom = clavier.nextLine();
		this.villes = new Ville[4];
	}
	
	public Secteur(String nomSecteur)
	{
		compteur++;
		this.id = compteur;
		this.nom = nomSecteur;
		this.villes = new Ville[4];
	}
}
