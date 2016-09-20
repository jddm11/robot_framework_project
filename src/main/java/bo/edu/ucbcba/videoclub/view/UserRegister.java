package bo.edu.ucbcba.videoclub.view;

import bo.edu.ucbcba.videoclub.controller.UserController;
import bo.edu.ucbcba.videoclub.exceptions.ValidationException;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by privado on 26/06/2016.
 */
public class UserRegister extends JDialog {
    private JPasswordField passwordField1;
    private JTextField usernamefield;
    private JButton createButton;
    private JButton cancelButton;
    private JPasswordField confpasswordfield;
    private JPanel rootPanel;
    private UserController userController;

    public UserRegister(JFrame parent) {
        super(parent, "Register Client", true);
        setContentPane(rootPanel);
        setBounds(200, 300, 1000, 800);
        setSize(1000, 800);
        this.setLocationRelativeTo(null);
        pack();
        setResizable(false);
        launchImage();
        userController = new UserController();
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveUser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
            }
        });
    }

    private void saveUser() {
        try {
            if (confpasswordfield.getText().equals(passwordField1.getText())) {
                userController.create(usernamefield.getText(),
                        passwordField1.getText(),
                        2);
                JOptionPane.showMessageDialog(this, "Staff User created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                cancel();
            } else {
                JOptionPane.showMessageDialog(this, "Password and Confirm Password are not equals", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ValidationException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Format error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancel() {
        setVisible(false);
        dispose();
    }

    private void launchImage() {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("probando5.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel label = new JLabel(new ImageIcon(myPicture));
        ((JPanel) getContentPane()).setOpaque(false);
        getLayeredPane().add(label, JLayeredPane.FRAME_CONTENT_LAYER);
        label.setBounds(0, 0, myPicture.getWidth(), myPicture.getHeight());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(7, 2, new Insets(60, 60, 60, 60), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-9144455));
        label1.setFont(new Font("Courier New", Font.BOLD, 28));
        label1.setForeground(new Color(-4477584));
        label1.setText("New Staff User");
        rootPanel.add(label1, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 40), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setFont(new Font("Courier New", Font.BOLD, 20));
        label2.setForeground(new Color(-4486332));
        label2.setText("Username: ");
        rootPanel.add(label2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setFont(new Font("Courier New", Font.BOLD, 20));
        label3.setForeground(new Color(-4486332));
        label3.setText("Password: ");
        rootPanel.add(label3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        passwordField1 = new JPasswordField();
        passwordField1.setFont(new Font("Courier New", passwordField1.getFont().getStyle(), 12));
        rootPanel.add(passwordField1, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        usernamefield = new JTextField();
        usernamefield.setFont(new Font("Courier New", usernamefield.getFont().getStyle(), 12));
        rootPanel.add(usernamefield, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setFont(new Font("Courier New", Font.BOLD, 20));
        label4.setForeground(new Color(-4486332));
        label4.setText("Confirm Password: ");
        rootPanel.add(label4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        confpasswordfield = new JPasswordField();
        confpasswordfield.setFont(new Font("Courier New", confpasswordfield.getFont().getStyle(), 12));
        rootPanel.add(confpasswordfield, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        createButton = new JButton();
        createButton.setBackground(new Color(-12828863));
        createButton.setFont(new Font("Courier New", Font.BOLD, 18));
        createButton.setForeground(new Color(-4486332));
        createButton.setText("Create");
        rootPanel.add(createButton, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cancelButton = new JButton();
        cancelButton.setBackground(new Color(-12828863));
        cancelButton.setFont(new Font("Courier New", Font.BOLD, 18));
        cancelButton.setForeground(new Color(-4486332));
        cancelButton.setText("Cancel");
        rootPanel.add(cancelButton, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(20, 20), null, new Dimension(20, 20), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
