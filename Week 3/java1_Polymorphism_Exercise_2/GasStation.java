class GasStation {
    public int refuelVehicle(Vehicle vehicle) {
        vehicle.remainingFuel = vehicle.remainingFuel + 7;
        return vehicle.remainingFuel;
    }
}
