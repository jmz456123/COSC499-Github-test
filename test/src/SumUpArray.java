public class SumUpArray {

    public int sumUpArray(int[] array) {
        int sum=0;
        
        for(int item:array) {
            sum+=item;
        }
        
        
        return sum;
    }
}