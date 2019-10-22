package experiment;

public abstract class TaskOptimal extends Task {

    public TaskOptimal(Prices prices, Project project) {
        super(prices, project);
    }

    public abstract boolean compare(Result a, Result b);

    private void findBest(int last, int[] which, int PricesSize, int ProjectSize) {
        if (last == ProjectSize) {
            Result current = new Result();
            final int visited = -1;
            for (int i = 0; i < PricesSize; i++) {
                for (int j = ProjectSize - 1; j >= 0; j--) {
                    if (which[j] == i) {
                        Component c = new Component(getPrices().getSticks().get(i).getLength(),
                                getProject().getLengths().get(j));
                        which[j] = visited;
                        for (int k = j - 1; k >= 0; k--) {
                            if (which[k] == i) {
                                if (c.wastedSize() >= getProject().getLengths().get(k)) {
                                    c.addLength(getProject().getLengths().get(k));
                                    which[k] = visited;
                                }
                            }
                        }
                        current.addComponent(c);
                        current.plusTotalCost(getPrices().getSticks().get(i).getCost());
                        current.plusTotalWasted(c.wastedSize());
                    }
                }
                for (int j = 0; j < ProjectSize; j++) {
                    if (which[j] == visited) {
                        which[j] = i;
                    }
                }
            }
            if (compare(current, getResult())) {
                changeResult(current);
            }
        } else {
            for (int i = 0; i < PricesSize; i++) {
                if (getProject().getLengths().get(last) <= getPrices().getSticks().get(i).getLength()) {
                    which[last] = i;
                    findBest(last + 1, which, PricesSize, ProjectSize);
                }
            }
        }
    }

    public void solve() {
        final int start = 0;
        findBest(start, new int[(getProject().getLengths().size())], getPrices().getSticks().size(),
                getProject().getLengths().size());
        printResult();
    }
}
