package Uspadkuvannya.Vehicle;
/*Для класу Ship – кількість пасажирів та порт приписки.*/
public class Ship extends Vehicle{
    private int numberPas;
    private String port;

    @Override
    public String toString() {
        return "Ship{" +
                "numberPas=" + numberPas +
                ", port='" + port + '\'' +
                '}';
    }
}

