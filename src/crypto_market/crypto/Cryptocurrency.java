package crypto_market.crypto;


import crypto_market.Constants;

import java.util.Arrays;

public class Cryptocurrency {

    private String name;
    private String symbol;
    private Constants.Market[] markets;

    public Cryptocurrency(String name, String symbol, Constants.Market[] markets) {
        this.name = name;
        this.symbol = symbol;
        this.markets = markets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Constants.Market[] getMarkets() {
        return markets;
    }

    public void setMarkets(Constants.Market[] markets) {
        this.markets = markets;
    }

    @Override
    public String toString() {
        return "Cryptocurrency{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", markets=" + Arrays.toString(markets) +
                '}';
    }

    public static void main(String[] args) {
        // {type} {var name} = {value};
        // {type} {var name} = new {type}(parameters);
        Constants.Market[] ethMarkets = {Constants.Market.BTC, Constants.Market.LTC};
        Cryptocurrency eth = new Cryptocurrency("Ethereum", "ETH", ethMarkets);
    }

}
