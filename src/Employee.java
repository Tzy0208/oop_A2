
public class Employee extends Person{
    private String job;
    private int EmployeeID;
    
    public Employee(){
        super();

    }
    public Employee(String name,int age ,String gender,String job,int EmployeeID){
        super(name,age,gender);
        this.EmployeeID=EmployeeID;
        this.job=job;
    }

    public void set_job(String job){
        this.job=job;
    }
    
    public String getJob(){
        return job;
    }
    public void set_EmployeeID(int EmployeeID){
        this.EmployeeID=EmployeeID;
    }
    public int getEmployeeID(){
        return EmployeeID;
    }
}
