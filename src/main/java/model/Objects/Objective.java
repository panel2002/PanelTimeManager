package model.Objects;

import java.util.ArrayList;

public class Objective extends Jobs {
    private ArrayList<Task> TaskList;

    public Objective(){}
    public Objective(String Name, String Data, boolean FinishedStatus){
        NameSetter(Name);
        DataSetter(Data);
        FinishedStatusSetter(FinishedStatus);
    }
    public void TaskListCheck(){
        try {
            for (int i=0; i <= this.TaskList.size(); i++){

            }

        }
        catch (Exception e){

        }
    }
}
