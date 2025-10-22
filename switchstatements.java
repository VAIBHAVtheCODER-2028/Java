import java.util.*;
public class switchstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
//Type 1 Method 1        
        String fruit=sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("Sweet Red fruit");
                break;
            case "Banana":
                System.out.println("A yellow fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;           
        }

//Type 1 Method 2 
        String fruit=sc.next();
        switch(fruit){
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("Sweet Red fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            default: -> System.out.println("Please enter a valid fruit");
        }
        
//Type 2 Method 1
        int day=sc.nextInt();
         switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;    
        }

//Type 2 Method 2
        int day=sc.nextInt();
         switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
         } 
        
//Nested switch statement
        int empId=sc.nextInt();
        String department=sc.next();
        switch(empId){
            case 1:
                System.out.println("Ajay");
                break;
            case 2:
                System.out.println("Vijay");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter a valid employee id");
                break;         
        }

//Enhanced nested switch statement
        int empId=sc.nextInt();
        String department=sc.next();
        switch(empId){
            case 1 -> System.out.println("Ajay");
            case 2 -> {
                System.out.println("Vijay");
                switch(department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> {
                        System.out.println("No department entered");
                    }
                }
            }
            default -> {
                System.out.println("Enter a valid employee id");
            }        
        }
    }
}         
