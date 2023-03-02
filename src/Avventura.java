import Mappabili.Mappable;
import Mappabili.*;

public class Avventura {
  Mappa mappa;
  Posizione posizioneIniziale = new Posizione(2,0);

  public void inizia(Giocatore... giocatori){
    for (Giocatore giocatore : giocatori) {
      inizia(giocatore);
    }
  }
  public void inizia(Giocatore giocatore){
    if (mappa == null) {
      mappa = new Mappa();
      mappa.setMappa();
    }
    mappa.addGiocatore(posizioneIniziale, giocatore);
    giocatore.setPosizione(posizioneIniziale);
  }

  public void muovi(Giocatore giocatore){
//  Mappabili.Posizione posizione = giocatore.scegliDirezione();
    Posizione posizione = new Posizione(1,0);
    Mappable destinazione = mappa.getPosizione(posizione);
    if (destinazione instanceof Muro) {
      System.out.println("Sbatti contro un muro");
      return;
    }
    if (destinazione instanceof Vuoto){
      Posizione iniziale = giocatore.getPosizione();
      ((Vuoto) mappa.getPosizione(iniziale)).removeGiocatore(giocatore);
      ((Vuoto) destinazione).addGiocatore(giocatore);
    }
  }

  @Override
  public String toString() {
    return mappa.toString();
  }
}
