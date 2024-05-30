package com.example.last_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crea il frame principale
        JFrame mainFrame = new JFrame("Scuola");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new FlowLayout());

        // Crea i pulsanti
        JButton alunnoButton = new JButton("Alunno");
        JButton professoreButton = new JButton("Professore");

        // Aggiunge i pulsanti al frame
        mainFrame.add(alunnoButton);
        mainFrame.add(professoreButton);

        // Aggiunge gli action listener ai pulsanti
        alunnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apriFinestra("Alunno");
            }
        });

        professoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apriFinestra("Professore");
            }
        });

        // Rende il frame visibile
        mainFrame.setVisible(true);
    }

    private static void apriFinestra(String tipo) {
        // Crea un nuovo frame
        JFrame frame = new JFrame(tipo);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        // Crea i componenti
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();
        JLabel cognomeLabel = new JLabel("Cognome:");
        JTextField cognomeField = new JTextField();
        JButton submitButton = new JButton("Submit");

        // Aggiunge i componenti al frame
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(cognomeLabel);
        frame.add(cognomeField);
        frame.add(submitButton);

        // Aggiunge l'action listener al pulsante submit
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cognome = cognomeField.getText();
                JOptionPane.showMessageDialog(frame, tipo + ": " + nome + " " + cognome);
            }
        });

        // Rende il frame visibile
        frame.setVisible(true);
    }
}


