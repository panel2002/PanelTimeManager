import model.Objects.Objective;
import model.Objects.Plan;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Plan newSchedule = new Plan("a","b", LocalDateTime.now(),LocalDateTime.now());
        newSchedule.ObjectiveSetter(new Objective("1","b", false));
        newSchedule.ObjectiveSetter(new Objective("2","b", false));
        newSchedule.ObjectiveSetter(new Objective("3","b", false));
        newSchedule.ObjectiveSetter(new Objective("4","b", false));
        newSchedule.ObjectiveSetter(new Objective("5","b", false));
        newSchedule.ObjectiveSetter(new Objective("6","b", false));
        System.out.println(newSchedule.ViewObjective());
        System.out.println(newSchedule.ToString());
    }
}
