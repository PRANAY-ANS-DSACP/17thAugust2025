import java.util.*;
public class A_Line_Trip
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int T=as.nextInt();
        
        for(int t=0;t<T;t++)
        {
            int n=as.nextInt();
            int x=as.nextInt();

            int gas[]=new int[n];

            for(int i=0;i<n;i++)
            gas[i]=as.nextInt();

            int maxDif=gas[0];

            //Now find the max distance between two consecitive station
            for(int i=0;i<n-1;i++)
            maxDif=Math.max(gas[i+1]-gas[i],maxDif);

            //Now comparing with the last station back to last station
            maxDif=Math.max(maxDif,(x-gas[n-1])*2);

            System.out.println(maxDif);
        }
    }
}