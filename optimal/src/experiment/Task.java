package experiment;

public abstract class Task {

    private final Prices prices;
    private final Project project;
    private Result result;

    public Task(Prices prices, Project project) {
        this.prices = prices;
        this.project = project;
        this.result = new Result();
    }

    public void printResult() {
        System.out.println(result.getTotalCost());
        System.out.println(result.getTotalWasted());
        for (Component x : result.getComponents()) {
            System.out.print(x.getTotalSum());
            for (int y : x.getComponents()) {
                System.out.print(" " + y);
            }
            System.out.println();
        }
    }

    public Project getProject() {
        return project;
    }

    public Prices getPrices() {
        return prices;
    }

    public void addResultCost(int x) {
        result.plusTotalCost(x);
    }

    public void addResultWasted(int x) {
        result.plusTotalWasted(x);
    }

    public void addResultComponent(Component x) {
        result.addComponent(x);
    }

    public Result getResult() {
        return result;
    }

    public void changeResult(Result result) {
        this.result = result;
    }

    public abstract void solve();
}
