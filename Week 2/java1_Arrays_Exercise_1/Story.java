class Story {

	public static void main(String[] args) {
		Office office = new Office();
		office.saveClues();
		for (int i = 0; i < 3; i++) {
            System.out.println(office.clues[i]);
        }
	}
}
