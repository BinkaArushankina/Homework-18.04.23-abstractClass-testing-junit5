package Homework;

public class Five extends ParentClass{

    public Five(String str) {
        super(str);
    }

    public String stringLength(String str){
        String[] strings = str.split(" ");

        for (int i=0; i<strings.length; i++) {
            if (strings[i].length() == 5) {
                strings[i] = "*****";
            }
        }
        return String.join(" ",strings);
    }

    public String toString() {
        return "Five{" +
                "str='" + str + '\'' +
                "} " + super.toString();
    }
}
