/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratcanbalik
 */
public class Departments {
    
    protected String departmentName;
    protected String departmentBlock;
    protected int departmentPatientCapacity;
   
    
    public Departments() {
        
    }
    
    public Departments(String departmentName, String departmentBlock){
        this.departmentName = departmentName;
        this.departmentBlock = departmentBlock;
        
    }
    
    
    public Departments(String departmentName, String departmentBlock, int departmentPatientCapacity){
        this.departmentName = departmentName;
        this.departmentBlock = departmentBlock;
        this.departmentPatientCapacity = departmentPatientCapacity;
        
    }
    
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentBlock() {
        return departmentBlock;
    }

    public void setDepartmentBlock(String departmentBlock) {
        this.departmentBlock = departmentBlock;
    }

    
    
    public String toString(){
        return "\nDepartment name: " + departmentName + "\nDepartment block: " + departmentBlock + "\n"; 
    }
    
}
