

public abstract class Phone {

    // attributes

    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;


    // Constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // getter

    public String getVersionNumber() {
		return versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public String getRingTone() {
		return ringTone;
    }
    


// setter

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public void setgetBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;

    }

    public void setgetCarrier(String carries) {
        this.carrier = carrier ;
    }

    public void getRingtone(String ringTone) {
        this.ringTone = ringTone ;
    }


    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself

}