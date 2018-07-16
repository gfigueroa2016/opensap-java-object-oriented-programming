class Lock2 extends AbstractLock {
	Lock2(int secretNumber, String secretWord) {
		this.secretNumber = secretNumber;
		this.secretWord = secretWord;
		this.numberOfAttempts = 5;
	}

	@Override
	boolean openWithSecretNumber(int number, int attempt) {
		if (number == secretNumber && attempt < numberOfAttempts) {
			return true;
		}
		else {
		    return false;
		}
	}
	
	@Override
	boolean openWithSecretWord(String word) {
		if (word == secretWord) {
			return false;
		}
		else {
		    return true;
		}
	}
}
