package com.example.lwork4oop_polevik32;

public class Shape {

    private String color;

    public Shape (String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Цвет фигуры =\"" + color + "\"";
    }

    public double getArea(){
        System.err.println("Ошибка! Невозможно найти площадь невыбранной фигуры");
        return 0;
    }
}
