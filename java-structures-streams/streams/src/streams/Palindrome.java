package streams;

public class Palindrome {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("helloworld");
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
    }
}
