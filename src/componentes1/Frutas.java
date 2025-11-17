/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author pauhd
 */
public class Frutas extends JComponent{
    
    int x, y;
    int size = 20;
    int vel = 1 + (int)(Math.random() * 4);
    switch (vel) {
            case 1:
                color = Color.BLUE;   // lento -> azul
                break;
            case 2:
                color = Color.GREEN;  // medio -> verde
                break;
            case 3:
                color = Color.YELLOW; // rápido -> amarillo
                break;
            case 4:
                color = Color.RED;    // muy rápido -> rojo
                break;
    }

    public Frutas(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
        );
        setBounds(x, y, size, size);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }
}
