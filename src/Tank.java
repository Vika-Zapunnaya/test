public class Tank {
    int position = 0;

    public void printPosition() {
        System.out.println("The tank is at " + this.position + " now.");
    }

    public void goForward(int i) {
        position += i;
    }

    public void goBackward(int i) {
        position -= i;
    }
}
