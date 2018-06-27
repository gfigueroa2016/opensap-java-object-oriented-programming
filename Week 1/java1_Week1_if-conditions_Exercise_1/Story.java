class Story {
    /* The following output shall be created:
    * I have nothing to do.
    * I am pleased to do that for you.
    * I am pleased to do that for you.
    * I recharge my battery.
    * I am pleased to do that for you.
    * Duke! I need a break... Please ask again later!
    * I am pleased to do that for you.
    * I am pleased to do that for you. */

    public static void main(String[] args) {
        Robot robot = new Robot();
        
        robot.hasTask = false;
        robot.batteryEmpty = false;
        robot.taskCounter = 0;
        
        // Robot has no task and therefore can't help Duke
        robot.helpDuke();
        
        // Robot has a task und helps Duke twice
        robot.hasTask = true;
        robot.helpDuke();
        robot.helpDuke();
        
        // battery is empty, he recharges
        robot.batteryEmpty = true;
        robot.helpDuke();
        
        // battery is full again. The robot helps Duke again and takes a break in between.
        robot.helpDuke();
        robot.helpDuke();
        robot.helpDuke();
        robot.helpDuke();
    }
}
