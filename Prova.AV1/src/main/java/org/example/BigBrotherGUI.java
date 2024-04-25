package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BigBrotherGUI extends JFrame implements ActionListener {
    private final Map<String, Integer> votos;
    private final ArrayList<String> bigBrother = new ArrayList<>();
    private final JTextArea resultadosArea;
    private final JTextField votoField = new JTextField(20);

    public BigBrotherGUI() {
        super("Big Brother Voting System");

        votos = new HashMap<>();

        bigBrother.add("Alane Dias");
        bigBrother.add("Beatriz Reis");
        bigBrother.add("Davi Brito");
        bigBrother.add("Deniziane Ferreira");
        bigBrother.add("Giovanna Lima");
        bigBrother.add("Giovanna Pitel");
        bigBrother.add("Isabelle Nogueira");
        bigBrother.add("Juninho");
        bigBrother.add("Leidy Elin");
        bigBrother.add("Lucas Henrique");
        bigBrother.add("Lucas Luigi");
        bigBrother.add("Lucas Pizane");
        bigBrother.add("Marcus Vinicius");
        bigBrother.add("Matteus Amaral");
        bigBrother.add("Maycon Cosmer");
        bigBrother.add("MC Bin Laden");
        bigBrother.add("Michel Nogueira");
        bigBrother.add("Nizam");
        bigBrother.add("Raquele Cardozo");
        bigBrother.add("Rodriguinho");
        bigBrother.add("Thalyta Alves");
        bigBrother.add("Vanessa Lopes");
        bigBrother.add("Vinicius Rodrigues");
        bigBrother.add("Wanessa Camargo");
        bigBrother.add("Yasmin Brunet");

        for (String nome : bigBrother) {
            votos.put(nome, 0);
        }

        JPanel panel = new JPanel(new BorderLayout());
        resultadosArea = new JTextArea(20, 30);
        resultadosArea.setEditable(false);
        panel.add(new JScrollPane(resultadosArea), BorderLayout.CENTER);

        JPanel votacaoPanel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Digite o nome do participante:");
        votacaoPanel.add(label);
        votacaoPanel.add(votoField);
        JButton votarButton = new JButton("Votar");
        votarButton.addActionListener(this);
        votacaoPanel.add(votarButton);
        panel.add(votacaoPanel, BorderLayout.SOUTH);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String voto = votoField.getText();
        if (bigBrother.contains(voto)) {
            votos.put(voto, votos.get(voto) + 1);
            exibirResultados();
            votoField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Participante não encontrado. Por favor, digite o nome corretamente.");
        }
    }

    private void exibirResultados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultados da votação:\n");
        for (String nome : bigBrother) {
            int quantidadeVotos = votos.get(nome);
            sb.append(nome).append(": ").append(quantidadeVotos).append(" votos\n");
        }
        resultadosArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BigBrotherGUI::new);
    }
}