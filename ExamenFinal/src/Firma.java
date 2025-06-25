import java.util.ArrayList;

public class Firma {
	private ArrayList<Angajat> angajati = new ArrayList<>();
	
	public boolean angajeaza(Angajat a) {
		for(Angajat ang : angajati) {
			if(ang.equals(a)) {
				return false;
			}
		}
		angajati.add(a);
		return true;
	}
	
	public double salariuMediu() {
		if(angajati.size() == 0) return 0;
		double suma = 0;
		for(Angajat a : angajati) {
			suma += a.calculSalar();
			
		}
		return suma / angajati.size();
	}

}
