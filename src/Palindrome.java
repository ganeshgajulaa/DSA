public class Palindrome {
    public static void main(String[] args) {
        String str = "122121";
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}