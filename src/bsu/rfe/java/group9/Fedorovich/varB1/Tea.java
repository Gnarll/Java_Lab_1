package bsu.rfe.java.group9.Fedorovich.varB1;
public class Tea extends Food
{

    public Tea(String color)
    {
        super("Чай");
        par = color;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Tea)) return false;
            return par.equals(((Tea)arg0).par);
        } else
            return false;
    }

    public String getColor()
    {
        return par;
    }

    public void setColor(String color)
    {
        this.par = color;
    }

    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " Выпит");
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " '" + par.toUpperCase() + "'";
    }

    public Double calculateCalories()       // реализация метода подсчета калорий
    {
        if(par.equals("черный"))
        {
            return   1.5;
        }
        else if(par.equals("зеленый"))
        {
            return  5.5;
        }

        else
            return  0.0;

    }

}
