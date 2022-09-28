import java.util.*;
public class Swastik {
   public static void main(String args[]){
       int i,j,mid,val;
       System.out.println("Enter the size ::");
       Scanner sc=new Scanner(System.in);
       val=sc.nextInt();
       if(val%2==1&&val>=15) {
           mid = (val + 1) / 2;
           int half=mid/2;
           for (i = 1; i <= val; i++) {
               for (j = 1; j <= val; j++) {
                   if (i == mid || j == mid || i == 1 && j > mid || j == 1 && i < mid || j == val && i > mid || i == val && j < mid||i==half&&j==half||i==half&&j==(mid+half)||i==(mid+half)&&j==mid||i==(mid+half)&&j==(mid+half)) {
                       System.out.print("* ");

                   } else
                       System.out.print("  ");
               }
               System.out.println();
           }

       }
       else
           System.out.println(" :: wrong input ::");
   }

}
