package Switch.statements.refactorizado;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidmendozaloor
 */
public class Main {
    private ArrayList<EmpleadoSwitch> empleados;
        
    public void administrarTareasPersonas(){
        for(EmpleadoSwitch e: empleados){
            if(e instanceof SwitchMethod){
                 ((SwitchMethod) e).SwitchMethod();
            }
        }
    }
}
