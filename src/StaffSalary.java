/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instantcrush
 */
public interface StaffSalary {
    //For nurses
    public final double headNurseRate = 0.35;
    //For doctors
    public final double profDoctorRate = 0.45;
    public final double surgeonDoctorRate = 0.40;
    public final double headDoctorRate = 0.35;
    public final double specDoctorRate = 0.10;
    public final double pracDoctorRate = 0.05;
    
    
    public double findCirculatingCapital();
}
