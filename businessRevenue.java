/********************************************************************************************
 * @file businessRevenueAI.java
 * @brief This program creates a class that gathers data on business revenue from the user
 * @author Robert Pilgrim
 * @date August 8, 2021
 *******************************************************************************************/
import java.util.Scanner;

public class businessRevenue extends businessExpense{
    private int totalRevenue;
    private int netRevenue;
    protected int numMonths4;
    protected int numMonths5;
    protected int numMonths6;
    protected double sumProfits = 0;
    protected double meanProfits = 0;
//declaration of variables that will be used as the building blocks of the revenue arrays
    public void setName(int tR) {
        totalRevenue = tR;
    }
    @Override
    public void setName2(int profit) {
        netRevenue = profit;
    }
    public int profit(int tR, int tC) {
        return tR - tC;
    }
//(same as cost side) classes not accessed now but will be utilized in future versions of the program
    public String tcInstructions() {
        return "  - Revenue is your total pre-tax income";
    }
//instructs users on how to calculate their company's total revenue (TC)
    public void printInstructions () {
        System.out.println(super.fcInstructions());
        System.out.println(super.vcInstructions());
        System.out.println(this.tcInstructions());
    }
//prints all instructions based on user's familiarity with program
    protected double[] totalRevenueArray;
    public void setTotalRevenueArray(Scanner scnr) {
        numMonths4 = scnr.nextInt();
        this.totalRevenueArray = new double[numMonths4];
    }
//declares and initializes total revenue array
    protected double[] netRevenueArray;
    public void setNetRevenueArray(Scanner scnr) {
        numMonths5 = scnr.nextInt();
        this.netRevenueArray = new double[numMonths5];
    }
//declares and initializes net revenue array
    protected double[] percentChangeArray;
    public void setPercentChangeArray(Scanner scnr) {
        numMonths6 = scnr.nextInt();
        this.percentChangeArray = new double[numMonths6];
    }
//declares and initializes an array to calculate the percent change in the values that populate the net revenue array
    public void getTotalRevenueArray(Scanner scnr) {
        System.out.println("Enter your total revenue (round to nearest hundredths & omit dollar symbol): ");
        for (i = 0; i < totalRevenueArray.length; i++) {
            this.totalRevenueArray[i] = scnr.nextDouble();
        }
    }
//uses user input populate the total revenue array
    public void getNetRevenueArray() {
        for (i = 0; i < netRevenueArray.length; i++) {
            this.netRevenueArray[i] = this.totalRevenueArray[i] - super.totalExpenseArray[i];
        }
        System.out.println("Your profit margin over each month:");
        for (i = 0; i < netRevenueArray.length; i++) {
            System.out.print((i + 1) + ": $" + netRevenueArray[i] + " million, ");
        }
        System.out.println(" ");
    }
//uses the values of the total revenue array plus the values of the total expense array to populate the net revenue array and prints those results to the screen
    public void getMeanProfits() {
        for (i = 0; i < netRevenueArray.length; i++) {
            sumProfits = sumProfits + this.netRevenueArray[i];
            meanProfits = sumProfits / this.netRevenueArray.length;
        }
        System.out.println("Your average profit margin over the months you analyzed is: $" + meanProfits + " million");
    }
//method that calculates the average of net profits and prints that output
    public void getPercentChangeArray() {
        for (i = 1; i < percentChangeArray.length; i++) {
                this.percentChangeArray[i] = ((this.netRevenueArray[i] - this.netRevenueArray[i - 1]) / this.netRevenueArray[i - 1]) * 100;
        }
        System.out.println("Your business' profit margin growth per month:");
        for (i = 1; i < percentChangeArray.length; i++) {
            System.out.print(this.percentChangeArray[i] + "% ");
        }
        System.out.println(" ");
    }
//uses formula to calculate the percent change in the values of the net revenue array; uses those results to populate the percent change array; and prints output to screen
}
