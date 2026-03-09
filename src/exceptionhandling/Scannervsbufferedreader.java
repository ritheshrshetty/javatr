package exceptionhandling;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scannervsbufferedreader {
    public static void main(String[] args) throws IOException {
        String name;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        name= br.readLine();
        System.out.println("you entered "+ name);
    }
}
