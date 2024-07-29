package chapter30.bridge;

public class StockExchange extends Program{

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progree ...");
        developer.writeCode();

    }
}
