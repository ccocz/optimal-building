package experiment;

import java.util.Scanner;

public class Input {

    private final Prices prices;
    private final Project project;
    private final String operation;

    public Input() {
        prices = new Prices();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int length, cost;
        for (int i = 0; i < n; i++) {
            length = in.nextInt();
            cost = in.nextInt();
            prices.addPrice(new Stick(length, cost));
        }
        project = new Project();
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            length = in.nextInt();
            project.addProject(length);
        }
        operation = in.next();
    }

    public Prices getPrices() {
        return prices;
    }

    public Project getProject() {
        return project;
    }

    public String getOperation() {
        return operation;
    }
}
