package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e4 {
    static void main(String[] args) {
        String str;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();

        } catch (IOException e) {
        }
    }
}
