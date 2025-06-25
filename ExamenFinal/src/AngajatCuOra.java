
public class AngajatCuOra extends Angajat {
	private int oreLuna;
	private double salarPeOra;
	
	public AngajatCuOra(String nume, String prenume, int oreLuna, double salarPeOra) {
		super(nume,prenume);
		this.oreLuna = oreLuna;
		this.salarPeOra = salarPeOra;
	}
	
	public void adaugaOre(int ore) {
		this.oreLuna += ore;
	}
	
	public void schimbaSalarPeora(double nouSalar) {
		this.salarPeOra = nouSalar;
	}
	
	@Override
	public double calculSalar() {
		return oreLuna * salarPeOra;
	}
	
	

}
