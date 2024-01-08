class NYStockExchange implements StockExchange {
    @Override
    public double getPrice(String stockSymbol) {
        switch (stockSymbol) {
            case "Accenture":
                return 1600.0;
            case "Google":
                return 2500000.0;
            default:
                return 0.0;
        }
        }
}