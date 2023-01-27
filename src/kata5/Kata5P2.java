package kata5;

import kata5.loader.impl.FileLoader;
import kata5.loader.impl.MailLoader;

import java.io.File;

public class Kata5P2 {

    public static void main(String[] args) {
        Iterable<String> items = new MailLoader(new FileLoader(new File("email.txt"))).items();
        for (String mail : items) System.out.println(mail);
    }
}