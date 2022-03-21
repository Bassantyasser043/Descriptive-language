package egtry.Parser;

import egtry.html.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        try {
            new egtry.Parser.html(System.in).create();
            System.out.println("Syntax check ok");
        }
        catch (Throwable e) {
            System.out.println("Syntax check failed!");
        }
    }
}

