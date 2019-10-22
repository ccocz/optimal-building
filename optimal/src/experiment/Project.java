package experiment;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final List<Integer> lengths;

    public Project() {
        lengths = new ArrayList<>();
    }

    public void addProject(int a) {
        lengths.add(a);
    }

    public List<Integer> getLengths() {
        return lengths;
    }
}
