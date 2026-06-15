wap to check even or odd no.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even no.");
        } else {
            System.out.println("odd no.");
        }
   }
}
----------
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int sum = s1 + s2 + s3;
        int avg = sum / 3;

        if (avg > 90) {
            System.out.println("grade A+");
        }
        else if (avg > 80 && avg <= 90) {
            System.out.println("grade A");
        }
        else if (avg > 70 && avg <= 80) {
            System.out.println("grade B");
        }
        else {
            System.out.println("grade C");
        }
    }
}
wap to check whether a person can vote
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >=18) {
            System.out.println("vote.");
        } else {
            System.out.println("cannot vote");
        }
    }
}
-----------
wap to check a no. is pos or neg:-
import java.util.Scanner;
 public class Check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    if(a>=0)
    {
        System.out.println("pos no.");
    }
    else
    {
        System.out.println("neg no.");
    }

    }
    }
-----------
wap to check whether a no. is divisible by 3:
import java.util.Scanner;
 public class Check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    if(a%3==0)
    {
        System.out.println("divisible by 3");
    }
    else
    {
        System.out.println("not Divisibleby 3.");
    }

    }
    }
-----------

