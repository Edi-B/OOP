
public class Sertar {
	
	    private int latime;
	    private int lungime;
	    private int inaltime;

	    public Sertar(int latime, int lungime, int inaltime) {
	        this.latime = latime;
	        this.lungime = lungime;
	        this.inaltime = inaltime;
	    }

	    public void tipareste() {
	        System.out.println("Sertar " + latime + " " + lungime + " " + inaltime);
	    }
	}


	public class Main {
	    public static void main(String[] args) {
	        Sertar sertar1 = new Sertar(40, 50, 20);
	        Sertar sertar2 = new Sertar(45, 55, 25);
	        Birou birou = new Birou(120, 60, 75, sertar1, sertar2);

	        birou.tipareste();
	    }
	

	



