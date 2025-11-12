public class encapsulation {
    public static void main(String[] args) {
       Parent obj=new Parent();
       
       obj.setId(100);
       obj.setName("Vaibhav");

       System.out.println("Parent Id: "+obj.getId());
       System.out.println("Parent Name: "+obj.getName());
    }
}

class Parent{
    private int num;
    private String str;


//setter method
void setId(int num){
    this.num=num;
  }

void setName(String str){
    this.str=str;
  }

 
//getters method
int getId(){
    return num;
}

String getName(){
    return str;
}
}
