class Story {

	public static void main(String[] args) {
        MathMachine mathMachineBase5 = new MathMachine(5);
        System.out.println(mathMachineBase5.addNumbers(3));
        System.out.println(mathMachineBase5.addNumbers(3,2));
        System.out.println(mathMachineBase5.multiplyNumbers(2));
        System.out.println(mathMachineBase5.multiplyNumbers(1,3));
    }

}
