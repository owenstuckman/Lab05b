
// Imports 
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Main Class 
public class ImageDisplay {
    public static void main(String[] args) {
     
        JFrame frame = new JFrame(); // Creates image voundries 
        ImageIcon icon = new ImageIcon("Oogway.jpg"); // Sources Image from file exploerer  
        Image image = icon.getImage(); // Sets image to source 
        JLabel label = new JLabel(icon); 
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes picture when tab is closed 
        frame.pack();
        frame.setVisible(true); // Makes visiable 
    }
}
