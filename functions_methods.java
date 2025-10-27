public class functions_methods {

//String return type function
    public static void main(String[] args) {
        System.out.println(greet()); 
    }

    static String greet(){
        String str="Hello, welcome to the Java functions and methods tutorial!";
        return str;
    }


//pass the value of numbers when you are calling the function
    public static void main(String[] args) {
        int answer=sum(5,10);
        System.out.println(answer);
    }
    static int sum(int a , int b){
        return a+b;
    }


//Swapping dilema (numbers will not be swapped)
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
}
