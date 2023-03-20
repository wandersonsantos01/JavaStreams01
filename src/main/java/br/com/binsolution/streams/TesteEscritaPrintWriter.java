package br.com.binsolution.streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("lorem6.txt", StandardCharsets.UTF_8);
        pw.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
        pw.println();
        pw.println();
        pw.println("Teste teste teste teste teste");

        pw.close();
    }

}
