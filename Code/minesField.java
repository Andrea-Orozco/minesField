import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
public class minesField extends JFrame {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        minesField welcomeWindow = new minesField();
        welcomeWindow.setTitle("Mines Field :)");
        welcomeWindow.setSize(500,500);
        welcomeWindow.setVisible(true);
        welcomeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel picLabel;
        String labelText = "";

        try {
            BufferedImage picture = ImageIO.read(new File("explosive.jpg"));
            picLabel = new JLabel(new ImageIcon(picture));
        } catch (Exception e) {
            labelText = "Imagen no Encontrada";
            picLabel = new JLabel(labelText);
        }

        welcomeWindow.add(picLabel);
    }
}