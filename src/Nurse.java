/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratcanbalik
 */
public class Nurse extends Staff implements StaffSalary {
    private int doctorNo;
    
    public Nurse(){};
    public Nurse(String name,String surname,String birthDate,String gender,int id
            ,String position,double salary, int doctorNo,String departmentName,
            String departmentBlock){
        
        super(name,surname,birthDate,gender,id,position,salary,departmentName,departmentBlock);
        this.doctorNo = doctorNo;
        this.salary = findCirculatingCapital();
    }
    
    
    //Circulate salary towards Nurse's position
    public double findCirculatingCapital(){
        if(this.position.startsWith("Head")) this.salary += this.salary*StaffSalary.headNurseRate;
        
        return this.salary;
    }
    
    public String toString(){
        return "\nNurse: \n" + super.toString() + "\nDoctor no: " + doctorNo + "\nSalary: " + salary ;
    }
    
    
}
