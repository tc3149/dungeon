package dungeonmania.entities;

import dungeonmania.util.Position;

public abstract class StaticEntity implements Entity{
    private Position position;
    private String type;
    private String ID;
    private boolean IsInteractable;

    StaticEntity(Position position, String type, String ID, boolean IsInteractable) {
        this.position = position;
        this.type = type; 
        this.ID = ID;
        this.IsInteractable = IsInteractable;   
    } 

    /**
     * Move the position by one square up
     */
    public void moveUpward() {
        setPosition(position.translateBy(0, -1));
    }

    /**
     * Move the position by one square down
     */
    public void moveDownward() {
        setPosition(position.translateBy(0, 1));
    }

    /**
     * Move the position by one square left
     */
    public void moveLeft() {
        setPosition(position.translateBy(-1, 0));
    }

    /**
     * Move the position by one square right
     */
    public void moveRight() {
        setPosition(position.translateBy(1, 0));
    }

    /**
     * Sets the position
     * @param position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
    
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getID() {
        return this.ID;
    }
    
    @Override
    public boolean getIsInteractable() {
        return this.IsInteractable;
    }
    
    public void entityFunction() {}

}
