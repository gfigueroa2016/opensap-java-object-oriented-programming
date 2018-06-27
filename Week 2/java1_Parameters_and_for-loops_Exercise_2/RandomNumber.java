import java.util.Random;

class RandomNumber {
    SecretRandomNumber rand;
    
    public RandomNumber() {
        rand = new SecretRandomNumber();
    }

    int giveNumber() {
        return rand.giveNumber();
    }
}