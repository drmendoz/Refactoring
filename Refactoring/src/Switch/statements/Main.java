package Switch.statements;

import data.clump.refactorizado.Persona;
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
            if(e instanceof Administrador){
                Administrador adm= (Administrador) e;
                adm.saludar();
                adm.administrar();
                adm.terminar();
            }
            else if(e instanceof Perchero){
                Perchero per= (Perchero) e;
                per.cogerArticulos();
                per.perchar();
                per.terminar();
            }
            else if(e instanceof Cajero){
                Cajero caj= (Cajero) e;
                caj.saludar();
                caj.cobrar();
                caj.terminar();
            }
        }
    }
}
