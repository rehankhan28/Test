package prep.javaeight;

public class JoiningStrings {
    public static void main(String[] args) {
        String str="Hello World";
        String result=String.join("",str.split(" "));
        System.out.println(result);
    }
}