class Car extends Automobile {
    public void makeNoise(){
        System.out.println("Wrrooom!");
    }
    public void makeNoise(String noise){
        System.out.println(noise);
    }
    @Override
    public void drive() {
        printDrive();
    }
    private void printDrive() {
        System.out.println("I am doing a road trip");
    }

}