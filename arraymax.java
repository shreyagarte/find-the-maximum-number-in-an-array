//find the maximum number in an array//
import java.io.*;
import java.util.*;

public class arraymax
{
public static void main(String args[])
{
 int a[]=new int[5];
int i,max=0;
System.out.println("Enter  five number");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
max=a[0];
for(i=0;i<5;i++)
{
if(a[i]>=max)
{
 max=a[i];
}
}
System.out.println("maximum number of array is" +max);
}
}
/*input= Enter five number
         2,5,7,9,4
output= maximum number of array is 9 */
 