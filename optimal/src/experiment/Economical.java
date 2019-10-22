package experiment;

public class Economical extends TaskOptimal {

    public Economical(Prices prices, Project project) {
        super(prices, project);
    }

    public boolean compare(Result a, Result b) {
        final int nonInitialized = 0;
        return b.getTotalCost() == nonInitialized || a.getTotalCost() < b.getTotalCost();
    }
}
