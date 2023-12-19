package Array;

public class BuySellStock {
    public static int buysellstock(int price[]){

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i< price.length; i++){
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }

            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = {100 ,180 ,260 ,310 ,40 ,535 ,695} ;
        System.out.println(buysellstock(price));
    }
    
}
