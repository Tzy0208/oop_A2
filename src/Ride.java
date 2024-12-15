import java.util.LinkedList;
import java.util.Queue;

public class Ride {
    private int rideID;
    private String ridename;
    private Employee rideOper;
    private boolean isOpen;
    private Queue<Visitor> waitingQueue;
    
    public Ride(){
        rideID=0;
        ridename="";
        waitingQueue = new LinkedList<>();

    }
    public Ride(int rideID,String ridename,Employee rideOper,boolean isOpen){
        this.rideID=rideID;
        this.ridename=ridename;
        this.isOpen=isOpen;
        this.rideOper=rideOper;
        this.waitingQueue = new LinkedList<>();
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
    public void addVisitorToQueue(Visitor visitor) {
        waitingQueue.offer(visitor);
    }
    public void removeVisitorFromQueue(Visitor visitor) {
        waitingQueue.remove(visitor);
    }
    public void printQueue(){
        System.out.println("Waiting Queue for Ride ID: " + rideID + ", Ride Name: " + ridename);
        for (Visitor visitor : waitingQueue) {
            System.out.println("Visitor Name: " + visitor.getName() + ", Age: " + visitor.getAge() + 
                               ", Gender: " + visitor.getgender() + ", City: " + visitor.getCity() + 
                               ", Visit Number: " + visitor.getVisitornum());
        }
    }
}