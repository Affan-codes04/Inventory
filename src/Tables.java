import javax.swing.*;
import java.awt.*;

public class Tables extends JFrame {
    String Driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "affan";
    String Password = "Smriti";

    public Tables(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.DARK_GRAY);
        p3.setBounds(220,10,1137,700);
        add(p3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Tables();
    }
}
