package Tuan5.Bai1;
public class Cylinder extends Circle{
  double height = 1.0;
  Cylinder(){
  }
  Cylinder(double radius){
    this.radius = radius;  
  }
  Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }
  double getHeight(){
    return height;
  }
  double getArea(){
    return 2*pi*radius*height + 2*pi*radius*radius;
  }
  double getVolume(){
    return super.getArea()*height;
  }
  public String toString(){
    return color + " " + radius + " " + height;
  }
}


