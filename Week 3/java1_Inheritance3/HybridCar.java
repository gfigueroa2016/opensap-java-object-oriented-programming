class HybridCar extends Car {
    int spareBatteryReach = 200;
    
    public int giveTotalBatteryReach() {
        int baseReach = getReach();
        return baseReach + spareBatteryReach;
    }
    
    
    
}
