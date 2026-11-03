/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg3.modular;

import java.util.Scanner;

/**
 *
 * @author dor2191
 */
public class Ex3Modular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int vuelta;
        System.out.println("Introduce un numero");
        a=sc.nextInt();
        System.out.println("Introduce numero");
        b=sc.nextInt();
        vuelta=minimo(a, b);
        System.out.println("El numero minimo es "+vuelta);
              
    }
    public static int minimo(int a, int b){
        if(a>b)
        {return b;}
        else{
            return a;}
        }
      
    }
    
