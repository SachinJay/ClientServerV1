import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		//socket that the server connects to, same as the socket
		//the client connects to
		ServerSocket serverSocket = new ServerSocket(4999);
		
		//When Client.java is run, it will connect to the server 
		//socket above, this below line waits and listens for this event
		//to occur
		Socket socket = serverSocket.accept();
		
		//Will only print when the client connects
		System.out.println("Client Connected");
		
		//Input stream comes from the accepted socket
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		
		BufferedReader reader = new BufferedReader(isr);
		String message = reader.readLine();
		System.out.println("client said: " + message);
		
		PrintWriter pr = new PrintWriter(socket.getOutputStream());
		pr.println("This is a test message from the server");
		pr.flush();
	}
}