package Homework;

public abstract class ParentClass {
    String str;

    public ParentClass(String str) {
        this.str = str;
    }

    public abstract String stringLength (String str);

    public String toString() {
        return "ParentClass{" +
                "str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //Решить задачу 2 из предыдущего домашнего задания другим методом - без интерфейсов.
        //Использовать свойства наследования классов (абстрактные классы).
        //Метод должен позволять изменять слова в строке следующим образом:
        //1. при длине слова= 3, изменять все буквы этого слова на заглавные
        //2. при длине слова= 4, изменить все буквы слова на строчные
        //3. при длине слова= 5, изменить все буквы слова на звездочки
        //Протестировать.

        String string = "aAa bBbB cCcCc dDdDdD";

        ParentClass parentClassThree= new Three(string);
        System.out.println("Three - "+parentClassThree.stringLength(string));//Three - aaa bBbB cCcCc dDdDdD

        ParentClass parentClassFour= new Four(string);
        System.out.println("Four - "+parentClassFour.stringLength(string));//Four - aAa BBBB cCcCc dDdDdD

        ParentClass parentClassFive= new Five(string);
        System.out.println("Five - "+parentClassFive.stringLength(string));//Five - aAa bBbB ***** dDdDdD




    }
}
