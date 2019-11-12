//Hit compile and run to see a sample output.
//Read values from stdin, do NOT hard code input.
package  com.ds;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceCodility {


            public static void main(String args[] ) throws Exception {
                String thisLine = null;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    String s = thisLine;
                    char [] c = thisLine.toCharArray();
                    int counter = 0;
                    char temp = ' ';
                    int min =  Integer.MAX_VALUE;
                    for(int i = 0 ; i < c.length ; i ++){
                        char value = c[i];
                        temp = value;
                        if ( temp == value ){
                            counter ++;
                        }
                        if ( counter < min){
                            min = counter;
                        }
                    }

                }
            }
        }
