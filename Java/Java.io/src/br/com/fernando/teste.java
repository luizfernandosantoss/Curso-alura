package br.com.fernando;

import java.nio.charset.Charset;

public class teste {
    public static void main(String[] args) {

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
    }
}
