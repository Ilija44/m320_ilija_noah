class ZurichStockExchange implements StockExchange {
    @Override
    public double getPrice(String stockSymbol) {
        switch (stockSymbol) {
            case "Accenture":
                return 13000.0;
            case "Google":
                return 1500000.0;
            default:
                return 0.0;
        }
    }
}