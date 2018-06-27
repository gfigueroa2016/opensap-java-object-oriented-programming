class HelloBoolean {
    public static void main(String[] args) {
    
    // define your variables first, second, third and fourth here.
    // their data type should be boolean.
    // remember to compute the values of third and fourth from the variables first and second.

        boolean first = true;
        boolean second = false;
        
        boolean third = first || second;
        boolean fourth = first && second;
        
        System.out.println(third);
        System.out.println(fourth);

    }
}
