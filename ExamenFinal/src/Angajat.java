
public abstract class Angajat {
	private String nume;
	private String prenume;
	
	public Angajat(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	}
	
	public String getNume() {
		return nume;
	}


	public String getPrenume() {
		return prenume;
	}
 

	public abstract double calculSalar();
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Angajat) {
			Angajat a = (Angajat) obj;
			return this.nume.equals(a.nume);
		}
		return false;
	}

}
