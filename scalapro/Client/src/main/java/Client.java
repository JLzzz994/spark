import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        socket.getOutputStream(),
                        "utf-8"
                )
        );
        writer.println("CMD /c notepad");
        writer.flush();
        writer.close();

    }
}
