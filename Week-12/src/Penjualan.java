import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    private JPanel Panel_main;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox steakCheckBox;
    private JCheckBox spagetiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JTextField textField4;
    private JButton button1;
    private JTable table1;
    private JTextArea textArea1;
    private JPanel Table;
    private JLabel labelTotal;

    public Penjualan() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Example action: Show a dialog with the content of textField1
                String nama = textField1.getText();
                String alamat = textField2.getText();
                String noTelp = textField3.getText();

                List<Menu> selectedItems = new ArrayList<>();

                if (pizzaCheckBox.isSelected()) {
                    selectedItems.add(new Menu("Pizza", 10000));
                }
                if (spagetiCheckBox.isSelected()) {
                    selectedItems.add(new Menu("Spaghetti", 80000));
                }
                if (steakCheckBox.isSelected()) {
                    selectedItems.add(new Menu("Steak", 150000));
                }

                // Calculate the total price
                int totalPrice = 0;
                for (Menu item : selectedItems) {
                    totalPrice += item.getPrice();
                }

                textField4.setBackground(Color.BLACK);
                textField4.setForeground(Color.YELLOW);
                textField4.setText(Integer.toString(totalPrice));


                textArea1.setText("CUSTOMER DATA\n Nama: "+ nama+ "\n Alamat: " + alamat + "\n No Telp: " + noTelp );


                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Item");
                model.addColumn("Price");

                for (Menu item : selectedItems) {
                    model.addRow(new Object[]{item.getName(), item.getPrice()});
                }

                table1.setModel(model);
                table1.setVisible(true);

                labelTotal.setText(labelTotal.getText() + " " + totalPrice);
            }
        });
    }

    public JPanel getPanel() {
        return Panel_main;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Penjualan");
            Penjualan penjualan = new Penjualan();
            frame.setContentPane(penjualan.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

}
