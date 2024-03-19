package edu.school21.printer.app;


import edu.school21.printer.logic.Converter;

public class Program {

    public static void main(String[] args) {
        Converter pic = new Converter(parseArgs(args));
        pic.print();
    }

    private static String parseArgs(String[] args) {
        if (args.length != 1) {
            System.err.println("Input file path");
            System.exit(1);
        }
        return args[0];
    }
}
