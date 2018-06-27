class MathMachine {

    int basenumber;
    
    MathMachine(int basenumber){
        this.basenumber = basenumber;
    }
    
    int addNumbers(int number1){
        return basenumber + number1;
    }
    
    int multiplyNumbers(int number1){
        return basenumber * number1;
    }
    
    int addNumbers(int number1, int number2){
        return basenumber + number1 + number2;
    }
    
    int multiplyNumbers(int number1, int number2){
        return basenumber * number1 * number2;
    }

}
