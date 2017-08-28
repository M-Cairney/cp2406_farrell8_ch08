// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0;
      int x;
      int count = 0;
      int average = 0;
      for(x = 0; x < someNums.length; ++x) {
          tot += someNums[x];
          count += 1;
      }
      average = tot / count;
      System.out.println("Sum is " + tot);
      System.out.println("Average is " + average);
   }
}
