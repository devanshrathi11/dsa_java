public class String1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4= new String("Hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str2 == str4); // false
    }  
    
}
