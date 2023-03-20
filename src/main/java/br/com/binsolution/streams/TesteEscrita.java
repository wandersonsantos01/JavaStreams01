package br.com.binsolution.streams;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
        bw.newLine();
        bw.newLine();
        bw.write("Teste teste teste teste teste");

        bw.close();
    }

}
