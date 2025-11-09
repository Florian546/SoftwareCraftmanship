package Domain;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {

    private String symbol;
    private double price;
    private List<Investor> investors;

    public ConcreteStock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    @Override
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(symbol, price);
        }
    }

    // When changing the stock price, notify all subscribers
    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyInvestors();
    }

    // Optional getter
    public double getPrice() {
        return price;
    }
}
