package modele;
import java.util.*;
public class ModeleFenetre {

    private static int m_sizeX;
    private static int m_sizeY;
    private static String m_titre;

    public ModeleFenetre()
    {
        m_sizeX = 0;
        m_sizeY = 0;
        m_titre = "";
    }

    public void saisirFen() throws Exception
    {
        Scanner ent = new Scanner(System.in);
        System.out.println("Saisir la taille en X");
        m_sizeX = ent.nextInt();
        if(m_sizeX <=0)
        {
            throw new Exception();
        }

        System.out.println("Saisir la taille en Y");
        m_sizeY = ent.nextInt();
        if(m_sizeY <=0)
        {
            throw new Exception();
        }

        System.out.println("Saisir le titre");
        ent.nextLine();
        m_titre = ent.nextLine();
        if(Objects.equals(m_titre, ""))
        {
            throw new Exception();
        }
    }

    public int getTailleX()
    {
        return m_sizeX;
    }
    public int getTailleY()
    {
        return m_sizeY;
    }

    public String getTitre()
    {
        return m_titre;
    }
}
