package br.com.binsolution.streams;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem5.txt", StandardCharsets.UTF_8);
        ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
        ps.println();
        ps.println();
        ps.println("Teste teste teste teste teste");

        ps.close();
    }

}
