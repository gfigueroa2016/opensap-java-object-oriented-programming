class Story {
	public static void main(String args[]) {
		SecretMessenger messenger = new SecretMessenger();
		messenger.retrieveMessage("wrong_pw");
		messenger.retrieveMessage("taradiddle");
	}
}
