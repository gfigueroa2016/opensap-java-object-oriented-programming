abstract public class AbstractLock {
    int secretNumber;
    String secretWord;
    int numberOfAttempts;
    int number;
    int attempt;
    String word;
    abstract boolean openWithSecretNumber(int number, int attempt);
    abstract boolean openWithSecretWord(String word);
}
