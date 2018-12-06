package Rooms;

import Game.Runner;
import People.person;

public class LivingRoom extends Room {
    public LivingRoom(int x2, int y2){
        super(x2,y2);
    }

    @Override
    public void enterRoom(Person x2){

        occupant = x2;
        x2.setxLoc(this.xLoc);
        x2.setyLoc(this.yLoc);
        System.out.println("This is the living room! There is a shelf with some books, a couch, and a television.");
        Runner.gameOff();

    }
}
