
public class oras extends judet {

	String nume ;
	
	oras() {
		
	}
	
	oras(String a , String b, String c)
	{
		super(a,b);
		this.nume=c;
}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	void afisare() {
	     super.afisare();
	     System.out.println("Nume tara "+this.nume);
	}
	}
