package com.example.lwork4oop_polevik32;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle (String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Длина прямоугольника: " + length + " Ширина прямоугольника: " + width +
                ", подкласс: " + super.toString();
    }

    @Override
    public double getArea(){
        return length * width;
    }
}

