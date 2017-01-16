

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;



/**
 * This class implements all the required methods for the assignment
 * 
 */
public class Main {
    //Question 3
    public static HashMap<String, EngineerProject> getBudgetList(ArrayList<Engineer> engineers){
        //Create the HashMap
        HashMap<String,EngineerProject> map = new HashMap<String,EngineerProject>();
        
        //For each engineer in the engineers array, add their projects
        for( Engineer engineer: engineers){
            double totalBudget=0;
            for (Project project: engineer.projects){
                totalBudget+= project.budget;
            }
            //Create the new EngineerProject
            EngineerProject engineerProject = new EngineerProject(engineer.engrName,totalBudget,engineer.department);
            //Add it to the HashMap
            map.put(engineerProject.engrName, engineerProject);
        }
        
        return map;
    }
    //Question 4
    public static void printAll(HashMap<String,EngineerProject> budgetList){
        //For each engineerProject in the HashMap...
        for (EngineerProject engineerProject : budgetList.values()){
            System.out.print(engineerProject.engrName+"\t");
            System.out.print(engineerProject.totalBudgets+"\t");
            System.out.print(engineerProject.department+"\n");
        }
    }
    //Question 5
    public static void writeToFile(String filename, ArrayList<Engineer> engineers) throws FileNotFoundException{
        //Define number of Tabs
        String tabs = "\t";
        //Use a PrintWriter for file
        PrintWriter file = new PrintWriter(filename);
        //Print table header
        file.println("Name"+tabs+"Salary"+tabs+"Department"+tabs+"TotalProjects");
        
        //Now for each Engineer...
        for (Engineer engineer: engineers){
            //Print name, salary, department and total projects
            file.print(engineer.engrName+tabs);
            file.print(engineer.salary+tabs);
            file.print(engineer.department+tabs);
            file.print(engineer.projects.size()+"\n");
            
            //Now for each project
            for (Project project : engineer.projects){
                //Print the project name and budget
                file.print(project.projName+tabs);
                file.print(project.budget+"\n");
            }
        }
        //Close the file
        file.close();
        
    }
    //Question 6
    
    /**
     * This method returns the EngineerProject with the biggest budget
     * @param <E> the EngineerProject
     * @param list list of EngineerProjects
     * @return The EngineerProject with the biggest budget, or null if list is empty
     */
    public static <E extends EngineerProject> E findBiggest(Collection<E> list){
        //List might be empty, in that case, returns null
        if (list.size()==0)
            return null;
        //If it is not empty, then at least one EngineerProject is there
        E biggest = list.iterator().next();
        //Use the first as biggest and now compare with every element
        for (E project: list){
            if (biggest.totalBudgets<project.totalBudgets){
                biggest = project;
            }
        }
        //Return biggest
        return biggest;
    }
    
    /**
     * This code is commented since it is simulated and the elements it uses
     * are not in this file, therefore it will prevent compilation
     * @param event 
     */
    /*
    //     Question 7
    public static void actionPerformed(ActionEvent event){
        //The JList needs an array on its constructor. Each array will be a string
        //and it will use \t as separator between name and budget
         ArrayList<String> listboxData = new ArrayList<String>();
         //For every project in the budgetList
         for( EngineerProject engineerProject: budgetList.values()){
             listboxData.add(engineerProject.engrName+"\t"+engineerProject.totalBudgets);
         }
         //Now that the arraylist is filled, use the toArray() to load data into JList
         listBudget = new JList(listboxData.toArray());
        
    }
    */
    public static void main (String[] args){
        //Create the Engineer array
        
        //Question 3
        ArrayList<Engineer> engineers = new ArrayList<Engineer>();
        //Add some engineers to it
        Engineer peter = new Engineer("Peter",100000,"Electrical");
        peter.addProject("Central Warehouse", 500000);
        peter.addProject("Control Office", 20000);
        
        Engineer jim = new Engineer("Jim",1200000,"Software");
        jim.addProject("Company website", 50000);
        jim.addProject("Shooting game", 2000);
        jim.addProject("Word processor", 10000);
        
        engineers.add(peter);
        engineers.add(jim);
        
        //Question
        //Test some of the above methods
        HashMap<String,EngineerProject> budgetList = getBudgetList(engineers);
        //Print the budget list and engineers file
        printAll(budgetList);
        try {
            writeToFile("Engineers.txt",engineers);
        } catch (FileNotFoundException ex) {
            System.out.println("Problems with file I/O: "+ex.getLocalizedMessage());
        }
        //Find the biggest budget
        EngineerProject biggest = findBiggest(budgetList.values());
        System.out.println("Biggest Budget:");
        System.out.print(biggest.engrName+"\t");
        System.out.print(biggest.totalBudgets+"\t");
        System.out.print(biggest.department+"\n");
    }
}
