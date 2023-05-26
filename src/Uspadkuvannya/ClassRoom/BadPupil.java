package Uspadkuvannya.ClassRoom;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Bad Pupil - Study");
    }

    @Override
    public void read() {
        System.out.println("Bad Pupil - Read");
    }

    @Override
    public void write() {
        System.out.println("Bad Pupil - Write");
    }

    @Override
    public void relax() {
        System.out.println("Bad Pupil - Relax");
    }
}
