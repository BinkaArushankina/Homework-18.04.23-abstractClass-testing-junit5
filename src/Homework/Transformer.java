package Homework;

public class Transformer {
    public static void main(String[] args) {
        //Решить задачу 2 из предыдущего домашнего задания другим методом - без интерфейсов.
        //Использовать свойства наследования классов (абстрактные классы).
        //Метод должен позволять изменять слова в строке следующим образом:
        //1. при длине слова= 3, изменять все буквы этого слова на заглавные
        //2. при длине слова= 4, изменить все буквы слова на строчные
        //3. при длине слова= 5, изменить все буквы слова на звездочки
        //Протестировать.
        String string = "aAa bBbB cCcCc dDdDdD";
        Transformer transformer = new Transformer();

        Three three = new Three();
        System.out.println("Three - "+ transformer.transform(string,three));//Three - aaa bBbB cCcCc dDdDdD

        Four four = new Four();
        System.out.println("Four - "+ transformer.transform(string,four));//Four - aAa BBBB cCcCc dDdDdD

        Five five = new Five();
        System.out.println("Five - "+ transformer.transform(string,five));//Five - aAa bBbB ***** dDdDdD
    }

    public String transform(String string, WordTransformer t) {
        String[] words = string.split(" ");
        for (int i=0; i< words.length; i++){
            if (t.check(words[i])){
                words[i] = t.stringLength(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
