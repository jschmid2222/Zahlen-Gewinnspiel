public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        gesamtPunkte = 30;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        computerZahl = (int) (Math.random() * 9) + 1;
    }

    public void berechneRunde(int spielerZahl) {
        int ergebnis = computerZahl - spielerZahl;
        if(ergebnis == 0) {
            gesamtPunkte += 20;
        } else if (ergebnis == -1 || ergebnis == 1) {
            gesamtPunkte += 5;
        } else {
            gesamtPunkte -= 10;
        }
    }

    public boolean hatGewonnen() {
        if(gesamtPunkte >= 100) {
            return true;
        }else {
            return false;
        }
    }

    public boolean hatVerloren() {
        if(gesamtPunkte <= 0) {
            return true;
        }else {
            return false;
        }
    }
}
