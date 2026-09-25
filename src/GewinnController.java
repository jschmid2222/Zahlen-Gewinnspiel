import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class GewinnController {

    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {

        this.model = model;
        this.view = view;

        view.txtSpieler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int spielerZahl =
                            Integer.parseInt(view.txtSpieler.getText());

                    if (spielerZahl < 1 || spielerZahl > 9) {
                        return;
                    }

                    model.berechneComputerZahl();
                    model.berechneRunde(spielerZahl);

                    view.txtComputer.setText(
                            String.valueOf(model.getComputerZahl())
                    );

                    if (model.hatGewonnen()) {

                        view.lblRundenErgebnis.setText("Gewonnen");

                    } else if (model.hatVerloren()) {

                        view.lblRundenErgebnis.setText("Verloren");

                    } else if (model.getRundenErgebnis() > 0) {

                        view.lblRundenErgebnis.setText(
                                "+" + model.getRundenErgebnis()
                        );

                    } else {

                        view.lblRundenErgebnis.setText(
                                String.valueOf(model.getRundenErgebnis())
                        );
                    }

                    view.lblGesamtPunkte.setText(
                            String.valueOf(model.getGesamtPunkte())
                    );

                    view.txtSpieler.setEditable(false);
                    view.btnNochmal.setEnabled(true);

                    if (model.hatGewonnen()) {

                        view.lblRundenErgebnis.setBackground(Color.GREEN);
                        view.lblGesamtPunkte.setBackground(Color.GREEN);

                    } else if (model.hatVerloren()) {

                        view.lblRundenErgebnis.setBackground(Color.RED);
                        view.lblGesamtPunkte.setBackground(Color.RED);

                    } else if (model.getRundenErgebnis() > 0) {

                        view.lblRundenErgebnis.setBackground(Color.GREEN);
                        view.lblGesamtPunkte.setBackground(Color.GREEN);

                    } else if (model.getRundenErgebnis() < 0) {

                        view.lblRundenErgebnis.setBackground(Color.RED);
                        view.lblGesamtPunkte.setBackground(Color.RED);

                    } else {

                        view.lblRundenErgebnis.setBackground(Color.WHITE);
                        view.lblGesamtPunkte.setBackground(Color.WHITE);
                    }

                } catch (NumberFormatException ex) {

                }
            }
        });

        view.btnNochmal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                view.txtSpieler.setText("");
                view.txtComputer.setText("");

                view.lblRundenErgebnis.setText(
                        "Tippe eine Zahl von 1 bis 9"
                );

                view.lblRundenErgebnis.setBackground(Color.WHITE);
                view.lblGesamtPunkte.setBackground(Color.WHITE);

                view.txtSpieler.setEditable(true);
                view.btnNochmal.setEnabled(false);

                view.txtSpieler.requestFocus();
            }
        });
    }
}