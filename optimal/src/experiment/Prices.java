package experiment;

import java.util.ArrayList;
import java.util.List;

public class Prices {

    private final List<Stick> Sticks;

    public Prices() {
        Sticks = new ArrayList<>();
    }

    public void addPrice(Stick a) {
        Sticks.add(a);
    }

    public List<Stick> getSticks() {
        return Sticks;
    }
}
