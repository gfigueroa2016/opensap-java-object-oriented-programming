class Lock1 extends AbstractLock {
	Lock1(int secretNumber, String secretWord) {
		this.secretNumber = secretNumber;
		this.secretWord = secretWord;
	}

    @Override
	boolean openWithSecretNumber(int number, int attempt) {
		if (number == secretNumber && attempt < numberOfAttempts) {
			return false;
		}
		else {
		    return true;
		}
	}

	@Override
	boolean openWithSecretWord(String word) {
		if (word == secretWord) {
			return true;
		}
		else {
		    return false;
		}
	}
}
