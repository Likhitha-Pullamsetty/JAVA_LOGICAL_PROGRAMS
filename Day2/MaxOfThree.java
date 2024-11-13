import java.util.*;
class MaxOfThree{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
System.out.println("Enter b number");
int b=sc.nextInt();
System.out.println("Enter c number");
int c=sc.nextInt();
if(a>b && a>c)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
System.out.println(a+"is maximum number than"+b+"and"+c);
else if(b>a && b>c)
System.out.println(b+"is maximum number than"+c+"and"+a);
else
System.out.println(c+"is maximum number than"+b+"and"+a);

}
}
