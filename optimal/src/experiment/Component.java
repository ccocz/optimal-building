package experiment;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private final int totalSum;
    private int currentSum;
    private final List<Integer> components;

    public Component(int totalSum, int currentSum) {
        this.totalSum = totalSum;
        this.currentSum = currentSum;
        components = new ArrayList<>();
        components.add(currentSum);
    }

    public void addLength(int length) {
        currentSum += length;
        components.add(length);
    }

    public int getTotalSum() {
        return totalSum;
    }

    public List<Integer> getComponents() {
        return components;
    }

    public int wastedSize() {
        return totalSum - currentSum;
    }
}
