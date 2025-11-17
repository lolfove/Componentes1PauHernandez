/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package componentes1;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author pauhd
 */
public class MenuPanel extends JPanel {

    private Ventana1 frame;
    
    public MenuPanel(Ventana1 frame) {

        this.frame = frame;

        setLayout(null);
        setBackground(new Color(20,20,40));

        JLabel title = new JLabel("ATRAPA LAS FRUTAS", SwingConstants.CENTER);
        title.setForeground(Color.white);
        title.setFont(new Font("SansSerif", Font.BOLD, 36));
        title.setBounds(150, 120, 500, 80);
        add(title);

        CustomButton start = new CustomButton("Jugar");
        start.setBounds(300, 250, 200, 60);
        start.addActionListener(e -> frame.showGame());
        add(start);

        CustomButton exit = new CustomButton("Salir");
        exit.setBounds(300, 330, 200, 60);
        exit.addActionListener(e -> System.exit(0));
        add(exit);
    }
}
    
/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}*/
