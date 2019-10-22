package experiment;

public class Ecological extends TaskOptimal {

    public Ecological (Prices prices, Project project) {
        super(prices, project);
    }

    public boolean compare(Result a, Result b) {
        final int nonInitialized = 0;
        return b.getTotalWasted() == nonInitialized || a.getTotalWasted() < b.getTotalWasted();
    }
}
