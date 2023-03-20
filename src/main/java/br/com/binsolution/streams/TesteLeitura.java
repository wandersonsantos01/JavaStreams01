package br.com.binsolution.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();
        while (Objects.nonNull(line)) {
            System.out.println(line);
            line = br.readLine();
        }

        br.close();
    }

}
