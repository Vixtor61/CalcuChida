/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author LN710Q
 */
import abstractFactory.arit.factoryArit;
import abstractFactory.conver.factoryConver;
public class factoryProducer {
    public static abstractfactory getfactory(String type){
        switch (type){
            case "arit":
                return new factoryArit();
            case "conver":
                return new factoryConver();
                
                
        }
        return null;
    }
    
}
