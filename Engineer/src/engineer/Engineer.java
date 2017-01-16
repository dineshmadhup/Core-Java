/**
 * Question 1
 * @author PLANET
 */  
    
import java.util.ArrayList;


/**
 * This class has a composition with Project.
 * Therefore it will create an ArrayList to keep track
 * of projects. The projects are created and owned by this class
 */
public class Engineer {
    public String engrName;
    public double salary;
    public String department;
    public ArrayList<Project> projects;
    
    public Engineer(String engrName,double salary,String department){
        this.engrName = engrName;
        this.salary = salary;
        this.department = department;
        this.projects = new ArrayList<Project>(); // Init the Composition
    }
    
    /**
     * Since its a composition, each Project object has to be locally created,
     * this method will create and keep track of a Project
     * @param projName The name of the project
     * @param budget The budget for the project
     */
    public void addProject(String projName,double budget){
        Project newProject = new Project(projName,budget);
        this.projects.add(newProject);
    }
    
}

    
