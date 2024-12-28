/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act4Vehicle;

import java.util.Scanner;

/**
 *
 * @author iStruck
 */
public class MainClass {
    public static Scanner scan = new Scanner(System.in);
    public static Truck[] h;
    
    public static void main(String[] args) {
        
        mm();
    }
  
    public static void mm()
    {
        String ans;
        while(true)
        {
            menu();
            ans = answerMen();
            menuAns(ans);
        }
    }
    
    public static void menu()
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\t\tWelcome to Car Rental Shop!!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\tChoose what type of Vehicle you Want To Rent");
        System.out.println("\tCar");
        System.out.println("\tMotorcycle");
        System.out.println("\tTruck");
        System.out.println("\tQuit");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Enter your Choice here: ");
    }
    
    public static String answerMen()
    {
        String S;
        S = scan.next();
        return S;
    }
    
    public static void menuAns(String ans)
    {
        h = new Truck[0];
        if(ans.equalsIgnoreCase("Car"))
        {
            System.out.println("hello");
        }
        else if(ans.equalsIgnoreCase("Truck"))
        {
            System.out.print(h[0].toString());
            
        }
        else if(ans.equalsIgnoreCase("Motorcycle") || ans.equalsIgnoreCase("Motor"))
        {
            
        }
        else if(ans.equalsIgnoreCase("Quit"))
        {
            System.out.println("GoodBye!!");
            System.exit(0);
        }
        else
        {
            System.out.println("Error 101! Not on the List!!");
            mm();
        }
    }
    
}
