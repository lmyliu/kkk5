import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("管理系统");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 创建一个按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));

        // 创建四个按钮
        JButton btnEmployee = new JButton("员工管理");
        JButton btnProduct = new JButton("商品管理");
        JButton btnSale = new JButton("销售管理");
        JButton btnPurchase = new JButton("采购管理");

        // 为按钮添加事件监听器
        btnEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openEmployeeManagement();
            }
        });

        btnProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProductManagement();
            }
        });

        btnSale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSaleManagement();
            }
        });

        btnPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPurchaseManagement();
            }
        });

        // 将按钮添加到按钮面板
        buttonPanel.add(btnEmployee);
        buttonPanel.add(btnProduct);
        buttonPanel.add(btnSale);
        buttonPanel.add(btnPurchase);

        // 将按钮面板添加到主界面
        add(buttonPanel, BorderLayout.NORTH);

        // 创建一个中心面板，用于显示内容
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel, BorderLayout.CENTER);
    }

    private void openEmployeeManagement() {
        // 这里添加打开员工管理界面的代码
        JOptionPane.showMessageDialog(this, "打开员工管理界面");
    }

    private void openProductManagement() {
        // 这里添加打开商品管理界面的代码
        JOptionPane.showMessageDialog(this, "打开商品管理界面");
    }

    private void openSaleManagement() {
        // 这里添加打开销售管理界面的代码
        JOptionPane.showMessageDialog(this, "打开销售管理界面");
    }

    private void openPurchaseManagement() {
        // 这里添加打开采购管理界面的代码
        JOptionPane.showMessageDialog(this, "打开采购管理界面");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
