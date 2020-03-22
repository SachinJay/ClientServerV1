import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		Socket socket = new Socket("localhost",4999);
		
		PrintWriter pr = new PrintWriter(socket.getOutputStream());
		pr.println("Test message");
		
		
		
		pr.flush();
	}
}
