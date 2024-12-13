public class Ride {
    private int rideID;
    private String ridename;
    private Employee rideOper;
    private boolean isOpen;
    
    public Ride(){
        rideID=0;
        ridename="";

    }
    public Ride(int rideID,String ridename,Employee rideOper,boolean isOpen){
        this.rideID=rideID;
        this.ridename=ridename;
        this.isOpen=isOpen;
        this.rideOper=rideOper;
    }
    public void setrideID(int rideID){
        this.rideID=rideID;
    }
    public int getrideID(){
        return rideID;
    }
    public void  setridename(String ridename){
        this.ridename=ridename;
    }
    public String getridename(){
        return ridename;
    }
    public void setrideOper(Employee rideOper){
        this.rideOper=rideOper;
    }
    public Employee getrideOper(){
        return rideOper;
    }
    public void setisOpen(boolean isOpen){
        this.isOpen=isOpen;
    }
    public boolean getisOpen(){
        return isOpen;
    }
}
