import javax.swing.*;

public class WeatherAppGui extends JFrame {

    public WeatherAppGui(){
        // setup gui e title
        super("Weather App");

        // configurar a gui para encerrar o programa quando ele for fechado

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // setando o tamanho da gui em pixels
        setSize(450, 650);

        // carrega a gui no centro da tela
        setLocationRelativeTo(null);

        //
        setLayout(null);

        //
    }
}
