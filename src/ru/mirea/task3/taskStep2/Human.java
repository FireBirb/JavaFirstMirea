package ru.mirea.task3.taskStep2;

public class Human {
    private Leg lleg = new Leg(), rleg = new Leg();
    private Hand lhand = new Hand(), rhand = new Hand();
    private Head head = new Head();
    private Body body = new Body();
    public Human () {
        this.lleg.setHealth(((int) (Math.random()*100)));
        this.rleg.setHealth(((int) (Math.random()*100)));
        this.lhand.setHealth(((int) (Math.random()*100)));
        this.rhand.setHealth(((int) (Math.random()*100)));
        this.body.setHealth(((int) (Math.random()*100)));
        this.head.setHealth(((int) (Math.random()*100)));
    }

    @Override
    public String toString () {
        return "This human's health:\nHead: " + this.head.getHealth() + "%\nLeft arm: " + this.lhand.getHealth() + "%\nRight arm: " + this.rhand.getHealth() + "%\nLeft leg: " + this.lleg.getHealth() + "%\nRight leg: " + this.rleg.getHealth() + "%\nBody: " + this.body.getHealth() + "%";
    }
}
