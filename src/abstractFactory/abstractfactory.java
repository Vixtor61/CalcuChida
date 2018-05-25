/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;
import abstractFactory.conver.conver;
import abstractFactory.arit.arit;

/**
 *
 * @author LN710Q
 */
public interface abstractfactory {
    arit getArit(String type);
    conver getconver(String type);
    
}
