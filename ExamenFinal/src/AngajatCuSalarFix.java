
public class AngajatCuSalarFix extends Angajat {
	private double salarFix;
	
	public AngajatCuSalarFix(String nume, String prenume, double salarFix) {
		super(nume,prenume);
		this.salarFix = salarFix;
	}
	
	public void schimbaSalarFix(double nouSalar) {
		this.salarFix = nouSalar;
	}

	@Override 
	public double calculSalar() {
		return salarFix;
	}
}

