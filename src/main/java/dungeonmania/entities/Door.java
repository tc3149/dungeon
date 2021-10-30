package dungeonmania.entities;

import java.util.List;

import dungeonmania.Dungeon;
import dungeonmania.util.Direction;
import dungeonmania.util.Position;

public class Door extends StaticEntity {
    private int keyType;
    private boolean locked;




    public Door(Position position, String type, String ID, boolean isInteractable, int keyType, boolean locked) {
        super(position,type, ID, isInteractable);
        this.keyType = keyType;
        this.locked = locked;
    } 

    public int getKeyType() {
        return this.keyType;
    }

    public boolean getLocked() {
        return this.locked;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public void entityFunction(List<Entity> entities, Character player, Direction direction, Dungeon main) {  
    }
    
}
