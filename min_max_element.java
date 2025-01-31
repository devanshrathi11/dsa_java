public class min_max_element {
    public static void main(String[] args) {
        int[] arr = { 1,4,56,76,5,6,7,99};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
