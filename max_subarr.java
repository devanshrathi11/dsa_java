public class max_subarr {
    public static void main(String[] args) {
        int[] arr = {2,3,-6,1,2,3,-4,2,7};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
    
}
