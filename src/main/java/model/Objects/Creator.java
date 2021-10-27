package model.Objects;
import model.Objects.Plan;
import model.Time.formatter;

import java.util.Objects;
import java.util.Scanner;

public class Creator {
    public static Plan planCreate(){
        Scanner input = new Scanner(System.in);
        Plan dummy = new Plan();
        boolean finishedStatusCheck = false;
        System.out.print("please enter plan name:");
        dummy.NameSetter(input.nextLine());
        System.out.print("please enter plan data:");
        dummy.DataSetter(input.nextLine());
        System.out.print("please enter plan finished status:");
        while (!finishedStatusCheck) {
            switch (input.nextLine()) {
                case "true":
                    dummy.FinishedStatusSetter(true);
                    finishedStatusCheck = true;
                    break;
                case "false":
                    dummy.FinishedStatusSetter(false);
                    finishedStatusCheck = true;
                    break;
                default:
                    System.out.print("please re-enter:");
                    break;

            }
        }
        System.out.print("please enter plan starting time:");
        dummy.StartTimeSetter(formatter.format(input.nextLine()));
        System.out.print("please enter plan ending time:");
        dummy.EndTimeSetter(formatter.format(input.nextLine()));
        return dummy;
    }
}
