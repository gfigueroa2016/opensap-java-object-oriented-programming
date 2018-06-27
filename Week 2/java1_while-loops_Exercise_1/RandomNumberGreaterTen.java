class RandomNumberGreaterTen {

    RandomNumber rand = new RandomNumber();
    int randomNumber;
    int greaterTen() {
        while (true){
            randomNumber = rand.giveNumber();
            if (randomNumber > 10) {
                return randomNumber;
            }
        }
    }
}
