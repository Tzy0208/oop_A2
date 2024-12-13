public class Visitor extends Person{
    private String city;
    private int visitornum;

    public Visitor(){
       super();
    }
    
    public Visitor(String name,int age,String gender,String city,int visitornum){
        super(name,age,gender);
        this.city=city;
        this.visitornum=visitornum;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public  void setVisitornum(int visitornum){
        this.visitornum=visitornum;
    }
    public int getVisitornum(){
        return visitornum;
    }
}
