import java.util.ArrayList;

public class ProjectTest {
    public static void displayPortfolio(ArrayList<Project> al){
        System.out.println(al);
    }
    public static void addProjectsToPortfolio(Project someObject){
        String projectClassName = someObject.objectMethods(someObject);
        Portfolio pf = new Portfolio();
        if(projectClassName.equals("Project")){
            pf.setProjects(someObject);
        }
        displayPortfolio(pf.getProjects());
        System.out.println(pf.getPortfolioCost());
    }
    public static void main(String[] args){
        //First constructor test
        Project project = new Project();
        project.setName("Python Project");
        project.setDescription("A web site project using python language; django environment!");
        
        System.out.println(project.getName());
        System.out.println(project.getDescription());
        System.out.println(project.elevatorPitch());

        //Second constructor test
        Project project2 = new Project("Java Project");
        project2.setDescription("A web site project using java language; springboot environemt!");

        System.out.println(project2.getName());
        System.out.println(project2.getDescription());
        System.out.println(project2.elevatorPitch());

        //Third constructor test
        Project project3 = new Project("Mern Project","A website project using mern collection of languages!");

        System.out.println(project3.getName());
        System.out.println(project3.getDescription());
        System.out.println(project3.elevatorPitch());
        System.out.println("");

        //Add The objects of type Project to portfolio
        addProjectsToPortfolio(project);
        addProjectsToPortfolio(project2);
        addProjectsToPortfolio(project3);



        // String firstProject = project.objectMethods(project);
        // String secondProject = project.objectMethods(project2);
        // String thirdProject = project.objectMethods(project3);

        // Portfolio pf = new Portfolio();
        // pf.setProjects(firstProject);
        // pf.setProjects(secondProject);
        // pf.setProjects(thirdProject);

        // //Test Portfolio projects field
        // ArrayList<String> projects = new ArrayList<String>();
        // projects = pf.getProjects();
        // System.out.println(projects);
    }
}
