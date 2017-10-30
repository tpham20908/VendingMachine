/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;
import java.util.*;
/**
 *
 * @author 1796137
 */
public class VendingMachine {
  public static void main(String[] args)
  {
    // declare variables item
    char item;
    
    //display menue
    displayMenu();
    //choose item
    item = chooseItem();
    
    System.out.println(item);
  }
  
  
  // define method displayMenu
  public static void displayMenu() 
  {
    System.out.println("1.\tWater Bottle\t\t$1.00");
    System.out.println("2.\tChip     \t\t$1.25");
    System.out.println("3.\tChewing gum\t\t$0.75");
    System.out.println("4.\tCookie bag\t\t$0.50"); // need available called here
  }
  
  // define method chooseItem
  public static char chooseItem()
  {
    char item;
    // instantiate a scanner
    Scanner input = new Scanner(System.in);
    
    do
    {
      // prompt user for input
      System.out.print("Please choose Item number or 0 to quit. ");
      item = input.next().charAt(0);
    }
    while (item != '1' && item != '2' && item != '3' && item != '4' && item != '0');
    
    return item;
  }
}
