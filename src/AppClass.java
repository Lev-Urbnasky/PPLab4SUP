import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AppClass extends JFrame {
    private String [] listOfFigures = {GeomFigType.SPHERE.toString(), GeomFigType.CONE.toString(),
            GeomFigType.PARALP.toString(), GeomFigType.RECTANGLE.toString(), GeomFigType.CIRCLE.toString()};

    private GeomFigure currentFigure;

    private JPanel leftPanel = new JPanel();
    private JComboBox box = new JComboBox(listOfFigures);
    private JButton calucalteButton = new JButton("Calculate!");

    private JPanel rightPanel = new JPanel();
    private JTextField lengthInput = new JTextField(10);
    private JLabel lengthInputLabel = new JLabel();
    private JTextField widthInput = new JTextField(10);
    private JLabel widthLabel = new JLabel();
    private JTextField heigthInput = new JTextField(10);
    private JLabel heigthLabel = new JLabel();

    private JTextField leftResultField = new JTextField(10);
    private JLabel leftResultLabel = new JLabel();

    private JTextField rightResultField = new JTextField(10);
    private JLabel rightResultLabel = new JLabel();

    AppClass() {
        this.setTitle("Super Mega Cool Lab App for PP");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(2,2));

        this.leftPanel.setLayout(new GridLayout(2,1));
        this.leftPanel.add(box);
        this.leftPanel.add(calucalteButton);

        this.getContentPane().add(this.leftPanel);

        this.box.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {

                        }
                    }
                }
        );
        //this.add(box);
        this.currentFigure = new GeomFigure(GeomFigType.SPHERE);
        this.currentFigure.setHeigth(0);
        this.currentFigure.setLength(0);
        this.currentFigure.setWidth(0);
    }

    public static void main (String[] args) {
        AppClass app = new AppClass();
        app.pack();
        app.setVisible(true);
    }
}
