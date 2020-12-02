package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class BufferedImageCustom {
    public Image imageIcon() throws IOException {
        Image image;

        InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
        BufferedImage bImage2 = ImageIO.read(bis);
        image = bImage2;

        return image;
    }
}
