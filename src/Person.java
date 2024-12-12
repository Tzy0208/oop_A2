
public class Person {
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
    public void set_name(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void set_age(int a){
        this.age=a;
    }
    public int getAge(){
        return age;
    }
    public void set_gender(String g){
        this.gender=g;
    }
    public  String get_gender(){
        return gender;
    }
}

