public class Jogador {

    private String nickname;
    private Integer pontuacao;

    public Jogador(String nickname, Integer pontuacao) {
        this.nickname = nickname;
        this.pontuacao = pontuacao;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nickname='" + nickname + '\'' +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
