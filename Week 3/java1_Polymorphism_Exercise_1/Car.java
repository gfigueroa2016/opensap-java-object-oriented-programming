class Car extends Vehicle {
    public void printMovementDescription() {
        printDrive();
    }
    private void printDrive() {
        System.out.println("I drive on roads");
    }
}