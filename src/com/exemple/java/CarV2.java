package com.exemple.java;

public class CarV2 implements SelfDrivable, Movable {
    private int x, y;
    private int numberOfPassengers;

    public CarV2() {
    }

    public CarV2(int x, int y, int numberOfPassengers) {
        this.x = x;
        this.y = y;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // Implements all abstracted methods

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void destination(String latitude, String longitude) {
        System.out.println("Your Destination is: DEUTSCHLAND");
    }

    @Override
    public void drive() {
        System.out.println("DRIVING V2...");
    }
}
