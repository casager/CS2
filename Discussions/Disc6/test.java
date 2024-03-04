import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
    JSlider slider;

    public test() {
        super("Media Time Slider");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        add(slider);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}