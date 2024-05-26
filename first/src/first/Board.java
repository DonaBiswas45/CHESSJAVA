package first;

import javax.swing.*;
import Pieces.Bishop;
import Pieces.Castle;
import Pieces.Knight;
import Pieces.Queen;
import Pieces.King;
import Pieces.Soldier;
import java.awt.*;

public class Board {
   
	private void setButtonIcon(JButton button, Image img) {
        if (img != null) {
            ImageIcon icon = new ImageIcon(img.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
            button.setIcon(icon);
        }
    }

    Board() {
        JFrame J = new JFrame("Board");
        J.setSize(600, 600);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(8, 8));
        boolean black = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton bt = new JButton();
                Image img = null;

                if (black)
                    bt.setBackground( Color.LIGHT_GRAY);
                else
                    bt.setBackground(Color.WHITE);

                bt.setLayout(new BorderLayout());

                if (i == 0 || i == 7 || i == 1 || i == 6) {
                    if (i == 0 || i == 7) {
                        if (j == 0 || j == 7) {
                            Castle ct = new Castle();
                            img = (i == 0) ? ct.WCastle() : ct.BCastle();
                        } else if (j == 2 || j == 6) { 
                            Knight kn = new Knight();
                            img = (i == 0) ? kn.WKnight() : kn.BKnight();
                        } else if (j == 1 || j == 5) {
                            Bishop bs = new Bishop();
                            img = (i == 0) ? bs.WBishop() : bs.BBishop();
                        } else if (j == 4) {
                            King ki = new King();
                            img = (i == 0) ? ki.WKing() : ki.BKing();
                        } else if (j == 3) { 
                            Queen qu = new Queen();
                            img = (i == 0) ? qu.WQueen() : qu.BQueen();
                        }
                    } else if (i == 1 || i == 6) { 
                        Soldier so = new Soldier();
                        img = (i == 1) ? so.WSoldier() : so.BSoldier();
                    }
                }

                setButtonIcon(bt, img);
                panel.add(bt);
                black = !black;
            }
            black = !black;
        }

        J.add(panel);
        J.setVisible(true);
    }

}
