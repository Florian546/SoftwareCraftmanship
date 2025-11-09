import Domain.Stock;
import Domain.ConcreteStock;
import Domain.Investor;
import Domain.IndividualInvestor;
import Domain.InstitutionalInvestor;


public class Main {
    public static void main(String[] args) {
        ConcreteStock apple = new ConcreteStock("AAPL", 150.00);

        new IndividualInvestor("John", apple);
        new InstitutionalInvestor("BigBank Corp", apple);

        apple.setPrice(153.75);
        apple.setPrice(160.20);
    }
}
