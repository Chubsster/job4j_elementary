package ru.job4j.ru.job4j.converter;

public class IfElse {
    public static void main(String[] args) {
        int month = 11; // Август
        String season;
        String nameMonth;
        if(month == 1)
            nameMonth = "Январю";
        else if(month == 2)
            nameMonth = "Февралю";
        else if(month == 3)
            nameMonth = "Марту";
        else if(month == 4)
            nameMonth = "Апрелю";
        else if(month == 5)
            nameMonth = "Маю";
        else if(month == 6)
            nameMonth = "Июню";
        else if(month == 7)
            nameMonth = "Июлю";
        else if(month == 8)
            nameMonth = "Августу";
        else if(month == 9)
            nameMonth = "Сентябрю";
        else if(month == 10)
            nameMonth = "Октябрю";
        else if(month == 11)
            nameMonth = "Ноябрю";
        else if(month == 12)
            nameMonth = "Декабрю";
        else
        nameMonth = " вымешленному месяцу ";
        if(month == 12 || month == 1 || month == 2)
            season = "Зиме";
        else if(month == 3 || month == 4 || month == 5)
            season = "Весне";
        else if(month == 6 || month == 7 || month == 8)
            season = "Лету";
        else if(month == 9 || month == 10 || month == 11)
            season = "Осени";
        else
            season = "вымешленному сезону";
            System.out.println("Месяц " + month + " относится к сезону года - " + season + " и месяцу - " + nameMonth);
        }
    }

