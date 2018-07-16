class Story {
	public static void main(String[] args) {
		OldWaterPlane oldWaterPlane = new OldWaterPlane();
		WaterPlane newWaterPlane = new WaterPlane();
		oldWaterPlane.splashdown();
		newWaterPlane.splashdown();
		System.out.println(oldWaterPlane.getFlightDetails());
		System.out.println(newWaterPlane.getFlightDetails());
	}
}
