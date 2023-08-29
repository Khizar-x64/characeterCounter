package MyString;
import Str.*;
public class MyString {
    Str obj = new Str();
    public Str add(char _input)
    {
       if(this.obj.input[0]=='\0')
       {
           this.obj.input[0] = _input;
       }
        else
        {
            for (int i = 0; this.obj.input[i] != '\0'; i++) {
                if (this.obj.input[i + 1] == '\0') {
                    this.obj.input[i + 1] = _input;
                    break;
                }
            }
        }
        return this.obj;
    }
    public String ConvertToString()
    {
        StringBuilder result= new StringBuilder();
        for (int i = 0; this.obj.input[i] != '\0'; i++) {
            result.append(this.obj.input[i]);
        }
        return result.toString();
    }
    public void display()
    {
        for (int i = 0; this.obj.input[i]!='\0'; i++) {
          //  System.out.println("Character No."+i+":"+this.obj.input[i]);
            System.out.print(this.obj.input[i]+" ");
        }
    }
}
