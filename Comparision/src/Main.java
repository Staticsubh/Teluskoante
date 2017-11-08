import javax.swing.text.html.parser.DTDConstants;

public class Main {

    void compare(int a,int b,int c,int d,int e)
    {

        if((a>b)&&(a>c)&&(a>d)&&(a>e)){
            System.out.println("The largest number is "+a);}
        else if((b>c)&&(b>d)&&(b>e)){
        System.out.println("The largest number is "+ b);}
        else if((c>d)&&(c>e)){
        System.out.println("The largest number is "+ c);}
        else if(d>e){
        System.out.println("The largest number is "+ d);}
        else{
        System.out.println("The largest number is "+ e);}
    }

    public static void main(String[] args) {
       Main obj=new Main();
       obj.compare(2,2,2,2,2);
    }
}
