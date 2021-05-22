package academy.learnprogramming;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener {

    JLabel jlabSelected;
    JLabel jlabchanged;
    JCheckBox jcbAplha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        JFrame jfrm = new JFrame("Demonstruje pola wyboru");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(280,120);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabSelected = new JLabel("");
        jlabchanged = new JLabel("");

        jcbAplha = new JCheckBox("Alfa");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        jcbAplha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        jfrm.add(jcbAplha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabSelected);
        jfrm.add(jlabchanged);

        jfrm.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        JCheckBox cb = (JCheckBox) ie.getItem();
        if(cb.isSelected())
            jlabchanged.setText(cb.getText() + " zostalo zaznaczone ");
        else
            jlabchanged.setText(cb.getText() + " zaznaczenie zostało usuniete");

        if (jcbAplha.isSelected()){
            str += "Alfa ";
        }
        if(jcbBeta.isSelected()){
            str += "Beta ";
        }
        if(jcbGamma.isSelected()){
            str += "Gamma ";
        }
        jlabSelected.setText("Te pola są wybrane: " + str);
    }
}
