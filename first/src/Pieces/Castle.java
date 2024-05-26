package Pieces;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class Castle {

    public Image WCastle() {
        try (InputStream is = getClass().getResourceAsStream("/img/WRook.png")) {
            if (is == null) {
                throw new FileNotFoundException("Image file WBishop.png not found");
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null if the image cannot be read
        }
    }

    public Image BCastle() {
        try (InputStream is = getClass().getResourceAsStream("/img/BRook.png")) {
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