import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio(){
        this.projects = new ArrayList<Project>();
    }

    public void setProjects(Project projectName){
        this.projects.add(projectName);
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }
    public double getPortfolioCost(){
        double sum = 0.0;
        for(Project obj : this.projects){
            sum += obj.getInitialCost();
        }
        return sum;
    }
}
