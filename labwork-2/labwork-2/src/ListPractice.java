/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xyh10
 */
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Arrays.fill(arr, 1);;
        
        
        System.out.println(Arrays.toString(arr));
        
        doubleTripe(arr);
        
        System.out.println(Arrays.toString(arr));
        
        
    }
    
    
    public static void doubleTripe(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                arr[i] *= 2;
            }else{
                arr[i] *= 3;
            }
        }
    }
    
}
