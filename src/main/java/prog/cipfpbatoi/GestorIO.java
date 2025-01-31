/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class GestorIO {
    public static int llegirEnter(String mensaje){
        int numero=0;
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        if(entrada.hasNextInt()){
            numero =entrada.nextInt();
        }
        return numero;
    }
    public static String llegirText(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        String texto = entrada.next();
        return texto;
    }
     public static boolean solicitarConfirmacion(String mensaje){
        String respuesta = null;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("dime s O n");
            respuesta = entrada.nextLine();
         }
        while(!respuesta.equals("s")&&!respuesta.equals("n"));
        return true;
     }
    
}
