
public class bt1b4 {
public class Circle{
    private double radius;
    private String color;
  public Circle()
  {
      this.radius = 3.0;
      this.color = "blue";
      System.out.println("Da tao hinh tron voi Circle()");
  }
  public Circle(double radius)
  {
      this.radius = radius;
      this.color = "blue";
      System.out.println("Da tao hinh tron voi Circle(radius)");
  }
  public Circle(double radius, String color)
  {
      this.radius = radius;
      this.color = color;
      System.out.println("Da tao hinh tron voi Circle(radius, color)");
  }
  public double getRadius()
  {
      return this.radius;
  }
  public String getColor()
  {
      return this.color;
  }
  public void setRadius(double radius)
  {
      this.radius = radius;
  }
  public void setColor(String color)
  {
      this.color = color;
  }
  public String toString()
  {
      return "Circle[radius =" + radius + "color =" + color + "]";
  }
  public double getArea()
  {
      return radius * radius * Math.PI;
  }
}
public class Cylinder extends Circle {
    private double height;
    public Cylinder ()
    {
        super();
        this.height = 6.0;
        System.out.println("Tao thanh cong hinh tru voi Cyliner()");
    }
    public Cylinder(double height)
    {
        super();
        this.height = height;
        System.out.println("Tao thanh cong hinh tru voi Cylinder(height)");
    }
    public Cylinder(double height, double radius)
    {
        super(radius);
        this.height = height;
        System.out.println("Tao thannh cong hinh tru voi Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color)
    {
        super(radius, color);
        this.height = height;
        System.out.println("Tao thanh cong hinh tru voi Cylinder(height, radius, color)");
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public String toString()
    {
        return "Day la mot hinh tru :3";
    }
}
    public static void main(String args[]) {

}
}