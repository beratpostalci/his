/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratcanbalik
 */
public abstract class Person {
    protected String name;
    protected String surname;
    protected String birthDate;
    protected String gender;
    
    
   public Person(){};
   public Person(String name,String surname,String birthDate, String gender){
        
        this.name=name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
        
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nSurname: " + surname +"\nBirth date: " + birthDate + "\nGender: " + gender;
    }

  
    
}
