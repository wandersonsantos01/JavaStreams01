package br.com.binsolution.streams;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {
        // ENTRADA - REDE
//        Socket s = new Socket();

        // FLUXO DE ENTRADA
        InputStream fis = new FileInputStream("lorem.txt");
//        InputStream fis = System.in;
//        InputStream fis = s.getInputStream();
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // FLUXO DE SAIDA
        OutputStream fos = new FileOutputStream("lorem3.txt");
//        OutputStream fos = System.out;
//        OutputStream fos = s.getOutputStream();
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();
        while (Objects.nonNull(line) && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }

}
