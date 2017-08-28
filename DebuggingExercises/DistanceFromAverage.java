import javax.swing.*;

/**
 * Created by jc260799 on 28/08/17.
 */
public class DistanceFromAverage {
    public static void main(String[] args) {
        String userNumString;
        int userNum, val = 0;
        int count = 0, average = 0;
        double awayfromaverage = 0;
        double[] enterednums = new double[999];
        final double MIN = 1.00;
        final double MAX = 20.99;
        int x;
        userNumString = JOptionPane.showInputDialog(null,
                "Enter a number between "  + MIN + " and " + MAX +  " inclusive");
        userNum = Integer.parseInt(userNumString);
        while(userNum == 999){
            System.out.println("ERROR");
            userNumString = JOptionPane.showInputDialog(null,
                    "Enter a number between "  + MIN + " and " + MAX +  " inclusive");
            userNum = Integer.parseInt(userNumString);
        }
        while(userNum != 999) {
            val+= userNum;
            enterednums[count] = userNum;
            count += 1;
            while (userNum < MIN || userNum > MAX) {
                userNumString = JOptionPane.showInputDialog(null,
                        "Number out of range" +
                                "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
                userNum = Integer.parseInt(userNumString);
            }
            userNumString = JOptionPane.showInputDialog(null,
                    "Enter a number between "  + MIN + " and " + MAX +  " inclusive");
            userNum = Integer.parseInt(userNumString);
        }

        average = val / count;

        for(x = 0; x <= count - 1; ++x)
        {
            if((average - enterednums[x]) < 0)
                awayfromaverage = Math.abs(average - enterednums[x]);
            else
                awayfromaverage = (average - enterednums[x]);
            System.out.println(enterednums[x] + " is " + awayfromaverage + " away from the average");
        }
    }
}
