import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDay16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        try{
            System.out.println(Integer.parseInt(str));
        } catch(NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}