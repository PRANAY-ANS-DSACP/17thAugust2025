import java.util.*;
public class A_Game_with_Integers 
{
 public static void main(String[] args) {
    Scanner as=new Scanner(System.in);
    int T=as.nextInt();

    for(int t=0;t<T;t++)
    {
        int n=as.nextInt();
        if(n%3==0)
        System.out.println("Second");
        else
        System.out.println("First");
    }
 }   
}