package stav.edu;

import org.junit.Assert;

class TriangleTest {
    Triangle triangle = new Triangle(3,4,5,6);

    @org.junit.jupiter.api.Test
    void getAreaEqualsTrue() {
        Assert.assertEquals(9,triangle.getArea(), 0.01);
    }
    void getAreaEqualsFalse() {
        Assert.assertEquals(33,triangle.getArea(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void getPerimeterEqualsTrue() {
        Assert.assertEquals(12,triangle.getPerimeter(),0.01);
    }

    @org.junit.jupiter.api.Test
    void getPerimeterEqualsFalse() {
        Assert.assertEquals(21,triangle.getPerimeter(),0.01);
    }

}