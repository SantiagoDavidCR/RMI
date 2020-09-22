import java.rmi.Naming;

public class Servidor {
    public Servidor()
    {
        try
        {
            System.setProperty("java.rmi.server.codebase", "file:/c:/RMI/src/main/java/");
            Interface i = new Implementacion();
            Naming.rebind("rmi://localhost/Polinomio", i);
            
        } 
        catch (Exception ex)
        {
            System.out.println("error inesperado: " + ex.getMessage().toString());
        }
    }
    public static void main(String[] args)
    {
        new Servidor();
        System.out.println("Servidor en espera");
    }
}
