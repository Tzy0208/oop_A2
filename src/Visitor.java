public class Visitor extends Person{
    private String city;
    private int visitorID;

    public Visitor(){
       super();
    }
    
    public Visitor(String name,int age,String gender,String city,int visitorID){
        super(name,age,gender);
        this.city=city;
        this.visitorID=visitorID;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public  void setVisitorID(int visitorID){
        this.visitorID=visitorID;
    }
    public int getVisitorID(){
        return visitorID;
    }
}
