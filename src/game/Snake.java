package game;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {


    public Snake() {

        initUI();
    }

    private void initUI() {

        Board board = new Board();
        add(board, BorderLayout.CENTER);

        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> board.initGame());

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(restartButton);

        add(bottomPanel, BorderLayout.SOUTH);

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}