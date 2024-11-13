import java.util.*;
class MaxOfTwo{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
System.out.println("Enter b number");
int b=sc.nextInt();
if(a>b)
System.out.println(a+"is maximum number than"+b);
else
System.out.println(b+"is maximum number than"+a);
}
}
