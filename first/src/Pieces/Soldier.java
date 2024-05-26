package Pieces;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class Soldier {

    public Image WSoldier() {
        try (InputStream is = getClass().getResourceAsStream("/img/WPawn.png")) {
            if (is == null) {
                throw new FileNotFoundException("Image file WBishop.png not found");
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null if the image cannot be read
        }
    }

    public Image BSoldier() {
        try (InputStream is = getClass().getResourceAsStream("/img/BPawn.png")) {
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