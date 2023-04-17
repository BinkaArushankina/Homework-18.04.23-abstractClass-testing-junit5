package Homework;

public class Four extends ParentClass {

    public Four(String str) {
        super(str);
    }

    public String stringLength(String str){
        String[] strings = str.split(" ");

        for (int i=0; i<strings.length; i++) {
            if (strings[i].length() == 4) {
                strings[i] = strings[i].toUpperCase();
            }
        }
        return String.join(" ",strings);
    }

    public String toString() {
        return "Four{" +
                "str='" + str + '\'' +
                "} " + super.toString();
    }
}
