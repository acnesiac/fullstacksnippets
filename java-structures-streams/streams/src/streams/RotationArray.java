package streams;

import java.util.StringTokenizer;

public class RotationArray {
    public static void main(String[] args) {
        String [] strarray = {"hello","master"};
        String rotateme = "rotateme";
        StringTokenizer t = new StringTokenizer(rotateme);
        int i = t.countTokens();
        char[] chars = rotateme.toCharArray();
        char[] rotatedchars = new char[chars.length];

        for (int j = chars.length-1; j>=0 ;j--) {
            System.out.println(chars[j]);
        }

    }
}
