package Domain;

public class IndividualInvestor implements Investor {
    private String name;

    public IndividualInvestor(String name, Stock stock) {
        this.name = name;
        stock.addInvestor(this);
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Individual Investor " + name +
                " received update: " + stockSymbol + " is now $" + price);
    }
}
