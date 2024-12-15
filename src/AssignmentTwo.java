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
        
    }
    public void partFourA(){

    }
    public void partFourB(){

    }
    public void partFive(){

    }
    public void partSix(){

    }
    public void partSeven(){
        
    }
}

