class Car {
    private int remainingFuel = 2;
    private double radioFrequency;

    public double getRadioFrequency() {
        return radioFrequency;
    }

    public void setRadioFrequency(Double radioFrequency) {
        this.radioFrequency = radioFrequency;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void refuel() {
        remainingFuel=10;
    }

    public void drive() {
        System.out.println(burnFuel());
    }

    private String burnFuel() {
        remainingFuel--;
        return "Wrooom wroom";
    }
}
