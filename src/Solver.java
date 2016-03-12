/**
 * Created by Ivan Shulga on 12.03.2016.
 * Задача 2. Лифты
* */

public class Solver {

    public static void main(String[] args) {
        Lift my = new Lift();
        my.setPeopleComeIn(5,0,1,0,0);  //Указываем количество вошедших людей на каждом этаже(кол-во этажей не фиксированно)
        my.setPeopleComeOut(2,0,3,2,4); //Указываем количество вышедших людей на каждом этаже(кол-во этажей не фиксированно)
        my.setMaxPeople(10);            //Максимальное число человек находящихся в лифте одновременно.

        my.calcPeople();                //Расчитываем значения и выводим их в консоль.
    }
}
