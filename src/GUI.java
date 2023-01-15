import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    private JTextArea textArea1;
    private JButton volumeSortButton;
    private JButton surfaceAreaSortButton;
    private JButton nameSortButton;


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
                        Cylinder Cylinder = new Cylinder(radius, height2);
                        surfaceArea = Cylinder.getSurfaceArea();
                        volume = Cylinder.getVolume();
                        break;
                    case "Ellipsoid":
                        double a = Double.parseDouble(lengthField.getText());
                        double b = Double.parseDouble(widthField.getText());
                        double c = Double.parseDouble(heightField.getText());
                        Ellipsoid Ellipsoid = new Ellipsoid(a, b, c);
                        surfaceArea = Ellipsoid.getSurfaceArea();
                        volume = Ellipsoid.getVolume();
                        break;
                    case "Sphere":
                        double radius2 = Double.parseDouble(radiusField.getText());
                        Ellipsoid Sphere = new Ellipsoid.Sphere(radius2);
                        surfaceArea = Sphere.getSurfaceArea();
                        volume = Sphere.getVolume();
                        break;
                    case "Prism":
                        double base = Double.parseDouble(baseField.getText());
                        double perimeter = Double.parseDouble(perimeterField.getText());
                        double height3 = Double.parseDouble(heightField.getText());
                        Prism Prism = new Prism(base, perimeter, height3);
                        surfaceArea = Prism.getSurfaceArea();
                        volume = Prism.getVolume();
                        break;
                    case "Rectangular Pyramid":
                        double length1 = Double.parseDouble(lengthField.getText());
                        double width1 = Double.parseDouble(widthField.getText());
                        double height1 = Double.parseDouble(heightField.getText());
                        RectangularPyramid RectangularPyramid = new RectangularPyramid(length1, width1, height1);
                        surfaceArea = RectangularPyramid.getSurfaceArea();
                        volume = RectangularPyramid.getVolume();
                        break;
                    case "Pyramid":
                        double baseArea = Double.parseDouble(lengthField.getText());
                        double perimeter1 = Double.parseDouble(widthField.getText());
                        double height4 = Double.parseDouble(heightField.getText());
                        RectangularPyramid Pyramid = new RectangularPyramid.Pyramid(baseArea, perimeter1, height4);
                        surfaceArea = Pyramid.getSurfaceArea();
                        volume = Pyramid.getVolume();
                        break;
                    case "Rectangular Solid":
                        double length = Double.parseDouble(lengthField.getText());
                        double width = Double.parseDouble(widthField.getText());
                        double height = Double.parseDouble(heightField.getText());
                        RectangularSolid RectangularSolid = new RectangularSolid(length, width, height);
                        surfaceArea = RectangularSolid.getSurfaceArea();
                        volume = RectangularSolid.getVolume();
                        break;
                    case "Cube":
                        double side = Double.parseDouble(lengthField.getText());
                        RectangularSolid Cube = new RectangularSolid.Cube(side);
                        surfaceArea = Cube.getSurfaceArea();
                        volume = Cube.getVolume();
                        break;
                    case "Right Circular Cone":
                        double radius1 = Double.parseDouble(radiusField.getText());
                        double height5 = Double.parseDouble(heightField.getText());
                        RightCircularCone RightCircularCone = new RightCircularCone(radius1, height5);
                        surfaceArea = RightCircularCone.getSurfaceArea();
                        volume = RightCircularCone.getVolume();
                        break;
                    case "Tetrahedron":
                        double sideLength = Double.parseDouble(lengthField.getText());
                        Tetrahedron Tetrahedron = new Tetrahedron(sideLength);
                        surfaceArea = Tetrahedron.getSurfaceArea();
                        volume = Tetrahedron.getVolume();
                        break;
                }

                saveButton.setEnabled(false);
                nameField.setEnabled(false);
                comboBox1.setEnabled(false);
                lengthField.setEnabled(false);
                widthField.setEnabled(false);
                heightField.setEnabled(false);
                baseField.setEnabled(false);
                perimeterField.setEnabled(false);
                radiusField.setEnabled(false);


                DecimalFormat df = new DecimalFormat("#.##");
                textArea1.append(shape + " - Surface Area: " + df.format(surfaceArea) + " - Volume: " + df.format(volume) + "\n");

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                lengthField.setText("");
                widthField.setText("");
                heightField.setText("");
                baseField.setText("");
                perimeterField.setText("");
                radiusField.setText("");
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


        volumeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Figure> figuresList = null;
                Collections.sort(figuresList, new VolumeComparator());

                textArea1.setText("");
                for(Figure f : figuresList) {
                    textArea1.append(f.getShape() + " - Surface Area: " + f.getSurfaceArea() + " - Volume: " + f.getVolume()+"\n");
                }
            }
        });

        surfaceAreaSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Figure> figuresList = new ArrayList<>();
                Collections.sort(figuresList, new SurfaceAreaComparator());

                textArea1.setText("");
                for(Figure f : figuresList) {
                    textArea1.append(f.getShape() + " - Surface Area: " + f.getSurfaceArea() + " - Volume: " + f.getVolume()+"\n");
                }
            }
        });


        nameSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Figure> figuresList = new ArrayList<>();
                Collections.sort(figuresList, new FigureComparator());

                textArea1.setText("");
                for(Figure f : figuresList) {
                    textArea1.append(f.getShape() + " - Surface Area: " + f.getSurfaceArea() + " - Volume: " + f.getVolume()+"\n");
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
