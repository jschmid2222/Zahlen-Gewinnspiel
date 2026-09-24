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

                int spielerZahl = Integer.parseInt(view.txtSpieler.getText());

                model.berechneComputerZahl();
                model.berechneRunde(spielerZahl);

                view.txtComputer.setText(
                        String.valueOf(model.getComputerZahl())
                );

                view.lblRundenErgebnis.setText(
                        "Rundenergebnis: " + model.getRundenErgebnis()
                );

                view.lblGesamtPunkte.setText(
                        "Gesamtpunkte: " + model.getGesamtPunkte()
                );
            }
        });
    }
}