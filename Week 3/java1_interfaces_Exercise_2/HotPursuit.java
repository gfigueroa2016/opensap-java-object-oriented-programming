public class HotPursuit {
    Flyable[] chasers = new Flyable[3];
    public void chase() {
        for(int i = 0; i < 3; i++) {
            chasers[i].fly();
        }
    }
}
