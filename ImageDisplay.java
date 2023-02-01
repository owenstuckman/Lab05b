import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("Oogway.jpg");
        Image image = icon.getImage();
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
