package edu.school21.printer.app;

import com.beust.jcommander.JCommander;
import edu.school21.printer.logic.Args;
import edu.school21.printer.logic.Converter;

public class Program {
    public static void main(String[] args) {
        try {
            Args jArgs = new Args();
            JCommander.newBuilder()
                    .addObject(jArgs)
                    .build()
                    .parse(args);
            Converter converter = new Converter(jArgs, "src/ex02/ImagesToChar/src/manifest.txt");
            Converter.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}