package com.company;

public class Main {

    public static void main(String[] args) {
        Figure[] arr = new Figure[6];
        arr[0] = new Square("Квадрат1: ", 3.0);
        arr[1] = new Square("Квадрат2: ",4.0);
        arr[2] = new Rectangle("Прямоугольник1: ",3.0,2.0);
        arr[3] = new Rectangle("Прямоугольник2: ",2.0,2.5);
        arr[4] = new Triangle("Треугольник: ",0.6,2.8,1.4);
        arr[5] = new Circle("Круг: ",2.0);

        for (int i = 0; i < 6   ; i++) {
            System.out.println(i+ " |" +
                    arr[i].getName()
                    + ((Drawable) arr[i]).draw()
                    + "| Периметр фигуры = "
                    + arr[i].calculatePerimeter());
        }


        Animal dog = new Dog();
        System.out.println(dog.getName() + ((Dog) dog).draw()
        + "| Лай = " + ((SoundProducable) dog).callSound());


    }
}
