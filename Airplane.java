package temaAirplane;

public class Airplane {
    private String planeID;
    private int totalEnginePower;

    
    public Airplane(String planeID, int totalEnginePower) {
    	
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
        
    }

    
    public String getPlaneID() {
        return planeID;
    }

    
    public int getTotalEnginePower() {
        return totalEnginePower;
    }

    
    public void takeOff() {
        System.out.println(getPlaneID() + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }

    
    public void fly() {
        System.out.println(getPlaneID() + " - Flying");
    }

    
    public void land() {
        System.out.println(getPlaneID() + " - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}
