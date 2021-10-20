package model.Time;

import model.Objects.Task;

import java.util.ArrayList;

public class TimeSlot {
    public int TimeSlot = 98;
    ArrayList<Task> WorkLoad = new ArrayList<>();
    private int workLoadTime = 0;

    public void WorkLoadSetter(Task newTask){
        if(workLoadTime < TimeSlot) {
            WorkLoad.add(newTask);
            workLoadTime = workLoadTime + newTask.timeConsumption;
        }
        else{
            System.out.println("Work load Full");
        }
    }
}
