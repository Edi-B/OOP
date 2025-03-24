
public class Carte {
	 private int numarPagini;
	
	 
	 public Carte(int numarPagini) {
	        this.numarPagini = numarPagini;
	    }

	    public boolean esteIdentica(Carte altaCarte) {
	        return this.numarPagini == altaCarte.numarPagini;
	    }

	    public static void main(String[] args) {
	        Carte carte1 = new Carte(300);
	        Carte carte2 = new Carte(300);
	        Carte carte3 = new Carte(250);

	        System.out.println("Cartea 1 și Cartea 2 sunt identice? " + carte1.esteIdentica(carte2));
	        System.out.println("Cartea 1 și Cartea 3 sunt identice? " + carte1.esteIdentica(carte3));
	    }
}
	
