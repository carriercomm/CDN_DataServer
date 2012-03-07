package prototype.dataserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

import newNetwork.Connection;

public interface IDataServer extends Remote {
	
	public void upload(String data,int size,String requester, String fileType) throws RemoteException;
	public int TCPRead(int AppId,String dataname,Connection.Type type,String conId) throws RemoteException;
	//this method uses point to point connection for DTN data transfer 
	public boolean DTNRead(int AppId,String dataname,String dataRequester,String conId) throws RemoteException;
	public boolean delete(String Content) throws RemoteException ;
	public void subscribe() throws RemoteException ;
	public void unsubscribe() throws RemoteException ;
}
