import java.util.Arrays;
import java.util.Scanner;

public class elementaryStatsCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double meanValue;
        double medianValue;
        double modeValue = 0;
        double rangeValue;
        double midRange;
        int n;
        //int N;
        double Q1;
        double Q3;
        double IQR;
        //double outlier = 0;
        int i = 0;
        double sum = 0;

        System.out.print("Enter the size of data set: ");
        n = scnr.nextInt();
        //System.out.print("Enter the size of population: ");
        //N = scnr.nextInt();

        double[] dataSet = new double[n];
        System.out.print("Enter your data set: ");
//sort input data into an array
        for (i = 0; i < dataSet.length; i++) {
            dataSet[i] = scnr.nextDouble();
        }
//code for mean
        for (i = 0; i < dataSet.length; i++) {
            sum = sum + dataSet[i];
        }
        meanValue = sum / n;
        System.out.println("Mean: " + meanValue);
//code for median
        Arrays.sort(dataSet);
        if (dataSet.length % 2 == 0) {
            medianValue = (dataSet[dataSet.length / 2] + dataSet[dataSet.length / 2 - 1]) / 2;
        }
        else {
            medianValue = dataSet[dataSet.length / 2];
        }
        System.out.println("Median: " + medianValue);
//code for mode
        int maxCount = 0;
        int j = 0;
        for (i = 0; i < dataSet.length; ++i) {
            int count = 0;
            for (j = 0; j < dataSet.length; ++j) {
                if (dataSet[j] == dataSet[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                modeValue = dataSet[i];
            }
        }
        System.out.println("Mode : " + modeValue);

//code for max,min, & range (from CSC 112 zyBook 4.5)
        double max = 0;
        double min = 0;
        double currValue;
        double currValue2;
        //max
        for (i = 0; i < dataSet.length; ++i) {
            currValue = dataSet[i];

            if (i == 0) { // First iteration
                max = currValue;
            }
            else if (currValue > max) {
                max = currValue;
            }
        }
        System.out.println("Max: " + max);
        //min
        for (i = 0; i < dataSet.length; ++i) {
            currValue2 = dataSet[i];

            if (i == 0) { // First iteration
                min = currValue2;
            }
            else if (currValue2 > min) {
                min = currValue2;
            }
        }
        System.out.println("Min: " + min);
        //range
        rangeValue = max - min;
        System.out.println("Range: " + rangeValue);
//code for midrange
        midRange = (max + min) / 2;
        System.out.println("Midrange: " + midRange);
//code for first quartile
        if (dataSet.length % 4 == 0) {
            Q1 = (dataSet[dataSet.length / 4] + dataSet[dataSet.length / 4 - 1]) / 2;
        }
        else {
            Q1 = dataSet[dataSet.length / 4];
        }
        System.out.println("First quartile: " + Q1);
//code for third quartile
        if (dataSet.length % 4 == 0) {
            Q3 = (dataSet[dataSet.length - 1] + dataSet[(dataSet.length / 2) + 1]) / 2;
        }
        else {
            Q3 = dataSet[(dataSet.length / 2) + (dataSet.length / 4)];
        }
        System.out.println("Third quartile: " + Q3);
//code for IQR
        IQR = Q3 - Q1;
        System.out.println("Interquartile Range(IQR): " + IQR);
//code for outliers
        double whiskers;
        double lowerBound;
        double upperBound;
        whiskers = IQR * 1.5;
        lowerBound = Q1 - whiskers;
        upperBound = Q3 + whiskers;
        //delete print statements after outlier is coded
        System.out.println("Lower bound: " + lowerBound);
        System.out.println("Upper bound: " + upperBound);
/*
        for (i = 0; i < dataSet.length; ++i) {
            if (dataSet[i] < lowerBound || dataSet[i] > upperBound) {
                outlier = dataSet[i];
                System.out.print("Outliers: " + outlier + ", ");
                System.out.println(" ");
            } else {
                System.out.println("Outliers: None");
            }
        }
*/
//code for sample variance
        double popVarianceSum = 0;
        double popVariance;
        double[] popVarianceFormula = new double[n];
        for (i = 0; i < popVarianceFormula.length; ++i) {
            popVarianceFormula[i] = Math.pow((dataSet[i] - meanValue), 2);
            popVarianceSum = popVarianceSum + popVarianceFormula[i];
        }
        popVariance = popVarianceSum / n;
        System.out.println("Population Variance : " + popVariance);

    }
}
