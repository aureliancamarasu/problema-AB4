
public class tara {

	private String nume ;
	
	tara() {
		
	}
	
	tara(String a) {
		
		this.nume=a;
	
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	void afisare() {
		System.out.println("Tara nume "+this.nume);
	}
}
