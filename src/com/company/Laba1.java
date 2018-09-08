package com.company;

import java.util.Date;

public class Laba1 {
        public static void main(String[] args) {
            String firstName = "Басов";
            String middleName = "Денис";
            String lastName = "Витальевич";
            String teacherfirstName = "Волкова";
            String teachermiddleName = "Татьяна";
            String teacherlastName = "Викторовна";
            String groupCode = "ИВТ/б-11о"; //номер группы

            Date gurrentDate = new Date();

            int variant = 3; //номер варианта
            int dayofweek = 7; //кол-во дней в неделе
            int day1 = 2; //выходных дней
            int day2 = dayofweek-day1; //кол-во рабочих дней

            String fullName = fullName(firstName, middleName, lastName);
            String fullteacherName = fullName(teacherfirstName, teachermiddleName, teacherlastName);

            System.out.println("Программу выполнил:\n" + fullName);
            System.out.println("Шифр группы:" + groupCode);
            System.out.println("Дата:" + gurrentDate);
            System.out.println("Вариант №" + variant);
            System.out.println("Число дней в недели:" + dayofweek);
            System.out.println("Число выходных дней:"+day1);
            System.out.println("Число рабочих дней:"+day2);
            System.out.println("Проверил:\n" + fullteacherName);
    }

        public static String fullName(String a,String b,String c)  {
                return a+" "+b+" "+" "+c;
        }

    }
  //     Владимирова Елена Сергеевна.Волкова Татьяна Викторовна
