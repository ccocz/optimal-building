package experiment;

import java.util.List;

public abstract class TaskGreedy extends Task {

    public TaskGreedy(Prices prices, Project project) {
        super(prices, project);
    }

    public abstract Stick findBest(int length);

    public void solve() {
        List<Integer> missing = getProject().getLengths();
        while (!missing.isEmpty()){
            int tallest = missing.get(missing.size() - 1);
            Stick stick = findBest(tallest);
            Component c = new Component(stick.getLength(), tallest);
            missing.remove(missing.size() - 1);
            for (int j = missing.size() - 1; j >= 0; j--) {
                if (c.wastedSize() > missing.get(j)) {
                    c.addLength(missing.get(j));
                    missing.remove(j);
                }
            }
            addResultCost(stick.getCost());
            addResultWasted(c.wastedSize());
            addResultComponent(c);
        }
        printResult();
    }
}
