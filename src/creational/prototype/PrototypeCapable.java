package creational.prototype;

public interface PrototypeCapable extends Cloneable
{
    public PrototypeCapable clone() throws CloneNotSupportedException;

    void setName(String s);
}