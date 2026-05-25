public class CoinTester
{
    public static void main(String[] args) {

          Coins numCoins = new Coins(3, 2 , 1, 4);
            numCoins.bankValue();

            numCoins.addQuarter();

            numCoins.addQuarter();

            numCoins.addDime();

            numCoins.addPenny();

            numCoins.addPenny();

            numCoins.addPenny();

            numCoins.bankCount();

            numCoins.bankValue();
    }
}