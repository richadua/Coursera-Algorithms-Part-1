import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Wget {
    public static void main(String[] args) {
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();
        
        String file = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(file);
        out.println(data);
        out.close();
    }
}