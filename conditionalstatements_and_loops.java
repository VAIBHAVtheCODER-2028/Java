import java.util.*;
public class conditionalstatements_and_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//Q1 Write a program to take three numbers as input from the user and print the largest number among them.
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest");
        }
        else if(num2>num3){
            System.out.println("num2 is largest");
        }
        else{
            System.out.println("num3 is largest");
        }

        //we could also have done Math.max(num1,Math.max(num2,num3));

//Q2 Write a program to take a character as input from the user and check whether it is a uppercase or lowercase.
      char ch=sc.next().trim().charAt(0);
      if(ch>='a' && ch<='z'){
          System.out.println("lowercase");
      }
      else{
          System.out.println("uppercase");
      }

//Q3 Write a program to print nth fibonacci number.
    int N=sc.nextInt();
     int a=0;
     int b=1;
     int count=2;
     while(count<=N){
        int temp=b;
        b=b+a;
        a=temp;
        count++;
     }
     System.out.println(b);

//Q4 Write a program to count the number of occurances of a number.
    int n=sc.nextInt();
    int tocheck=sc.nextInt();
    int count=0;
    while(n>0){
        int remainder=n%10;
        if(remainder==tocheck){
            count++;
        }
        n=n/10;
     }
        System.out.println(count);
   }
}
