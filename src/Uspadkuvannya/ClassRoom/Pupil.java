package Uspadkuvannya.ClassRoom;
/*Створіть клас учень Pupil. У тілі класу створіть
методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil, GoodPupil,
BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор
класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач
може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють
навчатися, читати, писати, відпочивати.*/
public class Pupil {



    public void study(){
        System.out.println("Pupil - study");
    }
    public void read(){
        System.out.println("Pupil - read");
    }
    public void write(){
        System.out.println("Pupil - write");
    }
    public void relax(){
        System.out.println("Pupil - relax");
    }
}
