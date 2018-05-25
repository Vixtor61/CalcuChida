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
import abstractFactory.abstractfactory;
import abstractFactory.conver.conver;
public class factoryArit implements abstractfactory{
    @Override
    public arit getArit(String type){
        switch (type){
            case "multiplicacion":
                return new multi();
            case "division":
                return new division();
            case "resta":
                return new resta();
            case "suma":
                return new suma();
        }
        return null;
    }
    @Override 
    public conver getconver(String type){
        return null;
    }
    
}
