package modele;

public class ModeleSouris {

    private final int m_posX;
    private final int m_posY;

    public ModeleSouris(int newX, int newY)
    {
        this.m_posX = newX;
        this.m_posY = newY;
    }

    public int getPosX()
    {
        return m_posX;
    }

    public int getPosY()
    {
        return m_posY;
    }
}
