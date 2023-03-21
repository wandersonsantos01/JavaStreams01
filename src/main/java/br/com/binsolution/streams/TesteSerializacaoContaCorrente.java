package br.com.binsolution.streams;

import br.com.binsolution.streams.banco.modelo.Cliente;
import br.com.binsolution.streams.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoContaCorrente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Elon Musk");
        cliente.setProfissao("Empresário");
        cliente.setCpf("12345678900");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(199.00);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getNome());
    }

}