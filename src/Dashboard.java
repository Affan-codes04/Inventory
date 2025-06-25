/*
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Dashboard extends JFrame {
    JButton home,customer,category,brand,supplier,product,purchase,order,logout;
    JLayeredPane layers;
    JLabel l1;
    JTable customers,categories,brands,suppliers,products,purchases,orders;
    JScrollPane scp;
    String Driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "affan";
    String Password = "Smriti";
    public void switchPanel(JPanel p){
        layers.removeAll();
        layers.add(p);
        layers.repaint();
        layers.revalidate();
        layers.setVisible(true);
    }
    public Dashboard(String str) throws SQLException, ClassNotFoundException {

        Class.forName(Driver);
        Connection con = DriverManager.getConnection(url,username,Password);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.DARK_GRAY);
        p1.setBounds(10,10,200,70);
        add(p1);

*/
/*      JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.DARK_GRAY);
        p2.setBounds(10,88,200,620);
        add(p2);*//*


        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.DARK_GRAY);
        p3.setBounds(220,10,1137,70);
        add(p3);

        JPanel p4= new JPanel();
        p4.setLayout(null);
        p4.setBackground(Color.GRAY);
        p4.setBounds(10,88,1345,620);
        add(p4);

        JPanel p5= new JPanel();
        p5.setLayout(null);
        p5.setBackground(Color.GRAY);
        p5.setBounds(10,88,1345,620);

        customers = new JTable();
        String q = "SELECT *FROM Customers";
        PreparedStatement ps = con.prepareStatement(q);
        ResultSet r = ps.executeQuery();
        customers.setModel(DbUtils.resultSetToTableModel(r));
        customers.setBackground(Color.WHITE);
        customers.setRowHeight(50);
        customers.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        scp = new JScrollPane();
        scp.setBounds(0,0,1340,500);
        scp.setViewportView(customers);
        p5.add(scp);

        JButton add = new JButton("Add");
        add.setBounds(600,530,100,70);
        add.setBackground(Color.DARK_GRAY);
        add.setForeground(Color.WHITE);
        add.setBorder(new LineBorder(Color.darkGray));
        add.setFont(new Font(Font.SERIF,Font.BOLD,20));

        p5.add(add);

        JPanel p6= new JPanel();
        p6.setLayout(null);
        p6.setBackground(Color.GRAY);
        p6.setBounds(10,88,1345,620);

        categories = new JTable();
        String q1 = "SELECT *FROM Category";
        PreparedStatement ps1 = con.prepareStatement(q1);
        ResultSet r1 = ps1.executeQuery();
        categories.setModel(DbUtils.resultSetToTableModel(r1));
        categories.setBackground(Color.WHITE);
        categories.setRowHeight(50);
        categories.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp1 = new JScrollPane();
        scp1.setBounds(0,0,1340,500);
        scp1.setViewportView(categories);
        p6.add(scp1);

        p6.add(add);

        JPanel p7= new JPanel();
        p7.setLayout(null);
        p7.setBackground(Color.GRAY);
        p7.setBounds(10,88,1345,620);

        brands = new JTable();
        String q2 = "SELECT *FROM Brand";
        PreparedStatement ps2 = con.prepareStatement(q2);
        ResultSet r2 = ps2.executeQuery();
        brands.setModel(DbUtils.resultSetToTableModel(r2));
        brands.setBackground(Color.WHITE);
        brands.setRowHeight(50);
        brands.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp2 = new JScrollPane();
        scp2.setBounds(0,0,1340,500);
        scp2.setViewportView(brands);
        p7.add(scp2);

        p7.add(add);

        JPanel p8= new JPanel();
        p8.setLayout(null);
        p8.setBackground(Color.GRAY);
        p8.setBounds(10,88,1345,620);

        suppliers = new JTable();
        String q3 = "SELECT *FROM Suppliers";
        PreparedStatement ps3 = con.prepareStatement(q3);
        ResultSet r3 = ps3.executeQuery();
        suppliers.setModel(DbUtils.resultSetToTableModel(r3));
        suppliers.setBackground(Color.WHITE);
        suppliers.setRowHeight(50);
        suppliers.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp3 = new JScrollPane();
        scp3.setBounds(0,0,1340,500);
        scp3.setViewportView(suppliers);
        p8.add(scp3);

        p8.add(add);

        JPanel p9= new JPanel();
        p9.setLayout(null);
        p9.setBackground(Color.GRAY);
        p9.setBounds(10,88,1345,620);

        products = new JTable();
        String q4 = "SELECT *FROM Products";
        PreparedStatement ps4 = con.prepareStatement(q4);
        ResultSet r4 = ps4.executeQuery();
        products.setModel(DbUtils.resultSetToTableModel(r4));
        products.setBackground(Color.WHITE);
        products.setRowHeight(50);
        products.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp4 = new JScrollPane();
        scp4.setBounds(0,0,1340,500);
        scp4.setViewportView(products);
        p9.add(scp4);

        p9.add(add);

        JPanel p10= new JPanel();
        p10.setLayout(null);
        p10.setBackground(Color.WHITE);
        p10.setBounds(10,88,1345,620);

        purchases = new JTable();
        String q5 = "SELECT *FROM Purchase";
        PreparedStatement ps5 = con.prepareStatement(q5);
        ResultSet r5 = ps5.executeQuery();
        purchases.setModel(DbUtils.resultSetToTableModel(r5));
        purchases.setBackground(Color.WHITE);
        purchases.setRowHeight(50);
        purchases.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp5 = new JScrollPane();
        scp5.setBounds(0,0,1340,500);
        scp5.setViewportView(purchases);
        p10.add(scp5);

        p10.add(add);

        JPanel p11= new JPanel();
        p11.setLayout(null);
        p11.setBackground(Color.WHITE);
        p11.setBounds(10,88,1345,620);

        orders = new JTable();
        String q6 = "SELECT *FROM Orders";
        PreparedStatement ps6 = con.prepareStatement(q6);
        ResultSet r6 = ps6.executeQuery();
        orders.setModel(DbUtils.resultSetToTableModel(r6));
        orders.setBackground(Color.WHITE);
        orders.setRowHeight(50);
        orders.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        JScrollPane scp6 = new JScrollPane();
        scp6.setBounds(0,0,1340,500);
        scp6.setViewportView(orders);
        p11.add(scp6);

        p11.add(add);

        JLabel luser = new JLabel(str);
        luser.setBounds(20,20,150,30);
        luser.setForeground(Color.WHITE);
        luser.setFont(new Font(Font.SERIF,Font.BOLD,25));
        p1.add(luser);


        layers = new JLayeredPane();
        layers.setBounds(0,7,1345,620);
        layers.add(p4);

        add(layers);

        home = new JButton("Home");
        home.setBounds(0,0,100,70);
        home.setBackground(Color.DARK_GRAY);
        home.setForeground(Color.WHITE);
        home.setBorder(new LineBorder(Color.darkGray));
        home.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //apdetails.addActionListener(this);
        p3.add(home);

        customer = new JButton("Customer");
        customer.setBounds(100,0,100,70);
        customer.setBackground(Color.DARK_GRAY);
        customer.setForeground(Color.WHITE);
        customer.setBorder(new LineBorder(Color.darkGray));
        customer.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //updetails.addActionListener(this);
        p3.add(customer);

        category = new JButton("Category");
        category.setBounds(200,0,100,70);
        category.setBackground(Color.DARK_GRAY);
        category.setForeground(Color.WHITE);
        category.setBorder(new LineBorder(Color.darkGray));
        category.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //vdetails.addActionListener(this);
        p3.add(category);

        brand= new JButton("Brands");
        brand.setBounds(300,0,100,70);
        brand.setBackground(Color.DARK_GRAY);
        brand.setForeground(Color.WHITE);
        brand.setBorder(new LineBorder(Color.darkGray));
        brand.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(brand);

        supplier = new JButton("Supplier");
        supplier.setBounds(400,0,100,70);
        supplier.setBackground(Color.DARK_GRAY);
        supplier.setForeground(Color.WHITE);
        supplier.setBorder(new LineBorder(Color.darkGray));
        supplier.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(supplier);

        product = new JButton("Product");
        product.setBounds(500,0,100,70);
        product.setBackground(Color.DARK_GRAY);
        product.setForeground(Color.WHITE);
        product.setBorder(new LineBorder(Color.darkGray));
        product.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(product);

        purchase = new JButton("Purchases");
        purchase.setBounds(600,0,100,70);
        purchase.setBackground(Color.DARK_GRAY);
        purchase.setForeground(Color.WHITE);
        purchase.setBorder(new LineBorder(Color.darkGray));
        purchase.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(purchase);

        order = new JButton("Orders");
        order.setBounds(700,0,100,70);
        order.setBackground(Color.DARK_GRAY);
        order.setForeground(Color.WHITE);
        order.setBorder(new LineBorder(Color.DARK_GRAY));
        order.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(order);

        logout = new JButton("Logout");
        logout.setBounds(950,0,150,70);
        logout.setBackground(Color.DARK_GRAY);
        logout.setForeground(Color.WHITE);
        logout.setBorder(new LineBorder(Color.DARK_GRAY));
        logout.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //logout.setIcon(i);
        p3.add(logout);
        //JLabel l = new JLabel(i);
        //l.setBounds(900,0,50,70);
        //p3.add(l);

        JButton addProduct = new JButton("Add");
        addProduct.setBounds(800,0,50,70);
        addProduct.setBackground(Color.DARK_GRAY);
        addProduct.setForeground(Color.WHITE);
        addProduct.setBorder(new LineBorder(Color.DARK_GRAY));
        addProduct.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(addProduct);

        JButton edit = new JButton("Edit");
        edit.setBounds(850,0,50,70);
        edit.setBackground(Color.DARK_GRAY);
        edit.setForeground(Color.WHITE);
        edit.setBorder(new LineBorder(Color.DARK_GRAY));
        edit.setFont(new Font(Font.SERIF,Font.BOLD,20));
        p3.add(edit);

        customer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p5);
            }
        });
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p6);
            }
        });
        brand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p7);
            }
        });
        supplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p8);
            }
        });
        product.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p9);
            }
        });
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p10);
            }
        });
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(p11);
            }
        });



        setVisible(true);

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Dashboard("Affan");
    }
}
*/
/*
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.*;

public class Dashboard extends JFrame {
    JButton home, customer, category, brand, supplier, product, purchase, order, logout;
    JLayeredPane layers;
    String Driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "affan";
    String Password = "Smriti";

    public void switchPanel(JPanel p) {
        layers.removeAll();
        layers.add(p);
        layers.revalidate(); // Ensures layout adjustments
        layers.repaint();    // Ensures any visual update
    }

    public Dashboard(String str) throws SQLException, ClassNotFoundException {
        // Database Connection
        Class.forName(Driver);
        Connection con = DriverManager.getConnection(url, username, Password);

        // Main Frame Configuration
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout()); // Use BorderLayout for main frame layout

        // Side Panel for User Information
*/
/*        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.setBackground(Color.DARK_GRAY);
        JLabel luser = new JLabel(str);
        luser.setForeground(Color.WHITE);
        luser.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        p1.add(luser);*//*


        // Top Menu Panel with Buttons
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Flow layout for button arrangement
        p3.setBackground(Color.DARK_GRAY);

        // Menu Buttons
        home = createMenuButton("Home");
        customer = createMenuButton("Customer");
        category = createMenuButton("Category");
        brand = createMenuButton("Brands");
        supplier = createMenuButton("Supplier");
        product = createMenuButton("Product");
        purchase = createMenuButton("Purchases");
        order = createMenuButton("Orders");
        logout = createMenuButton("Logout");

        // Add Action Listeners for Switching Panels
        customer.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Customers", con)));
        category.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Category", con)));
        brand.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Brand", con)));
        supplier.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Suppliers", con)));
        product.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Products", con)));
        purchase.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Purchase", con)));
        order.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Orders", con)));

        // Add Buttons to the Top Menu Panel
        p3.add(home);
        p3.add(customer);
        p3.add(category);
        p3.add(brand);
        p3.add(supplier);
        p3.add(product);
        p3.add(purchase);
        p3.add(order);
        p3.add(logout);

        // Layered Pane for Dynamic Content
        layers = new JLayeredPane();
        layers.setLayout(new BorderLayout());
        switchPanel(createPanelWithTable("SELECT * FROM Customers", con));

        // Add Components to the Frame
        //add(p1, BorderLayout.NORTH);
        add(p3, BorderLayout.NORTH);
        add(layers, BorderLayout.CENTER);

        setVisible(true); // Ensure visibility after adding all components
    }

    private JButton createMenuButton(String title) {
        JButton button = new JButton(title);
        button.setPreferredSize(new Dimension(100, 70)); // Set preferred size for visibility
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setBorder(new LineBorder(Color.DARK_GRAY));
        button.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        return button;
    }

    private JPanel createPanelWithTable(String query, Connection con) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.GRAY);

        try {
            JTable table = new JTable();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.setBackground(Color.WHITE);
            table.setRowHeight(30);
            table.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton addButton = new JButton("Add New Entry");
        addButton.setPreferredSize(new Dimension(150, 40));
        addButton.setBackground(Color.DARK_GRAY);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        buttonPanel.add(addButton);

        JButton editButton = new JButton("Edit Existing Entry");
        editButton.setPreferredSize(new Dimension(150, 40));
        editButton.setBackground(Color.DARK_GRAY);
        editButton.setForeground(Color.WHITE);
        editButton.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        buttonPanel.add(editButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        try {
            new Dashboard("Affan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Dashboard extends JFrame {
    JButton home, customer, category, brand, supplier, product, purchase, order, logout;
    JLayeredPane layers;
    Connection con;
    String Driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "affan";
    String Password = "Smriti";

    public void switchPanel(JPanel p) {
        layers.removeAll();
        layers.add(p);
        layers.revalidate();
        layers.repaint();
    }

    public Dashboard(String str) throws SQLException, ClassNotFoundException {
        // Database Connection
        Class.forName(Driver);
        con = DriverManager.getConnection(url, username, Password);

        // Main Frame Configuration
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Menu Panel with Buttons
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        p3.setBackground(Color.DARK_GRAY);

        // Menu Buttons
        home = createMenuButton("Home");
        customer = createMenuButton("Customer");
        category = createMenuButton("Category");
        brand = createMenuButton("Brands");
        supplier = createMenuButton("Supplier");
        product = createMenuButton("Product");
        purchase = createMenuButton("Purchases");
        order = createMenuButton("Orders");
        logout = createMenuButton("Logout");

        // Add Action Listeners for Switching Panels
        customer.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Customers", con)));
        category.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Category", con)));
        brand.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Brand", con)));
        supplier.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Suppliers", con)));
        product.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Products", con)));
        purchase.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Purchase", con)));
        order.addActionListener(e -> switchPanel(createPanelWithTable("SELECT * FROM Orders", con)));

        // Add Buttons to the Top Menu Panel
        p3.add(home);
        p3.add(customer);
        p3.add(category);
        p3.add(brand);
        p3.add(supplier);
        p3.add(product);
        p3.add(purchase);
        p3.add(order);
        p3.add(logout);

        // Layered Pane for Dynamic Content
        layers = new JLayeredPane();
        layers.setLayout(new BorderLayout());
        switchPanel(createPanelWithTable("SELECT * FROM Customers", con));

        // Add Components to the Frame
        add(p3, BorderLayout.NORTH);
        add(layers, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createMenuButton(String title) {
        JButton button = new JButton(title);
        button.setPreferredSize(new Dimension(100, 70));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setBorder(new LineBorder(Color.DARK_GRAY));
        button.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        return button;
    }

    private JPanel createPanelWithTable(String query, Connection con) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.GRAY);

        try {
            JTable table = new JTable();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.setBackground(Color.WHITE);
            table.setRowHeight(30);
            table.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton addButton = new JButton("Add New Entry");
        addButton.setPreferredSize(new Dimension(150, 40));
        addButton.setBackground(Color.DARK_GRAY);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        addButton.addActionListener(e -> new AddEntryFrame(con)); // Open AddEntryFrame on button click
        buttonPanel.add(addButton);

        JButton editButton = new JButton("Edit Entry");
        editButton.setPreferredSize(new Dimension(150, 40));
        editButton.setBackground(Color.DARK_GRAY);
        editButton.setForeground(Color.WHITE);
        editButton.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        editButton.addActionListener(e -> new EditEntryFrame(con));
        buttonPanel.add(editButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }

    // Frame for selecting the table to add a new entry
    private class AddEntryFrame extends JFrame {
        public AddEntryFrame(Connection con) {
            setTitle("Select Table");
            setSize(300, 150);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            JLabel label = new JLabel("Select Table:");
            JComboBox<String> tableSelector = new JComboBox<>(new String[]{
                    "Customers", "Category", "Brand", "Suppliers", "Products", "Purchase", "Orders"
            });
            JButton selectButton = new JButton("Next");

            selectButton.addActionListener(e -> {
                String selectedTable = (String) tableSelector.getSelectedItem();
                new EntryFormFrame(selectedTable, con);
                dispose();
            });

            add(label);
            add(tableSelector);
            add(selectButton);

            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    // Frame for entering data to add a new entry
    private class EntryFormFrame extends JFrame {
        private final Map<String, JTextField> fieldMap = new HashMap<>();

        public EntryFormFrame(String tableName, Connection con) {
            setTitle("Add Entry to " + tableName);
            setSize(400, 300);
            setLayout(new GridLayout(0, 2));
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            try {
                DatabaseMetaData metaData = con.getMetaData();
                ResultSet columns = metaData.getColumns(null, null, tableName.toUpperCase(), null);

                while (columns.next()) {
                    String columnName = columns.getString("COLUMN_NAME");
                    JLabel label = new JLabel(columnName + ": ");
                    JTextField textField = new JTextField(15);
                    fieldMap.put(columnName, textField);
                    add(label);
                    add(textField);
                }

                JButton saveButton = new JButton("Save");
                saveButton.addActionListener(e -> saveEntry(tableName, con));
                add(new JLabel()); // Filler for layout
                add(saveButton);

                setLocationRelativeTo(null);
                setVisible(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        private void saveEntry(String tableName, Connection con) {
            try {
                StringBuilder query = new StringBuilder("INSERT INTO " + tableName + " (");
                StringBuilder values = new StringBuilder("VALUES (");

                for (String columnName : fieldMap.keySet()) {
                    query.append(columnName).append(", ");
                    values.append("?, ");
                }

                query.setLength(query.length() - 2);
                values.setLength(values.length() - 2);
                query.append(") ").append(values).append(")");

                PreparedStatement ps = con.prepareStatement(query.toString());
                int i = 1;
                for (JTextField field : fieldMap.values()) {
                    ps.setString(i++, field.getText());
                }

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Entry added successfully to " + tableName);
                dispose();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private class EditEntryFrame extends JFrame {
        public EditEntryFrame(Connection con) {
            setTitle("Select Table to Edit");
            setSize(300, 150);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            JLabel label = new JLabel("Select Table:");
            JComboBox<String> tableSelector = new JComboBox<>(new String[]{
                    "Customers", "Category", "Brand", "Suppliers", "Products", "Purchase", "Orders"
            });
            JButton selectButton = new JButton("Next");

            selectButton.addActionListener(e -> {
                String selectedTable = (String) tableSelector.getSelectedItem();
                new TableSelectionFrame(selectedTable, con);
                dispose();
            });

            add(label);
            add(tableSelector);
            add(selectButton);

            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    // Frame for selecting a row in the selected table
    private class TableSelectionFrame extends JFrame {
        private final String tableName;

        public TableSelectionFrame(String tableName, Connection con) {
            this.tableName = tableName;

            setTitle("Select Entry to Edit");
            setSize(600, 400);
            setLayout(new BorderLayout());
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            JTable table = new JTable();
            try {
                PreparedStatement ps = con.prepareStatement("SELECT * FROM " + tableName);
                ResultSet rs = ps.executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                e.printStackTrace();
            }

            table.setRowHeight(25);
            table.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane, BorderLayout.CENTER);

            table.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int row = table.getSelectedRow();
                    Map<String, String> rowData = new HashMap<>();
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        rowData.put(table.getColumnName(i), table.getValueAt(row, i).toString());
                    }
                    new EditFormFrame(tableName, con, rowData);
                    dispose();
                }
            });

            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    // Frame for editing a selected entry
    private class EditFormFrame extends JFrame {
        private final Map<String, JTextField> fieldMap = new HashMap<>();
        private final Map<String, String> rowData;
        private final String tableName;

        public EditFormFrame(String tableName, Connection con, Map<String, String> rowData) {
            this.tableName = tableName;
            this.rowData = rowData;

            setTitle("Edit Entry in " + tableName);
            setSize(400, 300);
            setLayout(new GridLayout(0, 2));
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            for (String column : rowData.keySet()) {
                JLabel label = new JLabel(column + ": ");
                JTextField textField = new JTextField(15);
                textField.setText(rowData.get(column));
                fieldMap.put(column, textField);
                add(label);
                add(textField);
            }

            JButton saveButton = new JButton("Save Changes");
            saveButton.addActionListener(e -> updateEntry(con));
            add(new JLabel()); // Filler for layout
            add(saveButton);

            setLocationRelativeTo(null);
            setVisible(true);
        }

        private void updateEntry(Connection con) {
            try {
                StringBuilder query = new StringBuilder("UPDATE " + tableName + " SET ");
                for (String column : fieldMap.keySet()) {
                    if (!column.equals("ID")) {
                        query.append(column).append(" = ?, ");
                    }
                }
                query.setLength(query.length() - 2);
                query.append(" WHERE ID = ?");

                PreparedStatement ps = con.prepareStatement(query.toString());

                int index = 1;
                for (Map.Entry<String, JTextField> entry : fieldMap.entrySet()) {
                    if (!entry.getKey().equals("ID")) {
                        ps.setString(index++, entry.getValue().getText());
                    }
                }
                ps.setString(index, rowData.get("ID"));

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Entry updated successfully!");
                dispose();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            new Dashboard("Affan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
