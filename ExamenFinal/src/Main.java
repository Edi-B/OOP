
public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		AngajatCuSalarFix a1 = new AngajatCuSalarFix("Creanga", "Ion", 3000);
		AngajatCuSalarFix a2 = new AngajatCuSalarFix("Hagi", "Gica", 2500);
		AngajatCuOra b1 = new AngajatCuOra("Eminescu", "Mihai", 150, 15);
		AngajatCuOra b2 = new AngajatCuOra("Arghezi", "Tudor", 160, 25);
		
		firma.angajeaza(a1);
		firma.angajeaza(a2);
		firma.angajeaza(b1);
		firma.angajeaza(b2);
		
		System.out.println("Salariu mediu: " + firma.salariuMediu());
    }

		
}
	
	

