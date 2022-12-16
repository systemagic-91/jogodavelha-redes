import java.util.List;

public class Partida {

    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro = new Tabuleiro();

    public Partida(){
        this(null, null);
    }

    public Partida(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
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
