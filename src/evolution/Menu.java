package evolution;
import java.util.Scanner;
public class Menu {
		
	public static void presentation()
	{
		System.out.println("Evolution");
		System.out.println("Bienvenue sur Evolution");
		System.out.println("Les 3 secteurs sont occupés");
		
		System.out.println("Que voulez-vous faire?");
		
	}
	
	public void Base()
	{
	
		
	}
	
	public static void Secteurocc()
	{
		//Au départ tous les secteurs sont occupes 
		System.out.println("La ville est composé de 3 secteurs");
		System.out.println("Tous les secteurs sont occupés");
	}
	
	public static void Villeocc()
	{
		//Au départ toutes les villes sont occupees
		System.out.println("Toutes les villes de ce secteur sont encores occupées");
	}
	
	public static void Batimentocc()
	{
		// Au départ tous les batiments sont occupes
		System.out.println("Tous les batiments de la ville sont encores occupés");
	}
	
	public static byte choixdusecteur()
	{
		Scanner input = new Scanner(System.in);
		//Choix du secteur par le joueur
		System.out.println("Quel secteurs voulez-vous choisir? Indiquer le nombre de 1 à 3 correspondant au secteur choisi");
		System.out.println("Secteur 1 : "+ secteurs[0].getNom());
		System.out.println("Secteur 2 : "+ secteurs[1].getNom());
		System.out.println("Secteur 3 : "+ secteurs[2].getNom());
		byte choixsecteur = input.nextLine();
		System.out.println("Vous avez choisi le secteur "+ choixsecteur);
		return choixsecteur;
	}
	
	public byte choixDeLaVille(byte choixsecteur)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Quel secteurs voulez-vous choisir? Indiquer le nombre correspondant à la ville choisie");
		if (choixsecteur == 1)
				{
					System.out.println("Ville 1"+ secteurs[0].getVilles()[0].getNom());
					System.out.println("Ville 2"+ secteurs[0].getVilles()[1].getNom());
					System.out.println("Ville 3"+ secteurs[0].getVilles()[2].getNom());
					System.out.println("Ville 4"+ secteurs[0].getVilles()[3].getNom());
					byte choixville = input.nextLine();
					System.out.println("Vous avez choisi la ville "+ choixville);
					return choixville;
				}
		else if (choixsecteur == 2)
		{
			System.out.println("Ville 1"+ secteurs[1].getVilles()[0].getNom());
			System.out.println("Ville 2"+ secteurs[1].getVilles()[1].getNom());
			System.out.println("Ville 3"+ secteurs[1].getVilles()[2].getNom());
			System.out.println("Ville 4"+ secteurs[1].getVilles()[3].getNom());
			byte choixville = input.nextLine();
			System.out.println("Vous avez choisi la ville "+ choixville);
			return choixville;
		}
		else if (choixsecteur == 3)
		{
			System.out.println("Ville 1"+ secteurs[2].getVilles()[0].getNom());
			System.out.println("Ville 2"+ secteurs[2].getVilles()[1].getNom());
			System.out.println("Ville 3"+ secteurs[2].getVilles()[2].getNom());
			System.out.println("Ville 4"+ secteurs[2].getVilles()[3].getNom());
			byte choixville = input.nextLine();
			System.out.println("Vous avez choisi la ville "+ choixville);
			return choixville;
		}
		
		
		public byte choixDuBatiment(byte choixsecteur,byte choixville)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Quel batiment voulez-vous choisir? Indiquer le nombre correspondant au batiment choisi");
			if (choixsecteur == 1 && choixville ==1)
			{
				System.out.println("Batiment 1 "+ secteurs[0].getVilles()[0].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[0].getVilles()[0].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[0].getVilles()[0].getBatiments().get(2).getNom());
				System.out.println("Batiment 4 "+ secteurs[0].getVilles()[0].getBatiments().get(3).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 1 && choixville ==2)
			{
				System.out.println("Batiment 1 "+ secteurs[0].getVilles()[1].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[0].getVilles()[1].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[0].getVilles()[1].getBatiments().get(2).getNom());
				System.out.println("Batiment 4 "+ secteurs[0].getVilles()[1].getBatiments().get(3).getNom());
				System.out.println("Batiment 5 "+ secteurs[0].getVilles()[1].getBatiments().get(4).getNom());
				System.out.println("Batiment 6 "+ secteurs[0].getVilles()[1].getBatiments().get(5).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			if (choixsecteur == 1 && choixville ==3)
			{
				System.out.println("Batiment 1 "+ secteurs[0].getVilles()[2].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[0].getVilles()[2].getBatiments().get(1).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 1 && choixville ==4)
			{
				System.out.println("Batiment 1 "+ secteurs[0].getVilles()[3].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[0].getVilles()[3].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[0].getVilles()[3].getBatiments().get(2).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 2 && choixville ==1)
			{
				System.out.println("Batiment 1 "+ secteurs[1].getVilles()[0].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[1].getVilles()[0].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[1].getVilles()[0].getBatiments().get(2).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 2 && choixville ==2)
			{
				System.out.println("Batiment 1 "+ secteurs[1].getVilles()[1].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[1].getVilles()[1].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[1].getVilles()[1].getBatiments().get(2).getNom());
				System.out.println("Batiment 4 "+ secteurs[1].getVilles()[1].getBatiments().get(3).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 2 && choixville ==3)
			{
				System.out.println("Batiment 1 "+ secteurs[1].getVilles()[2].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[1].getVilles()[2].getBatiments().get(1).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 2 && choixville ==4)
			{
				System.out.println("Batiment 1 "+ secteurs[1].getVilles()[3].getBatiments().get(0).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 3 && choixville ==1)
			{
				System.out.println("Batiment 1 "+ secteurs[2].getVilles()[0].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[2].getVilles()[0].getBatiments().get(1).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 3 && choixville ==2)
			{
				System.out.println("Batiment 1 "+ secteurs[2].getVilles()[1].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[2].getVilles()[1].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[2].getVilles()[1].getBatiments().get(2).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 3 && choixville ==3)
			{
				System.out.println("Batiment 1 "+ secteurs[2].getVilles()[2].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[2].getVilles()[2].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[2].getVilles()[2].getBatiments().get(2).getNom());
				System.out.println("Batiment 4 "+ secteurs[2].getVilles()[2].getBatiments().get(3).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
			else if (choixsecteur == 3 && choixville ==4)
			{
				System.out.println("Batiment 1 "+ secteurs[2].getVilles()[3].getBatiments().get(0).getNom());
				System.out.println("Batiment 2 "+ secteurs[2].getVilles()[3].getBatiments().get(1).getNom());
				System.out.println("Batiment 3 "+ secteurs[2].getVilles()[3].getBatiments().get(2).getNom());
				System.out.println("Batiment 4 "+ secteurs[2].getVilles()[3].getBatiments().get(3).getNom());
				System.out.println("Batiment 5 "+ secteurs[2].getVilles()[3].getBatiments().get(4).getNom());
				byte choixbat = input.nextLine();
				System.out.println("Vous avez choisi le batiment "+ choixbat);
				return choixbat;
			}
		}

}
