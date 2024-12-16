import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public  class Ride implements RideInterface{
    private int rideID;
    private String ridename;
    private Employee rideOper;
    private boolean isOpen;
    private final Queue<Visitor> waitingQueue;
    private final List<Visitor> rideHistory;
    
    public Ride(){
        rideID=0;
        ridename="";
        waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        
    }
    public Ride(int rideID,String ridename,Employee rideOper,boolean isOpen){
        this.rideID=rideID;
        this.ridename=ridename;
        this.isOpen=isOpen;
        this.rideOper=rideOper;
        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingQueue.offer(visitor);
    }
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        waitingQueue.remove(visitor);
    }
    @Override
    public void printQueue(){
        System.out.println("Waiting Queue for Ride ID: " + rideID + ", Ride Name: " + ridename);
        for (Visitor visitor : waitingQueue) {
            System.out.println("Visitor Name: " + visitor.getName() + ","+ "Age: " + visitor.getAge() + ", Gender: " + visitor.getgender() + ", City: " + visitor.getCity() + ", Visit Number: " + visitor.getVisitorID());
        }
    }
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }
    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = rideHistory.iterator(); 
        System.out.println("Ride History for Ride ID: " + rideID + ", Ride Name: " + ridename);
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println("Visitor Name: " + visitor.getName() + ", "+"Age: " + visitor.getAge() +","+ "Gender: " + visitor.getgender() + ","+" City: " + visitor.getCity() +","+ "Visit ID: " + visitor.getVisitorID()); 
        }
    }
    public void sortHistory() {
    if (rideHistory.isEmpty()) {
        System.out.println("Ride history is empty. Nothing to sort.");
        return;
    }
    Collections.sort(rideHistory, new VisComparator());
    System.out.println("Ride history has been sorted.");
}
}