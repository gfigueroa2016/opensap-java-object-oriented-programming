import java.util.HashMap;

class Door {
    HashMap<String, AccessCode> doorCodes = new HashMap<>();
    public HashMap<String, AccessCode> getDoorCodes() {
        return doorCodes;
    }
    public void addDoorKey(String s, AccessCode ac) {
        doorCodes.put(s, ac);
    }
    public void useCode(String s) {
        if (doorCodes.containsKey(s)) {
            AccessCode ac = doorCodes.get(s);
            int num = ac.getNumberOfTimesUsed();
            ac.setNumberOfTimesUsed(num +  1);
            if (ac.getNumberOfTimesUsed() > 2) {
                ac.setValid(false);
                System.out.println("AccessCode no longer valid");
            } else {
            System.out.println("AccessCode valid");
            }
        } else {
            System.out.println("AccessCode invalid");
        }
    }
}
