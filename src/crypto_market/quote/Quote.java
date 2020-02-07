package crypto_market.quote;

import crypto_market.Constants;


public class Quote {

    private double bid;
    private double ask;
    private double last;
    private double high;
    private double low;
    private double volume;
    private Constants.Market market;

    public Quote(double bid, double ask, double last, double high, double low, double volume, Constants.Market market) {
        this.bid = bid;
        this.ask = ask;
        this.last = last;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.market = market;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Constants.Market getMarket() {
        return market;
    }

    public void setMarket(Constants.Market market) {
        this.market = market;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "bid=" + bid +
                ", ask=" + ask +
                ", last=" + last +
                ", high=" + high +
                ", low=" + low +
                ", volume=" + volume +
                ", market=" + market +
                '}';
    }

    public static void main(String[] args) {
        Quote eth = new Quote(0.022393, 0.022405, 0.022405,0.022405,0.022405,0.022405,Constants.Market.BTC);
        System.out.println(eth);
    }


}
