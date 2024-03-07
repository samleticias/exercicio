package model.entities;

import model.enums.Color;

public class Triangle extends Shape{
    private Double height;
    private Double width;

    public Triangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
    @Override
    public double area() {
        return (width * height) / 2;
    }
}
