/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exfuncionpreguntasculturrales;

/**
 *
 * @author José Antonio
 */
public class ExFuncionPreguntasCulturrales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta1, respuesta2;

        respuesta1 = prreguntasJose.preguntaPrimera();
        System.out.println("respuesta 1: " + respuesta1);

        prreguntasJose.respostaPrimera(respuesta1);
        
        respuesta2=prreguntasJose.preguntaSegunda();
        
        System.out.println("respuesta 2: " + respuesta2);
        prreguntasJose.respostaSegunda(respuesta2);

    }

}
