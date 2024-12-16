
import java.util.Comparator;

public class VisComparator implements Comparator<Visitor>{
    @Override
    public int compare(Visitor V1,Visitor V2){
        int cityComparison = V1.getCity().compareTo(V2.getCity());
        if (cityComparison != 0) {
            return cityComparison;
        }
        return Integer.compare(V1.getVisitorID(), V2.getVisitorID());
    }
}

