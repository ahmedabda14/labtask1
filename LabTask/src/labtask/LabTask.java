/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask;
import java.util.Scanner;
/**
 *
 * @author ahmed
 */
public class LabTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
System.out.println("enter change in cents");
int change = scanner.nextInt();

int halfdollars=change/50;
change%=50;
int quarters=change/25;
change%=25;
int dimes=change/10;
change%=10;
int nickels=change%=5;
change%=5;
int pennies=change;

System.out.println(halfdollars+" "+quarters+" " +dimes+" "+nickels+" "+pennies);

    }
    
}
