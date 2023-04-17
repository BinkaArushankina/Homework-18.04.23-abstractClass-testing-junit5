package Homework;

public class Three extends ParentClass{

    public Three(String str) {
        super(str);
    }

    public String stringLength(String str){
        String[] strings = str.split(" ");

        for (int i=0; i<strings.length; i++) {
            if (strings[i].length() == 3) {
                strings[i]=strings[i].toLowerCase();
            }
        }
        return String.join(" ",strings);
    }

    public String toString() {
        return "Three{" +
                "str='" + str + '\'' +
                "} " + super.toString();
    }
}
