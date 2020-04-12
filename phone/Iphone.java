
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
    	String ringer = getRingTone();
		return ringer;
    }
    
    public String unlock() {
		return "Finger print recognized.";
    }
    @Override
    public void displayInfo() {
    	System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");          
    }
}