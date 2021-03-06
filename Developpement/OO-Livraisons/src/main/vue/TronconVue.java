/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import javax.swing.JPanel;

/**
 *
 * @author romain
 */
public class TronconVue extends JPanel{
    protected int xDebut;
    protected int yDebut;
    protected int xFin;
    protected int yFin;
    protected String name;
    protected Color couleur;
    
    public TronconVue(int x1, int y1, int x2, int y2, String name, Color c)
    {
        super();
        xDebut = x1;
        yDebut = y1;
        xFin = x2;
        yFin = y2;
        this.name = name;
        this.setOpaque(true);
        this.setBackground(new Color(0,0,0,0));
        couleur = c;
        this.setSize(new Dimension(max(x2,x1),max(y2,y1)));
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setOpaque(true);
        this.setBackground(new Color(0,0,0,0));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON );
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY );
        
        g2d.setColor(couleur);
        g2d.drawLine(xDebut, yDebut, xFin, yFin);
    }
}
