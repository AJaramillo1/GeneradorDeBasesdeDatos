/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos.generador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DELL LATITUDE E7440
 */
public class BaseDeDatosGenerador
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
//        File archivo;
//        FileWriter escribir = null;
//        PrintWriter linea = null;
//        archivo = new File("Inserts.txt");
//        
//        if (!archivo.exists())
//        {
//            try{
//            archivo.createNewFile();
//            }catch(IOException ex){
//                
//            }
//        }
        int id = 1;
        Scanner leer = new Scanner(System.in);
        int cant;
        System.out.println("ingrese la cantidad de registros");
        cant = leer.nextInt();
//        String todos[] = new String[cant];

//        String datoS;
        int datos = 0;
        String NameBd;
        System.out.println("Ingrese el nombre de la base de datos");
        NameBd = leer.next();
        String insert = "INSERT INTO " + NameBd + " VALUES(";
        String conca= insert;
//        System.out.println("cuantos datos seran");
//        datos = leer.nextInt();
        String dat;

//        for (int i = 0; i < datos; i++)
//        {
//            System.out.println("ingrese los datos");
//            dat = leer.next();
//
//        }
        for (int j = 0; j < cant; j++)
        {

            conca += id + Nombre.AvionesId()+ Nombre.Mecanico()+Nombre.Mecanico()+Nombre.Objeto()+Nombre.Duracion()+Nombre.Fecha();
            System.out.println(conca + ");");
            id++;
            conca = insert;
        }
//        linea.close();
//        escribir.close();
    }

}
