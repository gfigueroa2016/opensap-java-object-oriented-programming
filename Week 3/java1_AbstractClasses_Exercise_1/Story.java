class Story {

	public static void main(String[] args) {
		CombinationLock lock = new CombinationLock();
		System.out.println(lock.open(1337));
		System.out.println(lock.open(4711));
	}
}
