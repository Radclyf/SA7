import javax.swing.*;

public class GUI {
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JButton saveButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setContentPane(new GUI().mainPanel);
        frame.setVisible(true);
    }
}
