import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

        // deixa livre para mexer manualmente
        setLayout(null);

        // prevencao de reajuste do gui
        setResizable(false);

        // adicionar componentes na gui
        addGuiComponents();

    }

    private void addGuiComponents(){
        // barra de pesquisa
        JTextField tfSearch = new JTextField();

        // setar a posicao da barra de pesquisa
        tfSearch.setBounds(15,15,351,45);

        // mudar o estilo e o tamanho
        tfSearch.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(tfSearch);

        // botao de pesquisa - jbutton e jlabel permite inicializar o objeto com uma imagem ao invés de texto
        JButton botaoPesquisa = new JButton(loadImage("src/assets/search.png"));

        // muda o cursor para uma 'mao' quando estamos passando por esse botao
        botaoPesquisa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        botaoPesquisa.setBounds(375, 13, 47, 45);
        add(botaoPesquisa);

    }

    // criar imagens nos componentes gui
    // esse método serve para carregar a imagem de acordo com um caminho nos 'assets', no caso, o from content root
    private ImageIcon loadImage(String resourcePath){

        try{
            // ler a imagem do arquivo de acordo com o caminho from content root
            BufferedImage imagem = ImageIO.read(new File(resourcePath));

            // retorna a imagem para ser renderizada
            return new ImageIcon(imagem);
        } catch (IOException e){

            e.printStackTrace();
        }

        System.out.println("Nao achei nenhuma fonte...");
        return null;
    }

}
