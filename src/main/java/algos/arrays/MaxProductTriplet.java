package algos.arrays;

public class MaxProductTriplet {

    public static void main(String[] args) {
        int product=new MaxProductTriplet().findMaxproduct(new int[]{10, 3, 5, 6, 20});
        System.out.println("Product= "+product);
    }

    public int findMaxproduct(int[] arrs){

        int length = arrs.length;

        if(length<3){
            return (getProduct(arrs));
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int current : arrs) {
            if (current > firstLargest) {
                int temp=firstLargest;
                firstLargest = current;
                int temp1=secondLargest;
                secondLargest=temp;
                thirdLargest=temp1;
            }
            else if (current > secondLargest) {
                int temp=secondLargest;
                secondLargest = current;
                thirdLargest=temp;
            }
            else if (current > thirdLargest) {
                thirdLargest = current;
            }

        }

        System.out.println("First Largest="+firstLargest);
        System.out.println("Second Largest="+secondLargest);
        System.out.println("Third Largest="+thirdLargest);


        return (firstLargest*secondLargest*thirdLargest);
    }

    public int getProduct(int[] arrs){

        int product = 1;

        for(int i:arrs){
            product*=i;
        }
        return product;
    }
}
