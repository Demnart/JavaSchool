package MVCXOGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Артем on 14.10.2016.
 */
public class GameWindowTest extends JFrame {
    public void init(){
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout()); Всегда по умолчанию!!!

        JButton jButton = new JButton("Hello");
        JButton jButton2 = new JButton("Bye");
        add(jButton,BorderLayout.CENTER);
        add(jButton2, BorderLayout.NORTH);
        add(new JButton("SWING"), BorderLayout.SOUTH);
        add(new JButton("SWING"), BorderLayout.EAST);
        add(new JButton("SWING"), BorderLayout.WEST);
    }
}
