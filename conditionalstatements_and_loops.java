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

//Q5 Write a program to print whether a number is even or odd, also take input from the user.
    int N=sc.nextInt();
    if(N%2==0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");         
    }

//Q6  Take name as input and print a greeting message for that particular name.
    String name=sc.nextLine();
    System.out.println(name+" "+"have a great day!");  

//Q7 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    float P=sc.nextFloat();
    float T=sc.nextFloat();
    float R=sc.nextFloat();
    System.out.println((P*T*R)/100);  

//Q8 To find out whether the given String is Palindrome or not.
    String str=sc.nextLine();
    String newstr=str;
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
        reverse=reverse+str.charAt(i);
    }
    if(reverse.equals(newstr)){
        System.out.println("Pallendome");
    }
    else{
        System.out.println("Not a Pallendome");
    }   

//Q9 To find Armstrong Number between two given number.
     int first=sc.nextInt();
     int Last=sc.nextInt();
     for(int i=first;i<=Last;i++){
        int sum=0;
        int digit=0;
        int temp=i; //used to store original value of i
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=i; //reassigning original value to temp

        //need another while loop to calculate sum of powers of digits
        while(temp>0){
        int remainder=temp%10;
        sum=sum+(int)Math.pow(remainder,digit);
        temp=temp/10;
        }
        if(sum==i){
            System.out.println(i);
        }
    }
  }
}
