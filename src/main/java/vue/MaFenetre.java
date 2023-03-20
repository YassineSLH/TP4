package vue;
import modele.ModeleSouris;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MaFenetre extends JFrame implements ActionListener
{
    JButton clic = new JButton("clic");
    public ModeleSouris modSou;
    public MaFenetre () { // constructeur
        setSize (300, 150); // donne une taille en hauteur et largeur à la fenêtre
        setTitle ("Ma premiere fenetre"); // donne un titre à la fenêtre
        setVisible(true) ;
    }

    public MaFenetre(int x, int y, String titre)
    {
        this.setSize(x,y);
        this.setTitle(titre);
        this.setVisible(true);
    }

    public void ajouterBouton ()
    {
        clic.addActionListener(this);
        this.add(clic);

        try
        {
            Desktop.getDesktop().open(new File("C:/Users/yassi/Desktop/Non.mp4"));
        }
        catch(IOException e)
        {
            System.out.println("Le manganèse");
        }
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev)
    {
        System.out.println("Clic Souris");

        int x = (int)MouseInfo.getPointerInfo().getLocation().getX();
        int y = (int)MouseInfo.getPointerInfo().getLocation().getY();

        modSou = new ModeleSouris(x,y);
        afficherSouris();
    }

    public void afficherSouris()
    {
        System.out.println("Position X de la souris :" + modSou.getPosX());
        System.out.println("Position Y de la souris :" + modSou.getPosY());
    }
}