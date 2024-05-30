package com.example.last_project;

import javax.swing.*;
import java.awt.*;

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
        alunnoButton.addActionListener(e -> new InputFrame("Alunno"));
        professoreButton.addActionListener(e -> new InputFrame("Professore"));

        // Rende il frame visibile
        mainFrame.setVisible(true);
    }
}

