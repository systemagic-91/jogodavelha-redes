public class Pacote {

    private String nickname;
    private String tipoJogada;
    private String coordenada_X;
    private String coordenada_Y;
    private String vencedor;

    public Pacote() {
        this("","","","","");
    }

    public Pacote(String nickname, String tipoJogada, String coordenada_X, String coordenada_Y, String vencedor) {
        this.nickname = nickname;
        this.tipoJogada = tipoJogada;
        this.coordenada_X = coordenada_X;
        this.coordenada_Y = coordenada_Y;
        this.vencedor = vencedor;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTipoJogada() {
        return tipoJogada;
    }

    public void setTipoJogada(String tipoJogada) {
        this.tipoJogada = tipoJogada;
    }

    public String getCoordenada_X() {
        return coordenada_X;
    }

    public void setCoordenada_X(String coordenada_X) {
        this.coordenada_X = coordenada_X;
    }

    public String getCoordenada_Y() {
        return coordenada_Y;
    }

    public void setCoordenada_Y(String coordenada_Y) {
        this.coordenada_Y = coordenada_Y;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString() {
        return  nickname + "," +
                tipoJogada + "," +
                coordenada_X + "," +
                coordenada_Y + "," +
                vencedor;
    }
}
