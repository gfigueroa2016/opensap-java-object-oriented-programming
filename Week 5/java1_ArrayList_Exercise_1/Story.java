class Story {

	 public static void main(String args[]) {
        Bookshelf shelf = new Bookshelf();
        for (int i = 0; i < shelf.getClues().size(); i++) {
            System.out.println(shelf.getClue(i));
        }
    }
}