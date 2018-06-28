package evolution;
import java.util.ArrayList;
import java.util.Scanner;

public class Ville {
	//Variables
	private byte compteur = 0;
	private byte id;
	private String nom;
	private ArrayList<Batiments> batiment;
	private String etat;
	
	public byte getID()
	{
		return this.id;
	}
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setEtat(String etat)
	{
		this.etat = etat;
	}
	
	public String getEtat()
	{
		return this.etat;
	}
	
	public ArrayList<Batiments> getBatiments() 
	{
		return  this.batiment;
	}
	
	public void addBatiment(Batiments batiment)
	{
		this.batiment.add(batiment);
	}
	
	public Ville()
	{
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du Ville : ");
		this.nom = clavier.nextLine();
		this.batiment = new ArrayList<Batiments>();
	}
	
	public Ville(String nomVille) {
		compteur++;
		this.id = compteur;
		this.nom = nomVille;
		this.batiment = new ArrayList<Batiments>();
	}
}
