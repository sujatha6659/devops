import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        int s,t,i,j;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("enter the number:");
        for(i=0;i<5;i++)
        a[i]=sc.nextInt();
        for(i=4;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(a[j+1]<a[j])
                {
                    s=a[j+1];
                    a[j+1]=a[j];
                    a[j]=s;
                }
            }
        }
        for(t=0;t<5;t++)
        System.out.print(a[t]);
    }
}
