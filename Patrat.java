package tema7;

class Patrat {
    private int latura;

 
    public Patrat() {
        this.latura = 10;
    }


    public Patrat(int latura) {
        this.latura = latura;
    }

  
    public int getAria() {
        return latura * latura;
    }

   
    
    public String toString() {
        return "Patrat " + latura + " Aria " + getAria();
    }

    public static void main(String[] args) {
        Patrat p1 = new Patrat();
        Patrat p2 = new Patrat(5);
        Patrat p3 = new Patrat(12);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
