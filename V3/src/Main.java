public class Main {
    public static void main(String[] args) {
        StockExchange zurichStockExchange = new ZurichStockExchange();
        StockExchange nyStockExchange = new NYStockExchange();

        Portfolio portfolioA = new Portfolio(zurichStockExchange);
        portfolioA.addStock("Accenture");
        portfolioA.addStock("Google");

        System.out.println("Portfolio Values Zurich: ");
        portfolioA.displayPortfolioValues();

        Portfolio portfolioB = new Portfolio(nyStockExchange);
        portfolioB.addStock("Accenture");
        portfolioB.addStock("Google");

        System.out.println("\nPortfolio Values New York: ");
        portfolioB.displayPortfolioValues();
    }
}