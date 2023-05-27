package Uspadkuvannya.Vehicle;
/*Для класу Plane має бути визначена висота та кількість пасажирів.*/
public class Plane extends Vehicle{
    private int height;
    private int numberPas;

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", numberPas=" + numberPas +
                '}';
    }
}
