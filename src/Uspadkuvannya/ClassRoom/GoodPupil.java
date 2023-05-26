package Uspadkuvannya.ClassRoom;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Good Pupil - Study");
    }

    @Override
    public void read() {
        System.out.println("Good Pupil - Read");
    }

    @Override
    public void write() {
        System.out.println("Good Pupil - Write");
    }

    @Override
    public void relax() {
        System.out.println("Good Pupil - Relax");
    }
}
