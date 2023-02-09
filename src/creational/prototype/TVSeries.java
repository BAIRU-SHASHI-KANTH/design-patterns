package creational.prototype;

public class TVSeries implements PrototypeCapable
{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public TVSeries clone() throws CloneNotSupportedException {
        System.out.println("Cloning Series object..");
        return (TVSeries) super.clone();
    }
    @Override
    public String toString() {
        return "Series";
    }
}