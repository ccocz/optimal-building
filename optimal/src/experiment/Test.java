package experiment;

public class Test {

    public static void main(String[] args) {
        Input input = new Input();
        Task task;
        switch (input.getOperation()) {
            case "minimalistyczna":
                task = new Minimalistic(input.getPrices(), input.getProject());
                task.solve();
                break;
            case "maksymalistyczna":
                task = new Maximalistic(input.getPrices(), input.getProject());
                task.solve();
                break;
            case "ekonomiczna":
                task = new Economical(input.getPrices(), input.getProject());
                task.solve();
                break;
            case "ekologiczna":
                task = new Ecological(input.getPrices(), input.getProject());
                task.solve();
                break;
        }
    }
}