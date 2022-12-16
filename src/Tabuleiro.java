import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private final String[][] tabuleiro = new String[3][3];
    private List<Jogada> jogadas;

    public Tabuleiro() {
        this.jogadas = new ArrayList<>();
    }

    public void adicionarJogadaNoTabuleiro(Jogada jogada){
        this.tabuleiro[jogada.getX()][jogada.getY()] = jogada.getJogada();
        this.adicionarJogadaNaListaDeJogadas(jogada);
    }

    private void adicionarJogadaNaListaDeJogadas(Jogada jogada){
        this.jogadas.add(jogada);
    }

    public void limparBoard(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = "";
            }
        }
    }

    public String verificaVencedor(){

        // LINHAS
        if(verificarLinha00_O())
            return "O";

        if (verificarLinha10_O())
            return "O";

        if (verificarLinha20_O())
            return "O";

        if (verificarLinha00_X())
            return  "X";

        if (verificarLinha10_X())
            return  "X";

        if (verificarLinha20_X())
            return  "X";

        // COLUNAS
        if(verificarColuna00_O())
            return "O";

        if(verificarColuna01_O())
            return "O";

        if(verificarColuna02_O())
            return "O";

        if(verificarColuna00_X())
            return "X";

        if(verificarColuna01_X())
            return "X";

        if(verificarColuna02_X())
            return "X";

        // DIAGONAL
        if (verificarDiagonalPrincipal_O())
            return "O";

        if (verificarDiagonalPrincipal_X())
            return "X";

        if (verificarDiagonalSecundaria_O())
            return "O";

        if (verificarDiagonalSecundaria_X())
            return "O";

        return "";
    }


    private boolean verificarLinha00_O() {
        return tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O");
    }

    private boolean verificarLinha00_X(){
        return tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X");
    }

    private boolean verificarLinha10_O() {
        return tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O");
    }

    private boolean verificarLinha10_X(){
        return tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X");
    }

    private boolean verificarLinha20_O() {
        return tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O");
    }

    private boolean verificarLinha20_X() {
        return tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X");
    }

    private boolean verificarColuna00_O(){
        return tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O");
    }

    private boolean verificarColuna00_X(){
        return tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X");
    }

    private boolean verificarColuna01_O(){
        return tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O");
    }

    private boolean verificarColuna01_X(){
        return tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X");
    }

    private boolean verificarColuna02_O(){
        return tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O");
    }

    private boolean verificarColuna02_X(){
        return tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X");
    }

    private boolean verificarDiagonalPrincipal_O() {
        return tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O");
    }

    private boolean verificarDiagonalPrincipal_X(){
        return tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X");
    }

    private boolean verificarDiagonalSecundaria_O() {
        return tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O");
    }

    private boolean verificarDiagonalSecundaria_X(){
        return tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X");
    }
}
