import java.util.Scanner;

public class A_Halloumi_Boxes
{
    public static void main(String[] args) 
    {
        Scanner as=new Scanner(System.in);
        int T=as.nextInt();

        for(int t=0;t<T;t++)
        {
            int n=as.nextInt();
            int k=as.nextInt();
            boolean ans=false;

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            arr[i]=as.nextInt();

            //We will check if the array is sorted also
            int i;
            for(i=0;i<n-1;i++)
            if(arr[i]>arr[i+1])
            break;
            if(k>1 || i==n-1)
            ans=true;

            if(ans)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
