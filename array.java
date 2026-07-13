#arrange elements in ascending order
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elemnets: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted elements");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
----------------------
    #arrange elements in desecding order
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elemnets: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted elements");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
------------
//palindrome
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a no: ");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            
      System.out.println("is palindrome");
        }
        else
        System.out.println("not a palindrome");
    }
}

------------
