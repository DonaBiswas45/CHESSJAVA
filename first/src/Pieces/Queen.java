package Pieces;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class Queen {

    public Image WQueen() {
        try (InputStream is = getClass().getResourceAsStream("/img/WQueen.png")) {
            if (is == null) {
                throw new FileNotFoundException("Image file WBishop.png not found");
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null if the image cannot be read
        }
    }

    public Image BQueen() {
        try (InputStream is = getClass().getResourceAsStream("/img/BQueen.png")) {
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