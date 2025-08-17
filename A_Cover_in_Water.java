import java.util.*;
public class A_Cover_in_Water
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int T=as.nextInt();

        for(int t=0;t<T;t++)
        {
            int n=as.nextInt();
            //counting max no of continous empty cell
            int maxCountEC=0;

            //total no.of empty cells
            int totEC=0;

            //temporary variable
            int temp=0;
            String s=as.next();
            for(int i=0;i<n;i++)
            {
                char a=s.charAt(i);
                if(a=='.')
                {
                    totEC++;
                    temp++;
                }
                else
                {
                    maxCountEC=Math.max(maxCountEC,temp);
                    temp=0;
                }
            }
            maxCountEC = Math.max(maxCountEC, temp);
            if(maxCountEC>=3)
            System.out.println(2);
            else
            System.out.println(totEC);
        }
    }
}