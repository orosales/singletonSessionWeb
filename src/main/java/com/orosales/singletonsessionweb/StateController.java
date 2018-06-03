/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orosales.singletonsessionweb;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import net.ensode.javaee8book.entity.UsStates;
import net.ensode.javaee8book.singletonsession.SingletonSessionBean;

/**
 *
 * @author Sistema
 */
@Named
@RequestScoped
public class StateController implements Serializable {
    
    @EJB
    private SingletonSessionBean singletonSession;

    public StateController() {
    }
    
    
    public String showStates() {
        String resultado = "resultado";
        
        List<UsStates> listStates = singletonSession.getStateList();
        System.out.println("Tamaño:"+ listStates.size());
        return resultado;
    }
}
