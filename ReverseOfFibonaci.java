/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;

import java.util.ArrayList;

/**
 *
 * @author Praktikum
 */
public class ReverseOfFibonaci {
    ArrayList<Integer> al = new ArrayList<>();
    
    public void performReverseOfFibonaci(int i){
        for (int j = 0; j < i; j++) {
            if ( j == 0 || j == 1){
                al.add(1);
                continue;
            }
            al.add(al.get(j-1)+al.get(j-2));
        }
        
        for (int j = i-1; j >= 0; j--) {
            System.out.println("" + al.get(j));
        }
    }
}
