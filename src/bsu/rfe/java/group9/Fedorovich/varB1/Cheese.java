package bsu.rfe.java.group9.Fedorovich.varB1;

public class Cheese extends Food{
    public Cheese()
    {
        super("Cыр");
    }


    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Tea)) return false;
            return true;
        } else
            return false;
    }


    public Double calculateCalories()       // реализация метода подсчета калорий
    {
        return 400.0;
    }

    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " Съеден");
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString();
    }
}
