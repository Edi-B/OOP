
public class Birou {

	
	    private int latime;
	    private int lungime;
	    private int inaltime;
	    private Sertar sertar1;
	    private Sertar sertar2; 


	    public Birou(int latime, int lungime, int inaltime, Sertar sertar1, Sertar sertar2) {
	        this.latime = latime;
	        this.lungime = lungime;
	        this.inaltime = inaltime;
	        this.sertar1 = sertar1;
	        this.sertar2 = sertar2;
	    }

	    public void tipareste() {
	        System.out.println("Birou " + latime + " " + lungime + " " + inaltime);
	        sertar1.tipareste();
	        sertar2.tipareste();
	    }
	

	}


