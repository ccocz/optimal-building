package experiment;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private long totalCost;
    private long totalWasted;
    private List<Component> components;

    public Result() {
        totalCost = 0;
        totalWasted = 0;
        components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void plusTotalCost(int x) {
        this.totalCost += x;
    }

    public void plusTotalWasted(int x) {
        this.totalWasted += x;
    }

    public List<Component> getComponents() {
        return components;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public long getTotalWasted() {
        return totalWasted;
    }
}
