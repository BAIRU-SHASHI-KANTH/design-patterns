package structural.flyweight;

public class PaintBrushClient
{
    public static void main(String[] args)
    {
        Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW");  //created new pen
        yellowThinPen1.draw("Hello World 1 !!");

        Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW");  //pen is shared 1
        yellowThinPen2.draw("Hello World 2 !!");

        Pen blueThinPen = PenFactory.getThickPen("BLUE");       //created new pen
        blueThinPen.draw("Hello World !!");

        Pen yellowThinPen3 = PenFactory.getThickPen("YELLOW");  //pen is shared 2
        yellowThinPen3.draw("Hello World 3 !!");

        Pen yellowThinPen4 = PenFactory.getThickPen("YELLOW");  //pen is shared 3
        yellowThinPen4.draw("Hello World 4 !!");

        Pen yellowThinPen5 = PenFactory.getThickPen("YELLOW");  //pen is shared 4
        yellowThinPen5.draw("Hello World 5 !!");

        System.out.println();
        System.out.println("yellowThinPen1 hashCode(): "+yellowThinPen1.hashCode());
        System.out.println("yellowThinPen2 hashCode(): "+yellowThinPen2.hashCode());
        System.out.println("blueThinPen1 hashCode(): "+blueThinPen.hashCode());
        System.out.println("yellowThinPen3 hashCode(): "+yellowThinPen3.hashCode());
        System.out.println("yellowThinPen4 hashCode(): "+yellowThinPen4.hashCode());
        System.out.println("yellowThinPen5 hashCode(): "+yellowThinPen5.hashCode());

    }
}