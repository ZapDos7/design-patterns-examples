
package com.zapdos7.designpatterns.creational.exercise1c;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class RoomListBuilder {
    
    private ArrayList listOfRooms;
    
    public RoomListBuilder addList() {
        this.listOfRooms = new ArrayList();
        return this;
    }
    
    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);  
        return this;
    }        

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }
       
    public ArrayList buildList(){
        return listOfRooms;
    }

    
    
    
}
