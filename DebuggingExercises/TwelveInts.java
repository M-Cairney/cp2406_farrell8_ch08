/**
 * Created by jc260799 on 28/08/17.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
        int y;
        for(y = 0; y < 11; ++y)
        {
            System.out.print(ints[y] + " ");
        }
        for(y = 11; y >=0; --y){
            System.out.print(ints[y] + " ");
        }
    }
}
