import java.util.ArrayList;

public class Project{
    private String name;
    private String description;
    private double initialCost;

    //Constructors
    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Class Methods
    public String elevatorPitch(){
        return this.name+" ("+this.initialCost+"$)"+", "+this.description;
    }

    public String objectMethods(Project someProject){
        return this.getClass().getSimpleName();
    }

    //Seters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    //Geters
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getInitialCost(){
        return this.initialCost;
    }
}