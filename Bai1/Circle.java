package Tuan5.Bai1;
public class Circle{
  final double pi = 3.14159265359;
  double radius = 1.0;
  String color = "red";
  Circle(){
  }
  Circle(double radius){
    this.radius = radius;
  }
  double getRadius(){
    return radius;
  }
  double getArea(){
    return radius*radius*pi;
  }
  public String toString(){
    return color + " " + radius;
  }
}

