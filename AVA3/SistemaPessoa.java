import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaPessoa extends JPanel {
    public static void main(String args[]) {
        // Constante e varárias para informações do rodapé
        final String versaoSistema = "12.1.2024";
        String nomeUsuario = "denys.silva";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        String dataAcesso = dateFormat.format(new Date());

        //Cria o frame principal
        JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        //Cria o menu principal
        JMenuBar menuPrincipal = new JMenuBar();
        
        //Cria e adiciona as opções horizontais do menu principal
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        
        // Cria a opção de "Sair" no menu principal
        JMenu menuSair = new JMenu("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            // Evento de ação clique na opção Sair
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0); // Sai do sistema
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) { }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) { }
        });
        // Adiciona o menu "Sair" à barra de menu
        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);
        
        //Cria os itens verticais de opções do menu
        // Opções verticais do menuCadastro
        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);
        // Opções verticais do menuVisualizacao
        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);
        
        // Text Area at the Center
        JTextArea areaTrabalho = new JTextArea();

        //Cria painel e label do rodapé
        JPanel painelRodape = new JPanel(); // the panel is not visible in output
        JLabel labelRodape = new JLabel("Versão: " + versaoSistema + "               Usuário: " + nomeUsuario + "               Data de acesso: " + dataAcesso);
        painelRodape.add(labelRodape); // Components Added using Flow Layout

        //Adiciona componentes (menuPrincipal, areaTrabalho e painelRodape) no frame principal.
        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }
}