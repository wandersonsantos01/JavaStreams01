package br.com.binsolution.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCsv {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            System.out.println(line);

//            String[] values = line.split(",");
//            System.out.println(Arrays.toString(values));

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");
            String tipoConta = lineScanner.next();
            int agencia = lineScanner.nextInt();
            int conta = lineScanner.nextInt();
            String titular = lineScanner.next();
            // PARSES ESTÁ SUJEITO A REGRAS REGIONAIS (PONTO, VIRGULA, ETC)
            double saldo = lineScanner.nextDouble();

            String valoresFormatados = String.format(
                    new Locale("pt", "BR"),
                    "%s - %04d-%05d - %20s: %.2f",
                    tipoConta, agencia, conta, titular, saldo
            );
            System.out.println(valoresFormatados);
            //            System.out.println(tipoConta);
//            System.out.println(agencia);
//            System.out.println(conta);
//            System.out.println(titular);
//            System.out.println(saldo);
            lineScanner.close();

        }

        scanner.close();
    }

}
