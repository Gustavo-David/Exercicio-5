package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        for(int i = 0; i < text.length(); i++) {

            System.out.print(text.charAt(i) + " ");

        }

        System.out.println("\n");

        for(int i = text.length(); i > 0 ; i--) {

            System.out.print(text.charAt(i-1) + " ");

        }
        sc.close();
    }
}
