package crypto_market.crypto;


import crypto_market.Constants;

public class Cryptocurrency {

    private String name;
    private String symbol;
    private Constants.Market[] markets;

    Cryptocurrency(String name, String symbol, Constants.Market[] markets) {
        this.name = name;
        this.symbol = symbol;
        this.markets = markets;
    }





    public static void main(String[] args) {
        // {type} {var name} = {value};
        // {type} {var name} = new {type}(parameters);
        Constants.Market[] ethMarkets = {Constants.Market.BTC, Constants.Market.LTC};
        Cryptocurrency eth = new Cryptocurrency("Ethereum", "ETH", ethMarkets);
    }

}
