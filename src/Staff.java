/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instantcrush
 */
public abstract class Staff extends Person {
    
    protected Departments department;
    protected String position;
    protected int id;
    protected double salary; //without circulating capital
    protected static int totalStaff = 0;
    
    
    public Staff(){}
    
    public Staff(String name,String surname,String birthDate,String gender,int id
            , String position, double salary ,String departmentName,
            String departmentBlock){
        super(name,surname,birthDate, gender);
        
        this.id = id;
        this.position = position;
        this.salary = salary;
        department = new Departments(departmentName, departmentBlock);
        totalStaff++;
        
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public static int getTotalStaff(){
        return totalStaff;
    }
    
    public String toString() {
        return "\nID: " + id + super.toString() + "\n---Department Information---" + department + "\nPosition: " + position + department.toString();
    }
    
    public boolean checkID(Staff person) {
        if(this.id == person.id) return false;
        else return true;
    }
}
