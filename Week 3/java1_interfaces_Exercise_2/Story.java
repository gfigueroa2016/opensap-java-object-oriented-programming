public class Story {

	public static void main(String[] args) {
		HotPursuit hotPursuit = new HotPursuit();
		Raven odin = new Raven();		
		Drone drone = new Drone();		
		Plane plane = new Plane();
        hotPursuit.chasers[0] = odin;
        hotPursuit.chasers[1] = drone;
        hotPursuit.chasers[2] = plane;
        
        hotPursuit.chase();
	}

}
