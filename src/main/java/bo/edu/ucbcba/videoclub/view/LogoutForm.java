package bo.edu.ucbcba.videoclub.view;

import bo.edu.ucbcba.videoclub.controller.UserController;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by privado on 01/06/2016.
 */
public class LogoutForm extends JFrame {
    private JButton loginButton;
    private JPanel rootPane;

    public LogoutForm() {
        super("Logged out | Sakila 2.0");
        setContentPane(rootPane);
        setSize(650, 320);
        this.setLocationRelativeTo(null);
        setResizable(false);
        launchImage();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launchLogin();
            }
        });
    }

    public void launchLogin() {
        this.setVisible(false);
        LoginForm form = new LoginForm();
        form.setVisible(true);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void launchImage() {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("probando4.jpg"));
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
        rootPane = new JPanel();
        rootPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 30, 0, 30), -1, -1));
        rootPane.setBackground(new Color(-3090213));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-9144455));
        label1.setFont(new Font("Courier New", Font.BOLD, 26));
        label1.setForeground(new Color(-8692948));
        label1.setText("You are Logged out from Sakila 2.0");
        rootPane.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loginButton = new JButton();
        loginButton.setBackground(new Color(-12828863));
        loginButton.setFont(new Font("Courier New", loginButton.getFont().getStyle(), 18));
        loginButton.setForeground(new Color(-4486332));
        loginButton.setText("Login");
        rootPane.add(loginButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(120, 50), new Dimension(120, 50), new Dimension(120, 50), 0, false));
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-9144455));
        label2.setFont(new Font("Courier New", Font.BOLD, 26));
        label2.setForeground(new Color(-4477584));
        label2.setText("Come back Soon!");
        rootPane.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPane;
    }
}
