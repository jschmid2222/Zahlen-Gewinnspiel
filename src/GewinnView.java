import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {

    JLabel lblRundenErgebnis;
    JLabel lblGesamtPunkte;

    JTextField txtSpieler;
    JTextField txtComputer;

    JButton btnNochmal;

    public GewinnView() {

        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel oben = new JPanel(new GridLayout(2, 2));

        oben.add(new JLabel("Rundenergebnis:", SwingConstants.CENTER));
        oben.add(new JLabel("Gesamtpunkte:", SwingConstants.CENTER));

        lblRundenErgebnis = new JLabel("", SwingConstants.CENTER);
        lblGesamtPunkte = new JLabel("30", SwingConstants.CENTER);

        lblRundenErgebnis.setOpaque(true);
        lblGesamtPunkte.setOpaque(true);

        lblRundenErgebnis.setBackground(Color.WHITE);
        lblGesamtPunkte.setBackground(Color.WHITE);

        oben.add(lblRundenErgebnis);
        oben.add(lblGesamtPunkte);

        JPanel mitte = new JPanel(new GridLayout(2, 2));

        mitte.add(new JLabel("Deine Zahl:", SwingConstants.CENTER));
        mitte.add(new JLabel("Computer:", SwingConstants.CENTER));

        txtSpieler = new JTextField();
        txtComputer = new JTextField();

        txtSpieler.setHorizontalAlignment(JTextField.CENTER);
        txtComputer.setHorizontalAlignment(JTextField.CENTER);

        txtComputer.setEditable(false);

        mitte.add(txtSpieler);
        mitte.add(txtComputer);

        JPanel unten = new JPanel();

        btnNochmal = new JButton("Noch einmal!");
        unten.add(btnNochmal);

        add(oben, BorderLayout.NORTH);
        add(mitte, BorderLayout.CENTER);
        add(unten, BorderLayout.SOUTH);

        setVisible(true);
    }
}