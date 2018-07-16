class Story {
    public static void main(String[] args) {
        Car car = new Car();
        car.setRadioFrequency(107.9);
        System.out.println("The radio is tuned to " + car.getRadioFrequency());
        car.drive();
        
        if (car.getRemainingFuel() < 3) {
            car.refuel();
            System.out.println("After refueling the car has " + car.getRemainingFuel() + " liters of fuel left.");
        }
    }
}
