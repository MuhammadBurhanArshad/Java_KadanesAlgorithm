public class KadanesAlgorithm {
    public int maxSubArraySum(int[] values){
        int maxCurrent = values[0];
        int maxGlobal = values[0];

        for(int i = 1; i < values.length; i++){
            if(maxCurrent + values[i] > values[i]){
                maxCurrent += values[i];
            }else{
                maxCurrent = values[i];
            }

            if(maxCurrent > maxGlobal){
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
}
