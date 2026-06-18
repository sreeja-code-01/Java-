print no.s:-
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}
---------
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
            System.out.println(fact);
    }
}
-----------

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int a=sc.nextInt();
        int fact=1;
        int i=1;
        int sum=0;
        while(i<=a)
        {
            sum=sum+i;
            i=i+1;
        }
                System.out.println(sum);
    }
}
---------
