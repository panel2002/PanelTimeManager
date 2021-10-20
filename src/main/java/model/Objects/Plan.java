package model.Objects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Plan extends Jobs{
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
    private boolean OverdueStatus;
    public ArrayList<Objective> Objectives = new ArrayList<>();

    public Plan(){}
    public Plan(String Name, String Data, LocalDateTime StartTime, LocalDateTime EndTime){
        NameSetter(Name);
        DataSetter(Data);
        StartTimeSetter(StartTime);
        EndTimeSetter(EndTime);
        FinishedStatusCheck();
        OverdueStatusSetter(LocalDateTime.now().until(EndTime, ChronoUnit.MILLIS) <= 0 && !FinishedStatus);
    }
    public Plan(String Name, String Data, LocalDateTime StartTime, LocalDateTime EndTime,boolean FinishedStatus){
        NameSetter(Name);
        DataSetter(Data);
        StartTimeSetter(StartTime);
        EndTimeSetter(EndTime);
        FinishedStatusSetter(FinishedStatus);
        OverdueStatusSetter(LocalDateTime.now().until(EndTime, ChronoUnit.MILLIS) <= 0 && !FinishedStatus);
    }
    public Plan(String Name, String Data, LocalDateTime StartTime, LocalDateTime EndTime,Objective objective){
        NameSetter(Name);
        DataSetter(Data);
        StartTimeSetter(StartTime);
        EndTimeSetter(EndTime);
        ObjectiveSetter(objective);
        FinishedStatusSetter(FinishedStatusCheck(this.Objectives));
        OverdueStatusSetter(LocalDateTime.now().until(EndTime, ChronoUnit.MILLIS) <= 0 && !this.FinishedStatus);
    }
    public LocalDateTime StartTimeGetter(){
        return this.StartTime;
    }
    public LocalDateTime EndTimeGetter(){
        return this.EndTime;
    }
    public boolean OverdueStatusGetter(){return this.OverdueStatus;}
    public void StartTimeSetter(LocalDateTime StartTime){
        this.StartTime = StartTime;
    }
    public void EndTimeSetter(LocalDateTime EndTime){
        this.EndTime = EndTime;
    }
    public void OverdueStatusSetter(boolean OverdueStatus){this.OverdueStatus = OverdueStatus;}


    public void ObjectiveSetter(Objective objective){this.Objectives.add(objective);}
    public void ObjectiveRemove(Objective objective){
        this.Objectives.remove(objective);
    }
    public String ViewObjective() {
        String ObjectiveView = "";
        for (int i = 0; i < Objectives.size(); i++) {
            ObjectiveView = ObjectiveView +
                            "\nName: " + Objectives.get(i).NameGetter() +
                            "\nData: " + Objectives.get(i).DataGetter() +
                            "\nFinishedStatus: " + Objectives.get(i).FinishedStatusGetter() +
                            "\n";
        }
        return ObjectiveView;

    }


    public String ToString(){
        String output;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        output ="\nName: " + NameGetter() +
                "\nData: " + DataGetter() +
                "\nStartTime: " + StartTimeGetter().format(timeFormatter) +
                "\nEndTime: " + EndTimeGetter().format(timeFormatter) +
                "\nFinishedStatus: " + FinishedStatusGetter() +
                "\nOverdueStatus: " + OverdueStatusGetter();
        return output;
    }

    public void FinishedStatusCheck(){
        try {
            if (this.Objectives.size() > 1) {
                for (int i = 0; i <= this.Objectives.size(); i++) {
                    if (!Objectives.get(i).FinishedStatusGetter()) {
                        this.FinishedStatus = false;
                        return;
                    }
                }
            }
            this.FinishedStatus = true;
        }
        catch (Exception e){
            this.FinishedStatus = true;
        }
    }
    public boolean FinishedStatusCheck(ArrayList<Objective> objective){
        try {
            if (objective.size() > 1) {
                for (int i = 0; i <= objective.size(); i++) {
                    if (!objective.get(i).FinishedStatusGetter()) {
                        return this.FinishedStatus = false;
                    }
                }
            }
            return this.FinishedStatus = true;
        }
        catch (Exception e){
            return this.FinishedStatus = true;
        }
    }


}
