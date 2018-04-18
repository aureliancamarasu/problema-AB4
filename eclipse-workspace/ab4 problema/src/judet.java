
public class judet extends tara {

	String nume ;
	
	judet() {
		
	}
	
	judet(String a, String nume) {
		super(a);
		this.nume=nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	void afisare() {
		super.afisare();
		System.out.println("Nume judet "+this.nume);
	}
}
