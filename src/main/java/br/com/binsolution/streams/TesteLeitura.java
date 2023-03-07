package br.com.binsolution.streams;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();

        System.out.println(line);

        br.close();
    }

}
