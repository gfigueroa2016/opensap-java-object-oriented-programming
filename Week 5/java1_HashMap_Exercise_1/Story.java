class Story {

	public static void main(String args[]) {
		Door door = new Door();
		AccessCode accessCodeDoor1 = new AccessCode(1, "12.02.2003");
		AccessCode accessCodeDoor2 = new AccessCode(2, "23.02.2016");

		door.addDoorKey("superSafePassword", accessCodeDoor1);
		door.addDoorKey("parrotCake", accessCodeDoor2);

		door.useCode("superSafePassword");
		door.useCode("parrotCake");
		door.useCode("Eric");
	}
}
