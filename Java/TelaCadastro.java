import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JTextField emailField, usuarioField, telefoneField;
    private JPasswordField senhaField;

    public TelaCadastro() {
        setTitle("Cadastro");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField();

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastre-se");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        add(emailLabel);
        add(emailField);
        add(usuarioLabel);
        add(usuarioField);
        add(senhaLabel);
        add(senhaField);
        add(telefoneLabel);
        add(telefoneField);
        add(new JLabel()); // Espaço em branco
        add(cadastrarButton);

        setVisible(true);
    }

    private void cadastrar() {
        // Aqui você pode adicionar lógica de cadastro real.
        // Neste exemplo, exibiremos uma mensagem simples.

        JOptionPane.showMessageDialog(this, "Você foi cadastrado com sucesso", "Cadastro Bem-sucedido", JOptionPane.INFORMATION_MESSAGE);

        // Limpar os campos após o cadastro
        emailField.setText("");
        usuarioField.setText("");
        senhaField.setText("");
        telefoneField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastro());
    }
}
