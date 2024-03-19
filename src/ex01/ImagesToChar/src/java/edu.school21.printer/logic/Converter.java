package edu.school21.printer.logic;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Converter {

    private final BufferedImage image;

    public Converter() {
        try {
            this.image = ImageIO.read(new File("src/ex01/ImagesToChar/src/resources/it.bmp"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);

                if (pixel == Color.WHITE.getRGB()) {
                    System.out.print(".");
                } else if (pixel == Color.BLACK.getRGB()) {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
