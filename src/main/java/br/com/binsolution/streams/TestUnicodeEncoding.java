package br.com.binsolution.streams;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("UTF-8");
        System.out.print(bytes.length + " Charset: UTF-8 - ");
        String sNew = new String(bytes, "UTF-8");
        System.out.println(sNew);

        bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + " Charset: windows-1252 - ");
        sNew = new String(bytes, "windows-1252");
        System.out.println(sNew);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + " Charset: UTF-16 - ");
        sNew = new String(bytes, "UTF-16");
        System.out.println(sNew);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + " Charset: " + StandardCharsets.US_ASCII + " - ");
        sNew = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println(sNew);
    }
}
