public class classes_objects {
    //Instance varibales(non static)
    private String name;
    private float salary;
    
    //Constructors
    public classes_objects(String name,float salary){
        this.name=name;
        this.salary=salary;
    }

    //getters method
    public String getName(){return name; }
    public float getSalary(){return salary; }

    //setters method
    public void setName(String name) {this.name=name; }
    public void setSalary(float salary){this.salary=salary; }

    //Instance method
    public void displayDetails(){
        System.out.println("Employee: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        classes_objects emp = new classes_objects("Vaibhav",10000.0f);
        emp.displayDetails();
    }
}
