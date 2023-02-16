/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos.generador;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author DELL LATITUDE E7440
 */
public class calse
{
    public static void main(String[] args)
    {
         
         String text=null,linea;
        int i= 0;
        try{
            FileReader fr1 = new FileReader("Nombres.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count()-1;
            int numero = (int)(Math.random()*n);
            FileReader fr = new FileReader("Nombres.txt");
            BufferedReader br = new BufferedReader(fr);
             while (((linea = br.readLine())) != null)
                {
                    System.out.println(linea);
                    if (numero == i)
                    {
                        text = ","+"'"+linea+"'";
                    }
                     i++;
                }
             System.out.println(text);
        }catch(Exception e){
            
        }
    }
}
