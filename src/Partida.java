import java.util.List;

public class Partida {

    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;

    public Partida(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = new Tabuleiro();
    }

    public Jogador getC1() {
        return jogador1;
    }

    public void setC1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getC2() {
        return jogador2;
    }

    public void setC2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }
   
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "jogador1=" + jogador1 +
                ", jogador2=" + jogador2 +
                ", tabuleiro=" + tabuleiro +
                '}';
    }
}
