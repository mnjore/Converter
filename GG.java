//gui code for part (b)
import javax.swing.*;

public class GG extends JFrame {
    private JLabel Number;
    private JLabel Decimal;
    private JLabel Remarks;
    private JLabel Binaryy;
    private JTextField N1;
    private JTextField D2;
    private JTextField B2;
    private JTextField R2;
    private JTextField N2;
    private JTextField D1;
    private JTextField B1;
    private JTextField R1;
    private JPanel mainPanel;

    public GG(){
        setContentPane(mainPanel);
        setTitle("Result");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        //Constructor
        GG test = new GG();
    }

}

