package com.triangle.model;

/**
 * @author Alexander Manko, alexander.eveler@gmail.com
 * @since 27.11.16
 */
public class TriangleInputData {

    private double firstSide;
    private double secondSide;

    public TriangleInputData() {
    }

    public TriangleInputData(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public String toString() {
        return "TriangleInputData{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                '}';
    }
}
