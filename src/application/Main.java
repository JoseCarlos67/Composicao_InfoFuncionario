package application;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String fakeInputString = "";
        ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
        System.setIn(fakeInput);

        Scanner scanner = new Scanner(System.in);


        scanner.close();
    }
}