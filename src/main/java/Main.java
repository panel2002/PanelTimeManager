import model.Objects.Creator;
import model.Objects.Objective;
import model.Objects.Plan;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Plan newSchedule;
        newSchedule = Creator.planCreate();
        System.out.println(newSchedule.ToString());
    }
}
