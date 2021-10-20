package model.Objects;

public class Task extends Jobs{
    public int timeConsumption = 0;


    public void timeConsumptionSetter(int time){
        if (0 <= time && time <= 98){
            this.timeConsumption = time;
        }
        else {
            System.out.println("Too much time, please split into 2 task");
        }
    }
}
