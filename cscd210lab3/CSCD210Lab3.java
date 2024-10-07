package cscd210lab3;
import java.util.Scanner;
public class CSCD210Lab3
{
   public static final int YEAR = 2023;
   
   public static void main(final String [] args)
   {
      Scanner kb = new Scanner(System.in);
      
      char ltr;
      String name;
      int birthYear;
      
      System.out.println("Please enter a single alphabetic lowercased character: ");
      ltr = kb.nextLine().strip().charAt(0);
      
      System.out.println("Please enter your full name: ");
      name = kb.nextLine().strip(); 
      
      System.out.println("Please enter your birth year: ");
      birthYear = kb.nextInt().strip();
      //birthYear = Integer.parseInt(kb.nextLine().strip());
      
      System.out.println("The first letter of your name is: " + name.charAt(0));
      System.out.println("The last letter of your name is: " + name.charAt(name.length()-1));
      System.out.println("Your middle name is: " + name.substring(name.indexOf(" "),name.lastIndexOf(" ")));
      
      String full;
      full = name.substring(name.lastIndexOf(" ")) + YEAR + birthYear;
      
      // System.out.println( "hashcode stuff is" + (lastName.hashCode() + YEAR + birthYear));
      
      System.out.println(full.hashCode());
      System.out.println(name.replace(Character.toLowerCase(ltr),'?').replace(Character.toUpperCase(ltr),'?'));
    }
}