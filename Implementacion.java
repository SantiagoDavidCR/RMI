import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementacion extends UnicastRemoteObject implements Interface{
    
    public Implementacion() throws RemoteException
    {
        super();
    }

    @Override
    public int[] sumar(int[] pA, int[] pB) throws RemoteException {
        int[] pRes = new int[3];
        for(int i =0;i<3;i++)
        {
            pRes[i] = pA[i] + pB[i];
        }
        return pRes;
    }

    @Override
    public int[] restar(int[] pA, int[] pB) throws RemoteException {
     int[] pRes = new int[3];
        for(int i=0;i<3;i++)
        {
            pRes[i] = pA[i] - pB[i];
        }
        return pRes;  
    }

    @Override
    public int[] multiplicar(int[] pA, int[] pB) throws RemoteException {
       int[] pRes = new int[3];
        for(int i=0;i<3;i++)
        {
            pRes[i] = pA[i] * pB[i];
        }
        return pRes;
    }
    
}
