import java.util.ArrayList;
import java.util.List;

class Portfolio {
    private StockExchange stockExchange;
    private List<String> stocks;

    public Portfolio(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
        this.stocks = new ArrayList<>();
    }

    public void addStock(String stockSymbol) {
        stocks.add(stockSymbol);
    }

    public void displayPortfolioValues() {
        for (String stockSymbol : stocks) {
            double stockPrice = stockExchange.getPrice(stockSymbol);

            System.out.println("Stock: " + stockSymbol + ", Price: " + stockPrice);
        }
    }
}