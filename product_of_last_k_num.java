public class product_of_last_k_num {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(0);
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));
    }
    static class ProductOfNumbers {
        int[] prefix;
        int count;
        public ProductOfNumbers() {
            prefix = new int[40001];
            prefix[0] = 1;
            count = 0;
        }
        public void add(int num) {
            if (num == 0) {
                count = 0;
            } else {
                count++;
                prefix[count] = prefix[count - 1] * num;
            }
        }
        public int getProduct(int k) {
            if (k > count) {
                return 0;
            }
            return prefix[count] / prefix[count - k];
        }
    }
    
}
