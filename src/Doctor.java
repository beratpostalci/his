/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratcanbalik
 */
public class Doctor extends Staff implements StaffSalary {
    
    private String speciality;
    private int roomNo;
    
    
    public Doctor(){};
    public Doctor(String name,String surname,String birthDate,String gender,int id
            ,String position,double salary,String speciality, int roomNo,String departmentName,
            String departmentBlock){
        
        super(name,surname,birthDate,gender,id,position,salary,departmentName,departmentBlock);
        this.speciality = speciality;
        this.roomNo = roomNo;
        this.salary = findCirculatingCapital();
        
    }
    
    //Circulate salary towards Doctor's position
    public double findCirculatingCapital(){
        
        if(this.position.startsWith("Head")) this.salary += this.salary*StaffSalary.headDoctorRate;
        else if(this.position.startsWith("Professor")) this.salary += this.salary*StaffSalary.profDoctorRate;
        else if(this.position.startsWith("Surgeon")) this.salary += this.salary*StaffSalary.surgeonDoctorRate;
        else if(this.position.startsWith("Specialist")) this.salary += this.salary*StaffSalary.specDoctorRate;
        else if(this.position.startsWith("Practicionist")) this.salary += this.salary*StaffSalary.pracDoctorRate;
        
        return this.salary;
    }
    
    public String toString(){
        return "\nDoctor: \n" + super.toString() + "\nSalary: " + salary;
    }
    
    
}
