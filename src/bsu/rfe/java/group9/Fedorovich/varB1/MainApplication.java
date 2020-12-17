package bsu.rfe.java.group9.Fedorovich.varB1;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.Comparator;

public class MainApplication {
    public static void main(String[] args)
    {

        Food[] breakfast = new Food[20];
        int i = 0;
        boolean var1, var2;         // случаи для спец параметров, начинающихся с дефиса
        var1 = var2 = false;
        for (String arg : args)
        {
            String[] parts = arg.split("/");


            if(parts[0].equals("Tea")) {
                breakfast[i] = new Tea(parts[1]);
                i++;
            }

            else if(parts[0].equals("Apple"))
            {
                breakfast[i] = new Apple(parts[1]);
                i++;
            }

            else if(parts[0].equals("Cheese"))
            {
                breakfast[i] = new Cheese();
                i++;
            }

            switch (parts[0])
            {
                case "-sort":            // если паратметр -sort, значит нужно будет отсортировать продукты завтрака
                    var1 = true;
                    break;
                case "-calories":       // если паратметр -calories, значит нужно будет посчитать калрийность завтрака
                    var2 = true;
                    break;
            }
        }

        System.out.println("Завтрак: ");
        for (Food item : breakfast)
        {
            if (item != null)
            {
                item.consume();
            }
            else
                break;
        }


        if (var1)
        {
            Arrays.sort(breakfast, new Comparator()
            {
                public int compare(Object f1, Object f2)
                {
                    if(f1==null) return 1;

                    if(f2==null) return -1;

                    if(f1.toString().length()>f2.toString().length()) return 1;

                    else return -1;
                }
            });

            System.out.println("Завтрак (отсортированный вариант):");
            for (Food item : breakfast)
            {
                if (item != null)
                {

                    item.consume();
                    System.out.println(" " + item.calculateCalories());
                }
                else
                    break;
            }
        }

        if (var2)
        {
            double CaloriesCounter = 0.0;
            for (Food item : breakfast)
            {
                if (item != null)
                    CaloriesCounter += item.calculateCalories();
                else
                    break;
            }
            System.out.println("Общее количество калорий: " + CaloriesCounter);

        }


    }
}
