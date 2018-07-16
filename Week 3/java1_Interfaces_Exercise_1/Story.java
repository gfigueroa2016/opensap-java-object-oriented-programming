public class Story {

	public static void main(String[] args) {
		Flyable plane = new Plane();		
		Flyable drone = new Drone();		
		Flyable odin = new Raven();
		plane.fly();
		drone.fly();
		odin.fly();
	}

}
