/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Calvache
 */

import java.rmi.RemoteException;
import java.rmi.Remote;
        
public interface Interface extends Remote{
    
    public int[] sumar(int[] pA, int[] pB) throws RemoteException;
    public int[] restar(int[] pA, int[] pB) throws RemoteException;
    public int[] multiplicar(int[] pA, int[] pB) throws RemoteException;
}
