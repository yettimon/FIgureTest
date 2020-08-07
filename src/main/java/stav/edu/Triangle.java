package stav.edu;

import java.util.logging.Logger;

public class Triangle {

    private static final Logger LOGGER = Logger.getLogger(Triangle.class.getName());
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double height) {
    }
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getArea(){
        LOGGER.info("Triangle getArea method");
    return (getSideA() * getHeight() /2 );
    }

    public double getPerimeter(){
        LOGGER.info("Triangle getPerimeter method");
        return getSideA() + getSideB() + getSideC();
    }

}
