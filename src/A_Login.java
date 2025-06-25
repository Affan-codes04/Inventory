import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_Login extends JFrame {
    private JPanel MainPanel;
    private JTextField ustxt;
    private JPanel panel1;
    private JLabel iclbl;
    private JLabel wllbl;
    private JPasswordField pw;
    private JButton submbtn;
    private JLabel userlbl;
    private JLabel pwlbl;
    private JButton clbtn;
    private JLabel icnlbl;
    String Username,password,us,pass;
    public A_Login(){
        this.setContentPane(MainPanel);
        this.setSize(900,500);
        this.setTitle("Login_and_Sign_up.Login");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon i = new ImageIcon("C:\\Users\\Admin\\Pictures\\Saved Pictures\\la.jpg");
        Image im = i.getImage().getScaledInstance(iclbl.getWidth(),iclbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(im);
        iclbl.setIcon(img);
        ImageIcon i1 = new ImageIcon("C:\\Users\\Admin\\Pictures\\Saved Pictures\\li.jpg");
        Image im1 = i1.getImage().getScaledInstance(icnlbl.getWidth(),icnlbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(im1);
        icnlbl.setIcon(img1);

        submbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = set();
                    if (a == 1){
                        String k = ustxt.getText();
                        System.out.println(k);
                        setVisible(false);
                        new ALoading();
                    }
                    else{
                        JOptionPane.showMessageDialog(submbtn,"Invalid Username/Password...");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        clbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
/*    public void initialize(){


    }*/
    public int set() throws SQLException, ClassNotFoundException {
        int x;
        String un = "Admin";
        String ps = "12345";
        Username = ustxt.getText();
        char[] q = pw.getPassword();
        password = new String(q);
        if (Username.equals(un) && password.equals(ps)){
            x = 1;
        }
        else{
            x = -1;
        };
        return x;
    }

    public static void main(String[] args) {
        A_Login ob = new A_Login();
    }
}

