/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.conver;

import abstractFactory.abstractfactory;
import abstractFactory.arit.arit;

/**
 *
 * @author LN710Q
 */
public class factoryConver implements abstractfactory{
    @Override
    public arit getArit(String type){
       return null;
    }
    @Override 
    public conver getconver(String type){
         switch (type){
            case "binario":
            return new binario();
        }
        return null;
    }
    }
    

