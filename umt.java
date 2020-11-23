import java.util.*;

public class Main{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        System.out.println("Select your status:\n 1. Single\n 2. Married Jointly\n 3. Married Seperately\n 4. Head of household");
        
        int status = input.nextInt();
        
        System.out.print("Input your income: ");
        double income = input.nextInt();
        
        double tax = 0;
        
        String t_status = "";
        
        switch(status){
            case 1:
                t_status = "Single";
                if(income >= 0 && income <= 8350)
                    tax = 10;
                else if(income >= 8351 && income <= 33950)
                    tax = 15;
                else if(income >= 33951 && income <= 82250)
                    tax = 25;
                else if(income >= 82251 && income <= 171550)
                    tax = 28;
                else if(income >= 171551 && income <= 372950)
                    tax = 33;
                else if(income >= 372951)
                    tax = 35;
                else {
                    System.out.println("Invalid income input");
                }
                break;
            case 2:
                t_status = "Married Jointly";
                if(income >= 0 && income <= 16700)
                    tax = 10;
                else if(income >= 16701 && income <= 67900)
                    tax = 15;
                else if(income >= 67901 && income <= 137050)
                    tax = 25;
                else if(income >= 137051 && income <= 208850)
                    tax = 28;
                else if(income >= 208851 && income <= 372950)
                    tax = 33;
                else if(income >= 372951)
                    tax = 35;
                else {
                    System.out.println("Invalid income input");
                }
                break;
            case 3:
                t_status = "Married Seperately";
                if(income >= 0 && income <= 8350)
                    tax = 10;
                else if(income >= 8351 && income <= 33950)
                    tax = 15;
                else if(income >= 33951 && income <= 68525)
                    tax = 25;
                else if(income >= 68526 && income <= 104425)
                    tax = 28;
                else if(income >= 104426 && income <= 186475)
                    tax = 33;
                else if(income >= 186476)
                    tax = 35;
                else {
                    System.out.println("Invalid income input");
                }
                break;
            case 4:
                t_status = "Head of household";
                if(income >= 0 && income <= 11950)
                    tax = 10;
                else if(income >= 11951 && income <= 45500)
                    tax = 15;
                else if(income >= 45501 && income <= 117450)
                    tax = 25;
                else if(income >= 117451 && income <= 190200)
                    tax = 28;
                else if(income >= 190201 && income <= 372950)
                    tax = 33;
                else if(income >= 372951)
                    tax = 35;
                else {
                    System.out.println("Invalid income input");
                }
                break;
            default:
                System.out.println("Invalid status input");
                break;
        }
        double payable_tax = (income *(tax/100));
        
        System.out.println("Your status is "+t_status);
        System.out.println("Your income is "+income);
        System.out.println("You have to pay "+payable_tax+" in tax");
     }
}
