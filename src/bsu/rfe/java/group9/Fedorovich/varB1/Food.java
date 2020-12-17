package bsu.rfe.java.group9.Fedorovich.varB1;

public abstract class Food 
{
    String name = null;
   // double calories = 0.0;
    String par = null;
    public void consume(){}
    public Food(String name)
    {
        this.name = name;
    }

    public String toString()        // перегружен метод преобразования в строку
    {
        return name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; //
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String getName()        // возвращает имя
    {
        return name;
    }

    public void setName(String name)        // для изменения имени
    {
        this.name = name;
    }

}
