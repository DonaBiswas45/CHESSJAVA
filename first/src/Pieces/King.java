package Pieces;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class King {

    public Image WKing() {
        try (InputStream is = getClass().getResourceAsStream("/img/WKing.png")) {
            if (is == null) {
                throw new FileNotFoundException("Image file WBishsop.png not found");
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null if the image cannot be read
        }
    }

    public Image BKing() {
        try (InputStream is = getClass().getResourceAsStream("/img/BKing (1).png")) {
            if (is == null) {
                throw new FileNotFoundException("Image file BBishop.png not found");
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null if the image cannot be read
        }
    }
}