package dungeonmania.entities;
import java.util.List;

import dungeonmania.util.Position;


public interface Entity {
    Position getPosition();
    String getType();
    String getID();
    boolean getIsInteractable();
    void entityFunction(List<Entity> entities, Character player);
}