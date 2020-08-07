package stav.edu;

import org.junit.Assert;

class TriangleTest {
    Triangle triangle = new Triangle(3,4,5,6);

    @org.junit.jupiter.api.Test
    void getArea() {
        Assert.assertEquals(9,triangle.getArea(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Assert.assertEquals(12,triangle.getPerimeter(),0.01);
    }

}