import javax.swing.*;
import java.awt.*;

public class InputFrame extends JFrame {
    public InputFrame(String tipo) {
        super(tipo);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        // Crea i componenti
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();
        JLabel cognomeLabel = new JLabel("Cognome:");
        JTextField cognomeField = new JTextField();
        JButton submitButton = new JButton("Submit");

        JLabel nomeDisplayLabel = new JLabel("Nome inserito: ");
        JLabel cognomeDisplayLabel = new JLabel("Cognome inserito: ");

        // Aggiunge i componenti al frame
        add(nomeLabel);
        add(nomeField);
        add(cognomeLabel);
        add(cognomeField);
        add(submitButton);
        add(nomeDisplayLabel);
        add(cognomeDisplayLabel);

        // Aggiunge l'action listener al pulsante submit
        submitButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String cognome = cognomeField.getText();
            nomeDisplayLabel.setText("Nome inserito: " + nome);
            cognomeDisplayLabel.setText("Cognome inserito: " + cognome);
        });

        // Rende il frame visibile
        setVisible(true);
    }
}

