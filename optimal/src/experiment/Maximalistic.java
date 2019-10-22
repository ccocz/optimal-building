package experiment;

import java.util.List;

public class Maximalistic extends TaskGreedy {

    public Maximalistic(Prices prices, Project project) {
        super(prices, project);
    }

    public Stick findBest(int length) {
        List<Stick> sticks = getPrices().getSticks();
        return sticks.get(sticks.size() - 1);
    }
}
