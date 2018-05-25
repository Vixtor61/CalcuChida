/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.conver;

/**
 *
 * @author LN710Q
 */
public class binario implements conver{
    @Override
    public String conver(int a){
        String k = " ";
        int b;
        while(a > 0){
            b = a % 2;
            a = a/2;
            k = b+k;
            
        }
        return k;
    }
}
