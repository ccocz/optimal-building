package experiment;

import java.util.List;

public class Minimalistic extends TaskGreedy {

    public Minimalistic(Prices prices, Project project) {
        super(prices, project);
    }

    public Stick findBest(int length) {
        List<Stick> sticks = getPrices().getSticks();
        int l = 0, r = sticks.size() - 1;
        int mid;
        while (l < r) {
            mid = (l + r) >> 1;
            if (sticks.get(mid).getLength() < length) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return sticks.get(l);
    }
}
