// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      int count = 0;
      String[] array = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP +" when you want to stop");

      while(!(entry.equals(STOP))) {
         array[count] = entry;
         System.out.println(array[count]);
         count += 1;
         entry = JOptionPane.showInputDialog(null,
                 "Enter any word\n" + "Enter " + STOP +" when you want to stop");
      }
      for(y = count - 1; y >= 0; --y)
      {
         System.out.println(array[y]);
         message.append(array[y]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

