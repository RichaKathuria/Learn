package algos.arrays;

public class BuyAndSellStocks {

    public static void main(String[] args) {

        int profit = new BuyAndSellStocks().findMaxProfit(new int[]{1,2,3,4,5});
        System.out.println("The profit is: "+profit);
    }

    public int findMaxProfit(int[] arr){
        int maxProfit = 0;

        int length = arr.length;

        if(length<2){
            return maxProfit;
        }

        int low = arr[0];
        int high = arr[0];
        int last = arr[0];

        boolean hasStocks = false;
        int profit = 0;
        int buy = 0;
        int sell = 0;

        for(int i=1; i<length; i++){

            int current = arr[i];
            if(current<low){
                low=current;
            }

            if(current>last && !hasStocks){
                buy = low;
                hasStocks = true;
                low=0;
                high=current;
            }

            if(current>high){
                high = current;
            }

            if(current<last && hasStocks){
                sell = high;
                System.out.println("Buying at "+buy+ " and selling at "+sell);
                profit = sell-buy;
                System.out.println("The profit made is "+profit);
                hasStocks = false;
                high=0;
                low=current;
            }

            last = current;
            System.out.println("Initial MaxProfit="+ maxProfit);
            System.out.println("Adding profit = "+profit);
            maxProfit=maxProfit+profit;
            profit = 0;
            System.out.println("Now the maxprofit is "+maxProfit);
            System.out.println("**************************************************");

        }

        if(hasStocks && arr[length-1]==high){
            sell=arr[length-1];
            profit=sell-buy;
            maxProfit=maxProfit+profit;
        }

        return maxProfit;
    }

}
