/*
 * @ (#) Rectangle.java    1.0     8/27/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.se;

/*
 * @description
 * @author : Anh Van Duong
 * @Date : 8/27/2024
 * @version :  1.0
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0.");
        }

    }

    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }

    public void setLength(double length) {
        if( length < 0){
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        this.length = length;
    }
    public void setWidth(double width) {
        if( width < 0){
            throw new IllegalArgumentException("Width must be greater than 0.");
        }
        this.width = width;
    }

    public double getArea(){

        return length * width;
    }
    public double getPerimeter(){

        return 2 * length + 2 * width;
    }
}


