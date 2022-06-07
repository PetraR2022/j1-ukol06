package cz.czechitas.ukol6;


import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aplikace extends JFrame {

    private JLabel husyLabel;

    private JLabel kraliciLabel;

    private JTextField husyField;

    private JTextField kraliciField;

    private JButton vypocitatButton;


    private JLabel pocethlavLabel;

    private JLabel pocetnohouLabel;

    private JTextField pocethlavField;

    private JTextField pocetnohouField;


    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Aplikace().start();
    }

    public Aplikace() throws HeadlessException {
        super("Farmářka 1.0");
        this.init();
    }

    public void start() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Aplikace.class.getResource("czechitas-icon.png")).getImage());
        setLayout(new MigLayout("wrap 2", "[right]rel[50:120:150,grow,fill]"));
        setMinimumSize(new Dimension(250, 200));

        //TODO implementovat formulář podle zadání

        husyField = new JTextField();
        husyLabel = new JLabel("Husy");
        husyLabel.setDisplayedMnemonic('H');
        husyLabel.setLabelFor(husyField);
        husyField.setHorizontalAlignment(JTextField.TRAILING);
        add(husyLabel);
        add(husyField);

        kraliciField = new JTextField();
        kraliciLabel = new JLabel("Králíci");
        kraliciLabel.setDisplayedMnemonic('K');
        kraliciLabel.setLabelFor(kraliciField);
        kraliciField.setHorizontalAlignment(JTextField.TRAILING);
        add(kraliciLabel);
        add(kraliciField);

        pocethlavField = new JTextField();
        pocethlavLabel = new JLabel("Počet hlav");
        pocethlavLabel.setDisplayedMnemonic('H');
        pocethlavLabel.setLabelFor(pocethlavField);
        pocethlavField.setHorizontalAlignment(JTextField.TRAILING);
        add(pocethlavLabel);
        add(pocethlavField);

        pocetnohouField = new JTextField();
        pocetnohouLabel = new JLabel("Počet nohou");
        pocetnohouLabel.setDisplayedMnemonic('K');
        pocetnohouLabel.setLabelFor(pocetnohouField);
        pocetnohouField.setHorizontalAlignment(JTextField.TRAILING);
        add(pocetnohouLabel);
        add(pocetnohouField);


        pack();

        getRootPane().setDefaultButton(vypocitatButton);

        vypocitatButton.addActionListener(this::handleVypocitat);

        private JPanel createButtonBar(){
            vypocitatButton = new JButton("Vypočítat");
            vypocitatButton.setMnemonic('V');

            JPanel buttonBar = new JPanel(new MigLayout(null, "[right, grow]"));
            buttonBar.add(vypocitatButton);
            return buttonBar;
    }

}

    private void handleVypocitat(ActionEvent actionEvent) {
        System.out.println("Počítám");
        System.out.printf("Husy: %s", husyField.getText()).println();
        System.out.printf("Králíci: %s", kraliciField.getText()).println();
        System.out.printf("Počet hlav: %s", pocethlavField.getText()).println();
        System.out.printf("Počet nohou: %s", pocetnohouField.getText()).println();
    }
    }



