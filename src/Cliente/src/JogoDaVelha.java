package Cliente.src;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author letic
 */
public class JogoDaVelha {
    public static PlayScreen playScreen;
    public static ResultScreen resultScreen;
    public static ScoreScreen scoreScreen;
    public static MainScreen initialScreen;
    public static TCPConnection tcpConnection;
    public static UDPConnection udpConnection;
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playScreen = new PlayScreen();
        resultScreen = new ResultScreen();
        scoreScreen = new ScoreScreen();
        initialScreen = new MainScreen();

        
        initialScreen.setVisible(true);
    }
    
}
