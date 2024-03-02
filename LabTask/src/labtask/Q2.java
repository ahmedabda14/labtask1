/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;
import java.util.Scanner;
/**
 *
 * @author ahmed
 */
public class Q2 {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
     int space=0;
     int letter = 0;
     int numbers=0;
     int other=0;
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            phrase.toCharArray();
            if (Character.isSpaceChar(i)) {
                space++;
            }
            else if(Character.isDigit(i)){
            numbers++;
        }
            else if (Character.isLetter(i)){
                letter++;
            }
            else
                other++;
        }//end for loop
        
        System.out.println("space count:"+space+"\nDigit count: "+numbers
                +"\n Letter count"+letter+"\nother count: "+other);
    }
}
