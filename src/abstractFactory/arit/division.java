/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.arit;

/**
 *
 * @author LN710Q
 */
public class division implements arit {
    @Override
    public float fill(float a,float b){
        if (!(b == 0)){
        return a/b;    
        }
        
        return 0;    
        
        
    }
    
}
