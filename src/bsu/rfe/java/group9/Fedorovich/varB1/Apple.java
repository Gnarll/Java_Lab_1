package bsu.rfe.java.group9.Fedorovich.varB1;

public class Apple extends Food {

    public Apple(String Size)
    {
        super("Яблоко");

        par = Size;

    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return par.equals(((Apple) arg0).par);
        } else
            return false;
    }


        public void consume()           // реализация метода consume (что произошло с объектом)
        {
            System.out.println(this + " Съедено");
        }


        public String toString()       // переопределение метода преобразования в строку
        {
            return super.toString() + " '" + par.toUpperCase() + "'";
        }


    public Double calculateCalories()       // реализация метода подсчета калорий
    {
        if(par.equals("маленькое"))
        {
            return   40.0;
        }
        else if(par.equals("среднее"))
        {
            return  45.0;
        }

        else if(par.equals("большое"))
        {
            return  50.0;
        }

        else
            return  0.0;

    }

}
