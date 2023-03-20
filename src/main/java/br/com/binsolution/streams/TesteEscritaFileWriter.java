package br.com.binsolution.streams;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem4.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
//        fw.write(System.lineSeparator()); // BASEADO NO SISTEMA OPERACIONAL
        bw.newLine();
        bw.write("Teste teste teste teste teste");

        bw.close();
    }

}
