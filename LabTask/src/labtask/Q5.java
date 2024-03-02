/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**
 *Consider a class hierarchy for vehicles, with a base class Vehicle and two
derived classes Car and Motorcycle.
• Implement a constructor in the Vehicle class to initialize common
attributes like make, model, and year. Include the necessary parameters in
the constructor.
• Overload a method drive() in the Vehicle class to handle different driving
conditions. The method should accept parameters for a generic driving
scenario (no specific parameters), highway driving (speed parameter), and
off-road driving (terrain type parameter).
• Override the drive() method in both the Car and Motorcycle classes to
provide specific implementations for driving a car and a motorcycle,
respectively. Include parameters specific to each type of vehicle.
• Create instances of the Car and Motorcycle classes using the constructor
and demonstrate the use of both the overloaded and overridden drive()
methods.
 * @author ahmed
 */

class vehicule{
    String make;
    String model;
    int year;

    public vehicule(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void drive(){
           System.out.println("make: "+make+"model: "+model+"year: "+year);
    }
    public void drive(int speed){
        System.out.println("make: "+make+"model: "+model+"year: "+year+"speed: "+
                speed);
    }
        public void drive(String terrain){
     System.out.println("make: "+make+"model: "+model+"year: "+year+"speed: "+
                terrain);
        }
    
}
class car extends vehicule{

    public car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive(String terrain) {
        super.drive(terrain); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void drive(int speed) {
        super.drive(speed); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void drive() {
        super.drive(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
}
class motorcycle extends vehicule{

    public motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive(String terrain) {
        super.drive(terrain); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void drive(int speed) {
        super.drive(speed); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void drive() {
        super.drive(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    motorcycle a = new motorcycle("qw","12",2003);
    
}
public class Q5 {
    public static void main(String[]Args){

    }
}
