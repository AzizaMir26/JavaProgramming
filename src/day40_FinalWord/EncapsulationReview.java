package day40_FinalWord;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {


    private Circle circle;
    public Circle getCircle(){ //getter for circle obj of class Circle
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return;
        }
        this.circle = circle;
    }

    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
