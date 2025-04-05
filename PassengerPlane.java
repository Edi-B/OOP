package temaAirplane;

public class PassengerPlane extends Airplane {
	
    private int maxPassengers;

    public PassengerPlane(String planeID, int totalEnginePower, int maxPassengers) {
    	
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    
    public int getMaxPassengers() {
        return maxPassengers;
    }
}

