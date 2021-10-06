/********************************************************************************************
 * @file businessExpenseAI.java
 * @brief This program creates a class that gathers data on business expenses from the user
 * @author Robert Pilgrim
 * @date August 8, 2021
 *******************************************************************************************/
import java.util.Scanner;

public class businessExpense {
    protected int totalCost;
    private int fixedCost;
    private int variableCost;
    protected int numMonths;
    protected int numMonths2;
    protected int numMonths3;
//declaration of variables that will be used as the building blocks of the cost arrays
    Scanner scnr = new Scanner(System.in);

    public void setName1(int tC) {
        totalCost = tC;
    }
    public void setName2(int fC) {
        fixedCost = fC;
    }
    public void setName3(int vC) {
        variableCost = vC;
    }
    public int tC(int fC, int vC) {
        return fC + vC;
    }
//classes not accessed now but will be utilized in future versions of the program
    public String setMode(String beginner) {
        System.out.print("Are you new to analystAI? (Just type yes or no) ");
        return beginner;
    }
//establishes user's familiarity with the program in order to decide whether or not to print further context of program's components
    public String fcInstructions() {
//instructs users on how to calculate their company's fixed cost (FC)
        return "  - Fixed cost are those costs that do not change with an increase or decrease in production (ie. rent, office space, insurance, etc.)";
    }
    public String vcInstructions() {
//instructs users on how to calculate/ their company's variable cost (VC)
        return "  - Variable cost are those costs that do change with an increase or decrease in production (ie. labor, raw materials, etc.)";
    }
    public void printInfo() {
        System.out.println("All data will be entered on a full month basis");
        System.out.println("Please include revenue and costs going back to the last 60 months (approx. 5 years)");
        System.out.println("Remember that dollar values are in the context of a million (ie. 1.0 = $1,000,000");
    }
//gives the user basic guidelines to follow when inputting their information
protected double[] fixedExpenseArray;
    public void setFixedExpenseArray(Scanner scnr) {
        numMonths = scnr.nextInt();
        this.fixedExpenseArray = new double[numMonths];
    }
//declaration and initialization of the fixed expense array
    protected double[] variableExpenseArray;
    public void setVariableExpenseArray(Scanner scnr) {
        numMonths2 = scnr.nextInt();
        this.variableExpenseArray = new double[numMonths2];
    }
//declaration and initialization of the variable expense array
    protected double[] totalExpenseArray;
    public void setTotalExpenseArray(Scanner scnr) {
        numMonths3 = scnr.nextInt();
        this.totalExpenseArray = new double[numMonths3];
    }
//declaration and initialization of the variable expense array
    public int i = 0;
//declaration of the index that will be used in all of the program's arrays
    public void getVariableExpenseArray(Scanner scnr) {
        System.out.println("Enter your variable costs (round to nearest hundredths & omit dollar symbol): ");
        for (i = 0; i < variableExpenseArray.length; i++) {
            this.variableExpenseArray[i] = scnr.nextDouble();
        }
    }
//uses user input to populate the variable expense array
    public void getFixedExpenseArray(Scanner scnr) {
        System.out.println("Enter your fixed costs (round to nearest hundredths & omit dollar symbol): ");
        for (i = 0; i < fixedExpenseArray.length; i++) {
            this.fixedExpenseArray[i] = scnr.nextDouble();
        }
    }
//uses user input to populate the fixed expense array
    public void getTotalExpenseArray() {
        for (i = 0; i < totalExpenseArray.length; i++) {
            totalExpenseArray[i] = this.variableExpenseArray[i] + this.fixedExpenseArray[i];
        }
        System.out.println("Your total cost over each month:");
        for (i = 0; i < totalExpenseArray.length; i++) {
            System.out.print((i + 1) + ": $" + totalExpenseArray[i] + " million, ");
        }
        System.out.println(" ");
    }
//uses the values of the fixed expense array plus the values of the variable expense array to populate the total expense array and prints those results to the screen
    public void askMonths() {
        System.out.print("Please enter the number of months you would you like to analyze: ");
    }
//method to print a question that gets repeated numerous time in the code
}
