public class Jogada {

    private Jogador jogador;
    private String tipoDeJogada;

    private Integer x;
    private Integer y;

    public Jogada() {
        this(null, "", null,null);
    }

    public Jogada(Jogador jogador, String tipoDeJogada, Integer x, Integer y) {
        this.jogador = jogador;
        this.tipoDeJogada = tipoDeJogada;
        this.x = x;
        this.y = y;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public String getJogada() {
        return tipoDeJogada;
    }

    public void setJogada(String jogada) {
        this.tipoDeJogada = jogada;
    }

    public Integer getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Jogada{" +
                "jogador=" + jogador +
                ", jogada='" + tipoDeJogada + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
