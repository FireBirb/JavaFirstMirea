package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topleft, bottomright;

    MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomright = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public void moveDown() {
        topleft.moveDown();
        bottomright.moveDown();
    }

    @Override
    public void moveUp() {
        topleft.moveUp();
        bottomright.moveUp();
    }

    @Override
    public void moveLeft() {
        topleft.moveLeft();
        bottomright.moveLeft();
    }

    @Override
    public void moveRight() {
        topleft.moveRight();
        bottomright.moveRight();
    }
    @Override
    public String toString() {
        return "Top left point:\n" + topleft + "\nBottom right point:\n" + bottomright;
    }
}
