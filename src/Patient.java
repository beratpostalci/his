

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instantcrush
 */
public class Patient extends Person{
    
    private int age;
    private String entranceDate;
    private String sickness;
    private String prescriptions;
    private String allergies;
    private String doctorName;
    private String nurseName;
    private String companionNameSurname;
    private double cost;
    private static double totalCost = 0;
    
    public Patient(){}
    
    public Patient(String name,String surname,String birthDate,String gender, int age, String entranceDate,
            String sickness, String prescriptions, String allergies, double cost, String doctorName, String nurseName,
            String companionNameSurname) {
        
        super(name,surname,birthDate, gender);
        this.age = age;
        this.entranceDate = entranceDate;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.companionNameSurname = companionNameSurname;
        this.cost = cost;
        totalCost += cost; //Cost of all patients
        
    }
    
    public Patient(String name,String surname,String birthDate,String gender, int age, String entranceDate,
            String sickness, String doctorName, String nurseName) {
        
        super(name,surname,birthDate, gender);
        this.age = age;
        this.entranceDate = entranceDate;
        this.sickness = sickness;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        
    }
    
 
    
}
