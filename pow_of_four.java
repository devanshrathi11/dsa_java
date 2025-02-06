public class pow_of_four {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }
    
    public static void main(String[] args) {
        pow_of_four obj = new pow_of_four();
        System.out.println(obj.isPowerOfFour(16));
        System.out.println(obj.isPowerOfFour(5));
    }
    
    
}
