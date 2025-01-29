public class freq_arr {
   public static void main(String[] args) {
         int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
         int[] freq = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
              if (freq[i] == -1) {
                continue;
              }
              int count = 1;
              for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                     count++;
                     freq[j] = -1;
                }
              }
              freq[i] = count;
         }
         for (int i = 0; i < arr.length; i++) {
              if (freq[i] != -1) {
                System.out.println(arr[i] + " occurs " + freq[i] + " times");
              }
         }
   } 
}
