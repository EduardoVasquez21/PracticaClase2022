/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Estudiante;
import Services.IEstudiante;

/**
 *
 * @author Vkaiido
 */
public class Acceso implements IEstudiante {

    @Override
    public int Acces(Estudiante es) {
    if(es.getUser().equals("Vkaiido")&& es.getPassword().equals("666")){
        return 0;
      }else {
       return 1;
    }
    }

}
    
