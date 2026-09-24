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
        setLayout(new GridLayout(3, 2));

        lblRundenErgebnis = new JLabel("Rundenergebnis:", SwingConstants.CENTER);
        lblGesamtPunkte = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);

        txtSpieler = new JTextField();
        txtComputer = new JTextField();

        txtComputer.setEditable(false);

        btnNochmal = new JButton("Noch einmal!");

        add(lblRundenErgebnis);
        add(lblGesamtPunkte);

        add(txtSpieler);
        add(txtComputer);

        add(new JLabel(""));
        add(btnNochmal);

        setVisible(true);
    }
}
