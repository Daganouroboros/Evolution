package evolution;
import java.util.Iterator;

public class MainClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secteur[] secteurs = genererSecteurs();
		System.out.println(secteurs[1].getVilles()[1].getBatiments().get(1).getNom());
		
		Menu.presentation();
		Menu.Secteurocc();
		Menu.Villeocc();
		Menu.Batimentocc();
		
	
	}
	
	private static Secteur[] genererSecteurs() {
		byte totalSecteur = 3;
		
		Secteur[] secteurs = new Secteur[totalSecteur];
		
		secteurs[0] = new Secteur("Ouroboros");
		secteurs[0].addVille(0, new Ville("Domanicus"));
		secteurs[0].addVille(1, new Ville("Tourne"));
		secteurs[0].addVille(2, new Ville("Calion"));
		secteurs[0].addVille(3, new Ville("Shimini"));

		secteurs[1] = new Secteur("Karaz Ankor");
		secteurs[1].addVille(0, new Ville("Zhufar"));
		secteurs[1].addVille(1, new Ville("Karak Kadrin"));
		secteurs[1].addVille(2, new Ville("Gantuk"));
		secteurs[1].addVille(3, new Ville("Ungor"));

		secteurs[2] = new Secteur("Gollum");
		secteurs[2].addVille(0, new Ville("Minas Tirith"));
		secteurs[2].addVille(1, new Ville("Isengard"));
		secteurs[2].addVille(2, new Ville("Fondcombe"));
		secteurs[2].addVille(3, new Ville("Le Mordor"));
		
		secteurs[0].getVilles()[0].addBatiment(new Batiments(Ressource.BIERE, "La Taverne à Lulu #0", (short) 5, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiments(Ressource.STEAK_DE_LICORNE, "C'est trop génial #0", (short) 10, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiments(Ressource.POUDRE_DE_FEE, "Le moulin de Peter Pan #0", (short) 50, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiments(Ressource.OR, "Pas cher, pas cher #0", (short) 100, null));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "L'antre de Smaug  #0", (short) 1000, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.ANNEAU_UNIQUE, "Les copains de Frodon #0", (short) 1000, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.SABRE_LASER, "Viens du côté obscur, on a des cookies #0", (short) 1500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.SABRE_LASER, "Le petit jedi #0", (short) 500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.BIERE, "La Taverne à Lulu #1", (short) 500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiments(Ressource.OR, "Banque Gobelin #0", (short) 1000, null));
		
		secteurs[0].getVilles()[2].addBatiment(new Batiments(Ressource.POUDRE_DE_FEE, "Le moulin de Peter Pan #1", (short) 1000, null));
		secteurs[0].getVilles()[2].addBatiment(new Batiments(Ressource.POUDRE_DE_FEE, "Le moulin de Peter Pan#2", (short) 1000, null));
		
		secteurs[0].getVilles()[3].addBatiment(new Batiments(Ressource.OR, "Pas cher, pas cher #1", (short) 1000, null));
		secteurs[0].getVilles()[3].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "Attention chaud devant #0", (short) 1000, null));
		secteurs[0].getVilles()[3].addBatiment(new Batiments(Ressource.BIERE, "La brasserie du Phénix  #0", (short) 1000, null));
		
		secteurs[1].getVilles()[0].addBatiment(new Batiments(Ressource.ANNEAU_UNIQUE, "La fabrique de Sauron #0", (short) 2000, null));
		secteurs[1].getVilles()[0].addBatiment(new Batiments(Ressource.SABRE_LASER, "Viens du côté obscur, on a des cookies #1", (short) 2000, null));
		secteurs[1].getVilles()[0].addBatiment(new Batiments(Ressource.STEAK_DE_LICORNE, "C'est trop génial #1", (short) 2000, null));
		
		secteurs[1].getVilles()[1].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "L'antre de Smaug #1", (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiments(Ressource.BIERE, "La Taverne à Lulu #2", (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiments(Ressource.ANNEAU_UNIQUE, "Les copains de Frodon #1", (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiments(Ressource.OR, "Banque Gobelin #1", (short) 5000, null));
		
		secteurs[1].getVilles()[2].addBatiment(new Batiments(Ressource.POUDRE_DE_FEE, "Le moulin de Peter Pan#3", (short) 5000, null));
		secteurs[1].getVilles()[2].addBatiment(new Batiments(Ressource.SABRE_LASER, "Le petit jedi #1", (short) 5000, null));
		
		secteurs[1].getVilles()[3].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "Attention chaud devant #1", (short) 5000, null));
		
		secteurs[2].getVilles()[0].addBatiment(new Batiments(Ressource.SABRE_LASER, "Le petit jedi #2", (short) 10000, null));
		secteurs[2].getVilles()[0].addBatiment(new Batiments(Ressource.ANNEAU_UNIQUE, "La fabrique de Sauron #1", (short) 20000, null));
		
		secteurs[2].getVilles()[1].addBatiment(new Batiments(Ressource.BIERE, "La brasserie du Phénix  #1", (short) 20000, null));
		secteurs[2].getVilles()[1].addBatiment(new Batiments(Ressource.SABRE_LASER, "Le petit jedi #3", (short) 20000, null));
		secteurs[2].getVilles()[1].addBatiment(new Batiments(Ressource.STEAK_DE_LICORNE, "C'est trop génial #2", (short) 20000, null));
		
		secteurs[2].getVilles()[2].addBatiment(new Batiments(Ressource.ANNEAU_UNIQUE, "Les copains de Frodon #2", (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiments(Ressource.POUDRE_DE_FEE, "Le moulin de Peter Pan#4", (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiments(Ressource.OR, "Banque Gobelin #2", (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "Attention chaud devant #2", (short) 50000, null));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiments(Ressource.STEAK_DE_LICORNE, "C'est trop génial #3", (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiments(Ressource.OR, "Pas cher, pas cher #2", (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiments(Ressource.BEBE_DRAGON, "L'antre de Smaug #2", (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiments(Ressource.BIERE, "La brasserie du Phénix  #2", (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiments(Ressource.SABRE_LASER, "Viens du côté obscur, on a des cookies #2", (short) 100000, null));
		
		return secteurs;
	}

}
