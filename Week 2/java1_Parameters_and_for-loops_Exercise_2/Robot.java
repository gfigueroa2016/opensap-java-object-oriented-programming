class Robot {
    String sentence = "I can speak!";
    RandomNumber rand = new RandomNumber();
    public void speakSeveralTimes(int randomNumber){
        for(int i=0; i<randomNumber;i++){
            System.out.println(sentence);
        }
    }
    public void speak(){
        int randomNumber = rand.giveNumber();
        speakSeveralTimes(randomNumber);
    }
}
