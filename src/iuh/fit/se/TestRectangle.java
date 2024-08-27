/*
 * @ (#) TestRectangle.java    1.0     8/27/2024
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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle();
        System.out.println("Length: " + re1.getLength());
        System.out.println("Width: " + re1.getWidth());

        re1.setLength(10);
        re1.setWidth(5);

        Rectangle re2 = new Rectangle();
        System.out.println("Area: " + re2.getArea());
        System.out.println("Perimeter: " + re2.getPerimeter());
    }
    }