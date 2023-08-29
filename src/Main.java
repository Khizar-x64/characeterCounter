import MyString.*;
public class Main {
    public static void main(String[] args) {
        MyString obj=new MyString();
        for (int i = 65; i <= 97; i++) {
            obj.add((char) i);
        }
        System.out.println("Characters added successfully.");
        obj.display();
    }
}