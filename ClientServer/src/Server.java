import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		ServerSocket serverSocket = new ServerSocket(4999);
		Socket socket = serverSocket.accept();

		System.out.println("Client Connected");
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		
		BufferedReader reader = new BufferedReader(isr);
		String message = reader.readLine();
		System.out.println("client : " + message);
	}
}