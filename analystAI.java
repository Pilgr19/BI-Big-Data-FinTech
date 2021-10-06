/*********************************************************************************************************************
 * @file analystAI.java
 * @brief This program gathers business data from the user and gives analytical information to inform decision-making
 * @author Robert Pilgrim
 * @date August 8, 2021
 ********************************************************************************************************************/
import java.util.Scanner;

public class analystAI {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        businessRevenue myBiz = new businessRevenue();
        //gains access to the business expense and business revenue classes
        String beginner;
        //declares the variable beginner to run the setMode method
        System.out.println("Welcome to analystAI- combining the power of FinTech and Big Data to help grow your business!");
        //program's mission statement
        myBiz.setMode("beginner");
        beginner = scnr.next();
        //determines user familiarity with program
        if (beginner.equals("yes")) {
            System.out.println("Please read the following before continuing:");
            myBiz.printInstructions();
            myBiz.printInfo();
        }
        else if (beginner.equals("no")) {
            myBiz.printInfo();
        }
        else {
            System.out.println("Please restart program to continue. Goodbye.");
            System.exit(0);
        }
        //decides how much information to print based on user's familiarity with program
        myBiz.askMonths();
        myBiz.setFixedExpenseArray(scnr);
        myBiz.getFixedExpenseArray(scnr);
        //prompts the user to populate the fixed expense array
        myBiz.askMonths();
        myBiz.setVariableExpenseArray(scnr);
        myBiz.getVariableExpenseArray(scnr);
        //prompts the user to populate the variable expense array
        myBiz.askMonths();
        myBiz.setTotalExpenseArray(scnr);
        myBiz.getTotalExpenseArray();
        //calculates and outputs the total expense array based on user input for the fixed expense array and the variable expense array
        myBiz.askMonths();
        myBiz.setTotalRevenueArray(scnr);
        myBiz.getTotalRevenueArray(scnr);
        //prompts the user to populate the total revenue array
        myBiz.askMonths();
        myBiz.setNetRevenueArray(scnr);
        myBiz.getNetRevenueArray();
        //calculates and outputs the net revenue array based on total revenue array and the total expense array
        myBiz.getMeanProfits();
        //calculates and outputs average net profits
        myBiz.askMonths();
        myBiz.setPercentChangeArray(scnr);
        myBiz.getPercentChangeArray();
        //calculates and outputs the percent change array based on the net revenue array
        System.out.println(" ");
        System.out.println("Recommendations: consultantAI coming soon!");
        //future program additions include strategy consulting for the upper management of the business
    }
}







