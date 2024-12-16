public class AssignmentTwo {
    public static void main(String[] args) {

    }
    public void partThree(){
        Ride ride1 = new Ride(1, "Ferris Wheel", new Employee("Bob",20,"Male","Repair the machine",10), true);
        Visitor visitor1 = new Visitor("Alice", 30, "Female", "New York", 1);
        Visitor visitor2 = new Visitor("Bobby", 15, "Male", "Shang Hai", 2);
        Visitor visitor3 = new Visitor("Zhenhua", 25, "Male", "Hu Nan", 3);
        Visitor visitor4 = new Visitor("Danking", 28, "Male", "HeBei", 4);
        Visitor visitor5 = new Visitor("Lisa", 22, "Female", "London", 5);

        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        ride1.printQueue();
        ride1.removeVisitorFromQueue(visitor1);
        ride1.printQueue();



    }
    public void partFourA(){
        Ride ride2 = new Ride(1, "Dodgem", new Employee("Jack",20,"Male","Conductor",11), true);
        Visitor visitor6 = new Visitor("Alice", 30, "Female", "New York", 6);
        Visitor visitor7 = new Visitor("Bobby", 15, "Male", "Shang Hai", 7);
        Visitor visitor8 = new Visitor("Zhenhua", 25, "Male", "Hu Nan", 8);
        Visitor visitor9 = new Visitor("Danking", 28, "Male", "HeBei", 9);
        Visitor visitor10 = new Visitor("Lisa", 22, "Female", "London", 10);
        ride2.addVisitorToHistory(visitor6);
        ride2.addVisitorToHistory(visitor7);
        ride2.addVisitorToHistory(visitor8);
        ride2.addVisitorToHistory(visitor9);
        ride2.addVisitorToHistory(visitor10);
        Visitor AnyVisitor = visitor6;
        boolean InHistory = ride2.checkVisitorFromHistory(AnyVisitor);
        System.out.println("ID: " + AnyVisitor.getVisitorID() + " Is Visitor in history ? " + InHistory);
        System.out.println("Number of Visitors in history: " + ride2.numberOfVisitors());
        if (ride2.getisOpen()==true){
        System.out.println("machine is turned on ");}
        else {System.out.println("machine is turned off");
        }
        ride2.printRideHistory();
    }
    
    public void partFourB(){
        Ride ride3 = new Ride(3, "Haunted House", null, true);
        Visitor visitor11 = new Visitor("Liam", 30, "Male", "Denver", 301);
        Visitor visitor12 = new Visitor("Mia", 25, "Female", "Austin", 302);
        Visitor visitor13 = new Visitor("Noah", 35, "Male", "Denver", 303);
        Visitor visitor14 = new Visitor("Olivia", 28, "Female", "Austin", 304);
        Visitor visitor15 = new Visitor("Sophia", 22, "Female", "Boston", 305);
        ride3.addVisitorToHistory(visitor11);
        ride3.addVisitorToHistory(visitor12);
        ride3.addVisitorToHistory(visitor13);
        ride3.addVisitorToHistory(visitor14);
        ride3.addVisitorToHistory(visitor15);
        System.out.println("Before sorting:");
        ride3.printRideHistory();
        ride3.sortHistory();
        System.out.println("After sorting:");
        ride3.printRideHistory();
    }
    public void partFive(){

    }
    public void partSix(){

    }
    public void partSeven(){
        
    }
}

