import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cliente {
    public static void MostrarMenu()
    {
        System.out.println("*****************");
        System.out.println("*******Menu******");
        System.out.println("*****************");
        System.out.println("1.   Sumar");
        System.out.println("2.   Restar");
        System.out.println("3.   Multiplicar");
        System.out.println("4.   Salir");
    }
    //**********************************
    
    public static void LeerSeleccion()
    {
        try
        {
            int Seleccion;
            int[] polinomioA;
            int[] polinomioB;
            int[] resultado;
            Interface i = (Interface)Naming.lookup("rmi://localhost/Polinomio");
            System.out.println("Digite su opcion");
            Scanner SC = new Scanner(new InputStreamReader (System.in));
            Seleccion = SC.nextInt();
            switch(Seleccion)
            {
                case 1:
                    System.out.println("Sumar: ");
                    polinomioA = leerPolinomio("Ingrese el Primer Polinomio");
                    polinomioB = leerPolinomio("Ingrese el Segundo Polinomio");
                    resultado = i.sumar(polinomioA, polinomioB);
                    System.out.println("El resultado de la operacion es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;
                case 2:
                    System.out.println("Restar: ");
                    polinomioA = leerPolinomio("Ingrese el Primer Polinomio");
                    polinomioB = leerPolinomio("Ingrese el Segundo Polinomio");
                    resultado = i.restar(polinomioA, polinomioB);
                    System.out.println("El resultado de la operacion es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;
                case 3:
                    System.out.println("Multiplicar: ");
                    polinomioA = leerPolinomio("Ingrese el Primer Polinomio");
                    polinomioB = leerPolinomio("Ingrese el Segundo Polinomio");
                    resultado = i.multiplicar(polinomioA, polinomioB);
                    System.out.println("El resultado de la operacion es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    MostrarMenu();
                    break;
            }
            
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }

    public static int[] leerPolinomio(String pMensaje) 
    {
        int[] Polinomio = new int[3];
        Scanner sc = new Scanner (System.in);
        System.out.println(pMensaje);
        for(int i=0;i<3;i++)
        {
            Polinomio[i] = sc.nextInt();
        }
        return Polinomio;
    }
    
    
    
    
    public static void MostrarPolinomio(int[] pPolinomio)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(" "+pPolinomio[i]);
        }
    }
    
    
    
    
    public static void main(String[] args)
    {
        try
        {
            MostrarMenu();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    