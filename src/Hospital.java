
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instantcrush
 */
public class Hospital {
    
    protected static String hospitalName;
    protected static String address;
    protected static String phone;
    protected static ArrayList<Departments> departments = new ArrayList<Departments>();
    protected static ArrayList<Staff> staff = new ArrayList<Staff>();
    protected static ArrayList<Patient> patient = new ArrayList<Patient>();
    protected static SortSearchAlgorithms sortSearch = new SortSearchAlgorithms();
    
    public Hospital(){}
    
    public Hospital(String hospitalName, String address, String phone){
        
        this.hospitalName = hospitalName;
        this.address = address;
        this.phone = phone;
    
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
    
    public static void addDepartment(Departments d) {
        departments.add(d);
    }
    
    public static void displayId(){
        
        for(int i = 0; i < staff.size(); i++){
            System.out.println((i + 1) + ". ID = " + staff.get(i).getId());
        }
        
    }
    
    public static String displayStaff(int index){
        return staff.get(index).toString();
    }
    
    public static void addStaff(Staff p) {
        
        
        if(staff.size() > 0){
            
            if(sortSearch.binSearch(staff,p.getId(),staff.size() - 1,0) == -1){
                staff.add(p);
                System.out.println("\n" + p.name + " " + p.surname + " added to the list\n");
            }
            else{
                System.out.println("\nThe ID " + p.getId() + " is already in the list!\n");
            }
            
            }
            else{

                staff.add(p);
                System.out.println("\n" + p.name + " " + p.surname + " added to the list\n");

            }
        
        
            
            if(staff.size() < 12){ //insertion sort is more efficient on small lists
                sortSearch.insertionSort(staff);
            }
            else {
                //We will implement quickSort here
                sortSearch.quickSort(staff, 0, staff.size()-1);
            } 
            
        
        
                
        
    }
    
    public static String delId(int id){
        String str = "";
        int del = sortSearch.binSearch(staff, id, staff.size() - 1, 0);
        if(del > -1){
            str = ("\n***Remove operation***\nID: " + staff.get(del).getId() + " " + staff.get(del).name + " " + staff.get(del).surname +" has been deleted.\n");
            staff.remove(del);
        }
        else return("ID cannot be found!");
        
        return str;
    }
    
     public static String searchId(int id){
        String str = "";
        int searchIndex = sortSearch.binSearch(staff, id, staff.size() - 1, 0);
        if(searchIndex > -1){
            str = ("***Search***\nID " + staff.get(searchIndex).getId() + " Information:\n" + staff.get(searchIndex));
        }
        else return "ID cannot be found!";
        
        return str;
    }
    
}
