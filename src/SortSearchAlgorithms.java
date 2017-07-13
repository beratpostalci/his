
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instantcrush
 */
public class SortSearchAlgorithms {
    
    public static void insertionSort(ArrayList<Staff> staff){
        int value, hole, i;
        
        for(i = 1; i < staff.size(); i++){
            value = staff.get(i).getId();
            hole = i;
            while(hole > 0 && staff.get(hole - 1).getId() > value){
                
               staff.get(hole).setId(staff.get(hole - 1).getId());
               hole = hole - 1;
                
            }
            staff.get(hole).setId(value); 
        }
    }
    
    
    protected static int lomutoPartition(ArrayList<Staff> staff, int start, int end){
        
        int pivot = staff.get(end).getId();
        int pIndex = start;
        
        for(int i = start; i < end; i++) {
            
            if(staff.get(i).getId() <= pivot) {
                
                System.out.println("swap(" + staff.get(i).getId() + ", " + staff.get(pIndex).getId() + ")");
                Collections.swap(staff,i, pIndex);
                pIndex++;
            
            }
            
        }
        Collections.swap(staff,pIndex,end);
        
        return pIndex;
        
    }
    
    
    public static void quickSort(ArrayList<Staff> staff, int start, int end){
        
        if(start < end){
            
            int pIndex = lomutoPartition(staff,start,end);
            quickSort(staff, start, pIndex - 1);
            quickSort(staff, pIndex + 1, end);
            
        }
        
    }
    
    public static int binSearch(ArrayList<Staff> staff,int key, int top, int bottom){
        
        
        int middle = (top + bottom) / 2;
        
        if(bottom > top){
            return -1;
        }
        
        if(staff.get(middle).getId() == key){
            return middle;
        }
        else if(staff.get(middle).getId() > key){
            return binSearch(staff,key, middle - 1, bottom);
        }
        else{
            return binSearch(staff,key, top, middle + 1);
        }
    }
    
}
