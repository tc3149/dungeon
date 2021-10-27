package dungeonmania.entities;

import dungeonmania.util.*;

import java.util.List;
import java.util.Random;


public class ZombieToast extends MovingEntity {
    private final static int STARTING_HEALTH = 3;
    private final static int ATTACK = 1;

    /**
     * Health of zombie
     */
    private int health;

    /**
     * Attack of zombie
     */
    private int attack;

    /**
     * Condition of zombie
     */
    private boolean alive;

    /**
     * Creates the main zombie
     * @param position - the current position in the dungeon
     * @param type - the type of entity
     * @param ID - the ID of entity
     * @param isInteractable - check if the entity is interactable
     */
    public ZombieToast(Position position, String type, String ID, boolean isInteractable) {
        super(position, type, ID, isInteractable);
        this.health = STARTING_HEALTH;
        this.attack = ATTACK;
        this.alive = true;
    }

    /**
     * Getter for health
     */
    public int getHealth() {
        return health; 
    }

    /**
     * Getter for attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Getter for alive
     */
    public boolean getAliveStatus() {
        return alive;
    }

    /**
     * Setter for attack
     * If the health is less than 1, i.e. <= 0, the character is dead
     * @param health
     */
    public void setHealth(int health) {
        this.health = Math.min(health, STARTING_HEALTH);

        if (health < 1) {
            this.setAlive(false);
        }
    }

    /**
     * Setter for character's condition
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void moveEntity(Direction direction) {

        // For now, zombies travel randomely
        Random random = new Random();
        int randDirection = random.nextInt(5);

        switch(randDirection) {
            case 1:
                super.moveUpward();
                break;
            
            case 2:
                super.moveDownward();
                break;
            
            case 3:
                super.moveLeft();
                break;
            
            case 4:
                super.moveRight();
                break;
        }   
    }

    @Override
    public void entityFunction(List<Entity> entities, Character player) {
        // TODO: Auto-generated method stub
        
    }
}
