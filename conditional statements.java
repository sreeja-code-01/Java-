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
switch cases;-
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  switch(a)
  {
      case 1:
          System.out.print("sunday");
          break;
  
  case 2:
      
        System.out.println("monday.");
        break;
    
    case 3:
      
        System.out.println("tuesday");
        break;
    
    case 4:
      
        System.out.println("Wednesday");
        break;
    
    case 5:
      
        System.out.println("Thursday.");
        break;
    
    case 6:
      
        System.out.println("Friday");
        break;
      
    case 7:
      
        System.out.println("Saturday");
        break;
    
    default:
    System.out.println("invalid");
    }
   }
--------    
enter month
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
-------
