import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChanger extends JFrame implements ActionListener {
    final private JPanel panel;
    final private JButton redBtn, greenBtn, blueBtn, yellowBtn, grayBtn, magentaBtn;
    public ColorChanger(){
        super("Color Changer by EKI");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        redBtn = new JButton("Red");
        greenBtn = new JButton("Green");
        blueBtn = new JButton("Blue");
        yellowBtn = new JButton("Yellow");
        grayBtn = new JButton("Gray");
        magentaBtn = new JButton("Magenta");

        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        yellowBtn.addActionListener(this);
        grayBtn.addActionListener(this);
        magentaBtn.addActionListener(this);

        panel.add(redBtn);
        panel.add(greenBtn);
        panel.add(blueBtn);
        panel.add(yellowBtn);
        panel.add(grayBtn);
        panel.add(magentaBtn);

        add(panel);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == redBtn){
            panel.setBackground(Color.RED);
        } else if (e.getSource() == greenBtn) {
            panel.setBackground(Color.GREEN);
        } else if (e.getSource() == blueBtn) {
            panel.setBackground(Color.BLUE);
        } else if (e.getSource() == yellowBtn) {
            panel.setBackground(Color.YELLOW);
        } else if (e.getSource() == grayBtn) {
            panel.setBackground(Color.GRAY);
        } else if (e.getSource() == magentaBtn){
            panel.setBackground(Color.MAGENTA);
        }

    }

    public static void main(String[] args){
        new ColorChanger();
    }

}
