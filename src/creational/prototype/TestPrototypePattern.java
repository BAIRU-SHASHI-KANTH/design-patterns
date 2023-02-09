package creational.prototype;


public class TestPrototypePattern
{
    public static void main(String[] args)
    {
        try
        {
            PrototypeCapable moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);
            moviePrototype.setName("movie name !!!");
            System.out.println(moviePrototype.toString());

            String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String seriesPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.TVSERIES).toString();
            System.out.println(seriesPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
