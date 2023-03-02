package Mappabili;

import java.nio.file.attribute.PosixFileAttributes;

public class Giocatore {

  private String nome;
  private Posizione posizione;

  public Giocatore(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public Posizione getPosizione() {
    return posizione;
  }

  public void setPosizione(Posizione posizione) {
    this.posizione = posizione;
  }
}
