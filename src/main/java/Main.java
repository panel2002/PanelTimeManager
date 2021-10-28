import model.Objects.Creator;
import model.Objects.Plan;
public class Main {
    public static void main(String[] args){
        Plan newSchedule;
        newSchedule = Creator.planCreate();
        System.out.println(newSchedule.ToString());
    }
}
