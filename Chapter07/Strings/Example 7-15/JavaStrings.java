/*
Copyright Ann Barcomb and Emily Marasco, 2021-2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// import java.util.StringTokenizer;

public class JavaStrings {

    public static void main(String[] args) {

        StringTokenizer tokens = new StringTokenizer ("Elephants are mammals.");
        System.out.println("Number of tokens: " + tokens.countTokens());
        while (tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
    }        
}  
