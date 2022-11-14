// gui code for part (a)
import javax.swing.*;

public class HH extends JFrame{
    private JLabel Decimal;
    private JLabel Binary;
    private JLabel Hex;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JPanel mainPanel;

    public HH(){
        setContentPane(mainPanel);
        setTitle("Result");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        //Constructor
        HH test = new HH();
    }
}
