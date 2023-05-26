package Uspadkuvannya.ClassRoom;
/*Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть
методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil, GoodPupil,
BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор
класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач
може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють
навчатися, читати, писати, відпочивати.*/

public class ClassRoom {
    private final Pupil p1;
    private final Pupil p2;
    private final Pupil p3;
    private final Pupil p4;

    public ClassRoom(Pupil p1, Pupil p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new Pupil();
        this.p4 = new Pupil();
    }
    public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = new Pupil();
    }
    public void shouInfo(){
        p1.study();
        p1.read();
        p1.write();
        p1.relax();
        System.out.println("*******************");
        p2.study();
        p2.read();
        p2.write();
        p2.relax();
        System.out.println("*******************");
        p3.study();
        p3.read();
        p3.write();
        p3.relax();
        System.out.println("*******************");
        p4.study();
        p4.read();
        p4.write();
        p4.relax();
        System.out.println("*******************");
    }
}
