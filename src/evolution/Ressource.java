package evolution;



public enum Ressource
{

	BIERE(1, "BIERE"),
	STEAK_DE_LICORNE(2, "STEAK DE LICORNE"),
	POUDRE_DE_FEE(3, "POUDRE DE FEE"),
	OR(4, "OR"),
	BEBE_DRAGON(5, "BEBE DRAGON"),
	ANNEAU_UNIQUE(6, "ANNEAU UNIQUE"),
	SABRE_LASER(7, "SABRE LASER");
	
	private int id;
	private String nom;
	Ressource()
	{
		
	}
	Ressource(int id, String nom) 
	{
		this.id = id;
		this.nom = nom;
	}
}

