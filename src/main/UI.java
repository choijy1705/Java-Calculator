package main;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class UI {
    private final JFrame frame;

    private final JPanel panel;
    private final JPanel panelSub1;
    private final JPanel panelSub2;
    private final JPanel panelSub3;
    private final JPanel panelSub4;
    private final JPanel panelSub5;
    private final JPanel panelSub6;
    private final JPanel panelSub7;
    private final JPanel panelSub8;

    private final JTextArea text;
    private final JButton but[], butAdd, butMinus, butMultiply, butDivide,
            butEqual, butCancel, butSquareRoot, butSquare, butOneDividedBy,
            butCos, butSin, butTan, butxpowerofy, butlog, butrate, butabs, butBinary;
    private final Calculator calc;

    private final Font font;

    private ImageIcon image;
    private BufferedImageCustom imageReturn;

    public UI() throws IOException {
        frame = new JFrame("Calculator");

        imageReturn = new BufferedImageCustom();
        image = new ImageIcon(imageReturn.imageReturn());

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panelSub1 = new JPanel(new FlowLayout());
        panelSub2 = new JPanel(new FlowLayout());
        panelSub3 = new JPanel(new FlowLayout());
        panelSub4 = new JPanel(new FlowLayout());
        panelSub5 = new JPanel(new FlowLayout());
        panelSub6 = new JPanel(new FlowLayout());
        panelSub7 = new JPanel(new FlowLayout());
        panelSub8 = new JPanel(new FlowLayout());

        font = new Font("Consolas",Font.BOLD,24);

        but = new JButton[10];
        for(int i=0;i<10;i++){
            but[i] = new JButton(String.valueOf(i));
        }
        butAdd = new JButton("+");
        butMinus = new JButton("-");
        butMultiply = new JButton("*");
        butDivide = new JButton("/");
        butEqual = new JButton("=");
        butSquareRoot = new JButton("sqrt");
        butSquare = new JButton("x*x");
        butOneDividedBy = new JButton("1/x");
        butCos = new JButton("Cos");
        butSin = new JButton("Sin");
        butTan = new JButton("Tan");
        butxpowerofy = new JButton("x^y");
        butlog = new JButton("log10(x)");
        butrate = new JButton("x%");
        butabs = new JButton("abs(x)");
        butCancel = new JButton("C");
        butBinary = new JButton("Bin");

        calc = new Calculator();
    }
}
