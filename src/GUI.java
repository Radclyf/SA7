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
    private JLabel surfaceAreaField;
    private JLabel volumeField;
    private JLabel nameField;
    private JButton clearButton;
    private JButton loadButton;


    public GUI() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
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
                    case "Pyramid":
                        double baseArea = Double.parseDouble(lengthField.getText());
                        double perimeter1 = Double.parseDouble(widthField.getText());
                        double height4 = Double.parseDouble(heightField.getText());
                        surfaceArea = (baseArea + (perimeter1 * height4)) / 2;
                        volume = (baseArea * height4) / 3;
                        break;
                    case "Rectangular Solid":
                        double length = Double.parseDouble(lengthField.getText());
                        double width = Double.parseDouble(widthField.getText());
                        double height = Double.parseDouble(heightField.getText());
                        surfaceArea = 2 * (length * width + width * height + length * height);
                        volume = length * width * height;
                        break;
                    case "Cube":
                        double side = Double.parseDouble(lengthField.getText());
                        surfaceArea = 6 * side * side;
                        volume = side * side * side;
                        break;
                    case "Right Circular Cone":
                        double radius1 = Double.parseDouble(radiusField.getText());
                        double height5 = Double.parseDouble(heightField.getText());
                        surfaceArea = Math.PI * radius1 * (radius1 + Math.sqrt(Math.pow(height5, 2) + Math.pow(radius1, 2)));
                        volume = Math.PI * Math.pow(radius1, 2) * height5 / 3;
                        break;
                    case "Tetrahedron":
                        double sideLength = Double.parseDouble(lengthField.getText());
                        surfaceArea = Math.sqrt(3) * (sideLength * sideLength);
                        volume = (Math.pow(sideLength,3))/(6 * Math.sqrt(2));
                        break;
                }

                surfaceAreaField.setText(String.valueOf(surfaceArea));
                volumeField.setText(String.valueOf(volume));

                saveButton.setEnabled(false);
                nameField.setEnabled(false);
                comboBox1.setEnabled(false);
                lengthField.setEnabled(false);
                widthField.setEnabled(false);
                heightField.setEnabled(false);
                baseField.setEnabled(false);
                perimeterField.setEnabled(false);
                radiusField.setEnabled(false);

                JTextArea figuresTextArea = new JTextArea();
                figuresTextArea.append(name + " - " + shape + " - Surface Area: " + surfaceArea + " - Volume: " + volume);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                comboBox1.setSelectedIndex(0);
                nameField.setEnabled(true);
                comboBox1.setEnabled(true);
                saveButton.setEnabled(true);
                lengthField.setEnabled(true);
                widthField.setEnabled(true);
                heightField.setEnabled(true);
                baseField.setEnabled(true);
                perimeterField.setEnabled(true);
                radiusField.setEnabled(true);
            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = loadButton.getText();
                try{
                    int index = Integer.parseInt(input);
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Invalid Input! Please enter a valid number.");
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
