package Uspadkuvannya.ClassRoom;
/*Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть
методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil, GoodPupil,
BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор
класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач
може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють
навчатися, читати, писати, відпочивати.*/
public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();

        ClassRoom classRoom2 = new ClassRoom(pupil, badPupil);
        classRoom2.shouInfo();
        System.out.println("*******************");
        ClassRoom classRoom3 = new ClassRoom(excelentPupil, badPupil, goodPupil);
        classRoom3.shouInfo();
    }

}
