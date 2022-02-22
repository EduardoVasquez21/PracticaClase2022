/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase4william;
import Pojos.Estudiante;
import Beans.Acceso;

/**
 *
 * @author Vkaiido
 */
public class PracticaClase4William {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello Word");
        Estudiante es = new Estudiante();
        Acceso ac = new Acceso();
        //Scanner sc = new Scanner(System.in);
        //es.setUser(sc.nextLine());
        es.setUser("Vkaiido");
        es.setPassword("666");
            int logica= ac.Acces(es);
            
            if (logica==0){
            System.out.println("Inicio Correcto");
            }else{
            System.out.println("Inicio incorrecto");
            }
        
    }
    
}
