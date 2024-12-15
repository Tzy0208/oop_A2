
public abstract class Person {
    private  String name;
    private  int age;
    private  String gender;
    public Person(){
        name="";
        age=0;
        gender="";
    }
    public Person(String name,int age,String gender){
        name=this.name;
        age=this.age;
        gender=this.gender;

    }
    public void printInfo(){
        System.out.println("name:"+this.name+" "+"age:"+this.age+" "+"gender:"+this.gender);
    }
    public void set_name(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void set_age(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void set_gender(String gender){
        this.gender=gender;
    }
    public  String getgender(){
        return gender;
    }
}

