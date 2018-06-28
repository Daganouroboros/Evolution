package evolution;

public class Mechant {
	private byte compteur=0;
	private byte id;
	private String nom;
	private short vie;
	private byte degats = 0;
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

	public Mechant(String nom, short vie)
	{
		super();
		compteur++;
		this.id=compteur;
		this.nom=nom;
		this.vie=vie;
	}
	
	public byte attaquer()
	{
		this.degats = (byte) (0 + (int)(Math.random() * ((24 - 0) + 1)));
		return this.degats;
	}
	
	
	public void seFaireTapperDessus() {
		this.vie = (short) (this.vie - this.degats);
	}
	
}
