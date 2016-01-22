/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1github;
import java.util.Scanner;
import java.io.InputStreamReader;

/**
 *
 * @author Fran
 */
public class Practica1github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        int tipo;
        int region;
        System.out.println("Hola nuevo entrenador, da la bienvenida al mundo de los pokemon.");
        System.out.println("Soy el Profesor Fran, bienvenido a mi laboratorio");
        do{
        System.out.println("Estoy seguro de que estas deseando inciar tu aventura, pero primero, dime algo sobre ti ¿De donde eres?");
        System.out.println("Kanto->1, Johto->2, Hoenn->3, Sinoh->4, Teselia->5, Kalos->6.");
        Scanner b=new Scanner(System.in);
        region=b.nextInt();
        if((region>6)||(region<1)){
        System.out.println("Que estes en tu mundo no sigmifica que vengas de él. Responde adecuadamente.");
        }
        }while((region>6)||(region<1));
        System.out.println("He dedicado toda mi vida a capturar y entrenar pokemon de todas las generaciones, "
                + "pero por alguna razon solo me quedan estos tres.");    
        System.out.println("Así que elige.");
        do{
        System.out.println("¿De que tipo quieres que sea?");
        System.out.println("Planta->1   Agua->2   Fuego->3.");
        Scanner a=new Scanner(System.in);
        tipo=a.nextInt();
        if((tipo>3)||(tipo<1)){
            System.out.println("Si, Claro. Porque no un Mega Rayquaza para empezar.");
            System.out.println("No te flipes y hazlo bien.");
        }
        }while((tipo!=1)&&(tipo!=2)&&(tipo!=3));
    }
    
}
