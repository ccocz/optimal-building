package experiment;

public class Stick {

    private final int length;
    private final int cost;

    public Stick(int length, int cost) {
        this.length = length;
        this.cost = cost;
    }

    public int getLength() {
        return length;
    }

    public int getCost() {
        return cost;
    }
}