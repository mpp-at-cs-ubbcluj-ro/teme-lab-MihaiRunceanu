package org.example;
import com.google.common.base.Strings;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, Guava!";

        if (!Strings.isNullOrEmpty(text)) {
            System.out.println("Lungimea textului: " + text.length());
        } else {
            System.out.println("Textul este gol!");
        }
    }
}