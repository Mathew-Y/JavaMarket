package crypto_market.market;

import crypto_market.Constants;
import crypto_market.crypto.Cryptocurrency;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class Market {

    public HashMap<String, Cryptocurrency> cryptoMap;

//    public Cryptocurrency[] cryptos;

    public Market(HashMap<String, Cryptocurrency> cryptoMap) {
        this.cryptoMap = cryptoMap;

//        for (Cryptocurrency currCrypto : cryptos) {
//            this.cryptoMap.put(currCrypto.getSymbol(), currCrypto);
//        }

//        this.cryptos = cryptos;
    }

    public Cryptocurrency getCryptocurrency(String symbol) {

        Cryptocurrency c = this.cryptoMap.get(symbol);
        return c;
    }

//
//    public Cryptocurrency getCryptocurrency(String symbol) {
//
//        for (Cryptocurrency currentCrypto : this.cryptos) {
//
//            System.out.println(currentCrypto);
//
//            if (currentCrypto.getSymbol().equals(symbol)) {
//                return currentCrypto;
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        Constants.Market[] marketsForBTC = {Constants.Market.ETH};
        HashMap<String, Cryptocurrency> cryptoMap = new HashMap<String, Cryptocurrency>();


        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\Evan\\IdeaProjects\\Market\\src\\static\\cryptocurrencies.json"));

            JSONObject jsonObject = (JSONObject) obj;

            Set<String> keys = jsonObject.keySet();
            for (String symbol : keys) {
                Cryptocurrency c = new Cryptocurrency((String) jsonObject.get(symbol), symbol, marketsForBTC);
                cryptoMap.put(symbol, c);
            }

            Market binance = new Market(cryptoMap);
            int cryptoMapSize = binance.cryptoMap.size();

            System.out.println("There are " + cryptoMapSize + " cryptos loaded into binance at the moment.");


            Cryptocurrency found = binance.getCryptocurrency("ADI");
            System.out.println(found);

        } catch(Exception e) {
            e.printStackTrace();
        }



//        Cryptocurrency btc = new Cryptocurrency("Bitcoin", "BTC", marketsForBTC);
//        Cryptocurrency btc1 = new Cryptocurrency("Ethereum", "ETH", marketsForBTC);
//        Cryptocurrency btc2 = new Cryptocurrency("Litecoin", "LTC", marketsForBTC);
//        Cryptocurrency btc3 = new Cryptocurrency("Dogecoin", "DOGE", marketsForBTC);
//        Cryptocurrency btc4 = new Cryptocurrency("Tron", "TRON", marketsForBTC);
//
//        Cryptocurrency[] cryptos = {btc, btc1, btc2, btc3, btc4};
//        Market market = new Market(cryptos);
//        Cryptocurrency foundCrypto = market.getCryptocurrencyFast("DOGE");
//        System.out.println("Found the cryptocurrency: " + foundCrypto);
    }
}
