/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author pauhd
 */
public class CustomButton extends JButton{
    public CustomButton(String text) {
        super(text);
        setFocusPainted(false);
        setFont(new Font("SansSerif", Font.BOLD, 24));
        setBackground(new Color(70,130,180));
        setForeground(Color.white);
    }
}
