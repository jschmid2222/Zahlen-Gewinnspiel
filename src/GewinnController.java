import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

                    view.lblRundenErgebnis.setText(
                            String.valueOf(model.getRundenErgebnis())
                    );

                    view.lblGesamtPunkte.setText(
                            String.valueOf(model.getGesamtPunkte())
                    );

                } catch (NumberFormatException ex) {

                }
            }
        });

        view.btnNochmal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                view.txtSpieler.setText("");
                view.txtComputer.setText("");
                view.lblRundenErgebnis.setText("");

                view.txtSpieler.requestFocus();
            }
        });
    }
}