package controlleur;

import java.lang.*;
import modele.ModeleFenetre;
import vue.MaFenetre;

public class TestFenetre {

    public static void main (String[] args)
    {
        MaFenetre fen;
        ModeleFenetre modFen = new ModeleFenetre();
        try
        {
            modFen.saisirFen();
            int x = modFen.getTailleX();
            int y = modFen.getTailleY();
            String  nom = modFen.getTitre();

            fen = new MaFenetre(x,y,nom);
            fen.ajouterBouton();
        }
        catch (Exception e)
        {
            System.out.println("Erreur :Mauvais format de saisie");
        }


    }
}
