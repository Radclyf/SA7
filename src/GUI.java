import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JTextField radiusField;
    private JTextField widthField;
    private JTextField lengthField;
    private JTextField heightField;
    private JTextField baseField;
    private JTextField perimeterField;


    public GUI() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                String shape = (String) comboBox1.getSelectedItem();
                double surfaceArea = 0;
                double volume = 0;

                switch (shape) {
                    case "Cylinder":
                        double radius = Double.parseDouble(radiusField.getText());
                        double height2 = Double.parseDouble(heightField.getText());
                        surfaceArea = 2 * Math.PI * radius * height2 + 2 * Math.PI * Math.pow(radius, 2);
                        volume = Math.PI * Math.pow(radius, 2) * height2;
                        break;
                    case "Ellipsoid":
                        double a = Double.parseDouble(lengthField.getText());
                        double b = Double.parseDouble(widthField.getText());
                        double c = Double.parseDouble(heightField.getText());
                        surfaceArea = 4 * Math.PI * Math.sqrt(((a*b) + (b*c) + (a*c))/3);
                        volume = (4.0 / 3.0) * Math.PI * a * b * c;
                        break;
                    case "Sphere":
                        double radius2 = Double.parseDouble(radiusField.getText());
                        surfaceArea = 4 * Math.PI * Math.pow(radius2, 2);
                        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius2, 3);
                        break;
                    case "Prism":
                        double base = Double.parseDouble(baseField.getText());
                        double perimeter = Double.parseDouble(perimeterField.getText());
                        double height3 = Double.parseDouble(heightField.getText());
                        surfaceArea = 2 * base + perimeter * height3;
                        volume = base * height3;
                        break;
                    case "Rectangular Pyramid":
                        double length1 = Double.parseDouble(lengthField.getText());
                        double width1 = Double.parseDouble(widthField.getText());
                        double height1 = Double.parseDouble(heightField.getText());
                        surfaceArea = length1 * width1 + length1 * Math.sqrt(Math.pow(width1 / 2, 2) + Math.pow(height1, 2) + width1) * Math.sqrt(Math.pow(1 / 2, 2) + Math.pow(height1, 2));
                        volume = length1 * width1 * height1 / 3;
                        break;

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setContentPane(new GUI().mainPanel);
        frame.setVisible(true);
    }
}
