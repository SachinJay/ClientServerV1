import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		//Socket that client connects to
		Socket socket = new Socket("localhost",4999);
		
		PrintWriter pr = new PrintWriter(socket.getOutputStream());
		pr.println("This a test message from the client");
		pr.flush();
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		
		BufferedReader reader = new BufferedReader(isr);
		String message = reader.readLine();
		System.out.println("Server said: " + message);
	}
}
