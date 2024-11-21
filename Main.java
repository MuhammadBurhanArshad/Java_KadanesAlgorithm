class Main{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,-4,1,7,2,8,9,3,4,6};
        
        KadanesAlgorithm kAlgorithm = new KadanesAlgorithm();

        System.out.println("The maximum sum is: " + kAlgorithm.maxSubArraySum(array));
    }
}