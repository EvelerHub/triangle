package com.triangle.model;

/**
 * @author Alexander Manko, alexander.eveler@gmail.com
 * @since 27.11.16
 */
public class TriangleResultData {

    private double hypotenuse;

    public TriangleResultData() {
    }

    public TriangleResultData(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return "TriangleResultData{" +
                "hypotenuse=" + hypotenuse +
                '}';
    }
}
