class Story {

	public static void main(String[] args) {
		EVilCulator evilCulator = new EVilCulator();
		System.out.println(evilCulator.addition(2, 3));
		System.out.println(evilCulator.addition(2, 3, 5));
		System.out.println(evilCulator.addition(2.0, 3.2));
		System.out.println(evilCulator.addition(2.0, 3.2, 0.6));
	}

}
