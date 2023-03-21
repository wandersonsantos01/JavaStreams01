package br.com.binsolution.streams;

import br.com.binsolution.streams.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestedeserializacaoContaCorrente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getTitular());
        System.out.println(cc.getSaldo());
    }

}