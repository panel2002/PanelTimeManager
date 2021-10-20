package model.Objects;

public class Jobs {
    protected String Name;
    protected String Data;
    protected boolean FinishedStatus;

    public String NameGetter(){
        return this.Name;
    }
    public String DataGetter(){
        return this.Data;
    }
    public boolean FinishedStatusGetter(){
        return this.FinishedStatus;
    }

    public void NameSetter(String Name){
        this.Name = Name;
    }
    public void DataSetter(String Data){
        this.Data = Data;
    }
    public void FinishedStatusSetter(boolean FinishedStatus){
        this.FinishedStatus = FinishedStatus;
    }

}
