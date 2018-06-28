package evolution;

public class Joueur {
	private byte compteur=0;
	private byte id;
	private String nom;
	private short vie;
	
	public byte getid()
	{
		return this.id;
	}
	
	public void setnom(String nom)
	{
		this.nom=nom;
	}
	
	public String getnom()
	{
		return this.nom;
	}
	
	public short getvie()
	{
		return this.vie;
	}

	public Gentil(String nom, short vie)
	{
		super();
		compteur++;
		this.id=compteur;
		this.nom=nom;3
		this.vie=vie;
	}
	
	public byte attaquer()
	{
		byte degats = 0;
		degats = (byte) (0 + (int)(Math.random() * ((24 - 0) + 1)));
		return degats;
	}
	
	
	public void seFaireTapperDessus(short degats) {
		this.vie = (short) (this.vie - degats);
	}

}
