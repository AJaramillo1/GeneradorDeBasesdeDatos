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
public class Nombre
{

    public static String leerNombre()
    {
        String text = null, linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Nombres.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Nombres.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
//             System.out.println(text);
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Apellido()
    {
        String text = null, linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Apellidos.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Apellidos.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Calles()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("calle.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("calle.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea;
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        try
        {
            FileReader fr1 = new FileReader("Nombres.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Nombres.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text +=  linea;
                }
                i++;
            }
//             System.out.println(text);
        } catch (Exception e)
        {

        }try
        {
            FileReader fr1 = new FileReader("numerosCalle.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);

                    text +=  numero+"'";
//             System.out.println(text);
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Colonia()
    {
        String text = null, linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Colonias.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Colonias.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Ciudad()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Ciudades.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Ciudades.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Estado()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Estados.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Estados.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String CP()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("CP.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("CP.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = ","  + linea ;
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }

    public static String Telefono()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("NumerosT.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("NumerosT.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + linea ;
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
        public static String Categoria()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("CategoriaPropie.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("CategoriaPropie.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
         public static String Licencias()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Licencias.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Licencias.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
          public static String Potencia()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Potencia.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Potencia.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
           public static String Constructores()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Constructores.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Constructores.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
            public static String Asientos()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("asientos.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("asientos.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
              public static String Matriculas()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Matriculas.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Matriculas.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        return text;
    }
              
               public static String Fecha()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("ano.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("ano.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text = "," + "'" + linea+"/";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
        try
        {
            FileReader fr1 = new FileReader("mes.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            text +=  numero+"/";
        } catch (Exception e)
        {

        }
        try
        {
            FileReader fr1 = new FileReader("dia.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            text +=  numero+"'";
        } catch (Exception e)
        {

        }
        return text;
    }
               
                 public static String Aviones()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("propietariId.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("propietariId.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea + "'";
                }
                i++;
            }
        } catch (Exception e)
        {

        }
       
        return text;
    }
                  public static String AvionesId()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("AvionId.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("AvionId.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea + "'";
                }
                
                i++;
            }
        } catch (Exception e)
        {

        }
       
        return text;
    }
                   public static String Mecanico()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("MecanicoId.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("MecanicoId.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea + "'";
                }
                
                i++;
            }
        } catch (Exception e)
        {

        }
       
        return text;
    }
                   
                   public static String Objeto()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("Objetos.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("Objetos.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea + "'";
                }
                
                i++;
            }
        } catch (Exception e)
        {

        }
       
        return text;
    }
                          public static String Duracion()
    {
        String text = "", linea;
        int i = 0;
        try
        {
            FileReader fr1 = new FileReader("dia.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            int n = (int) br1.lines().count() - 1;
            int numero = (int) (Math.random() * n);
            FileReader fr = new FileReader("dia.txt");
            BufferedReader br = new BufferedReader(fr);
            while (((linea = br.readLine())) != null)
            {
                if (numero == i)
                {
                    text += "," + "'" + linea + "'";
                }
                
                i++;
            }
        } catch (Exception e)
        {

        }
       
        return text;
    }
}
