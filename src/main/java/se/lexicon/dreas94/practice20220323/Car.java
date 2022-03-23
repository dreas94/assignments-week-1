package se.lexicon.dreas94.practice20220323;

public class Car
{
    String m_brand;
    int m_regNum;
    double m_maxSpeed;
    String m_nameOfOwner;
    int m_creationYear;

    public Car(String brand, int regNum, double maxSpeed, String nameOfOwner, int creationYear)
    {
        m_brand = brand;
        m_regNum = regNum;
        m_maxSpeed = maxSpeed;
        m_nameOfOwner = nameOfOwner;
        m_creationYear = creationYear;
    }
}
