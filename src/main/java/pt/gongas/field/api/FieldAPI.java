package pt.gongas.field.api;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import pt.gongas.field.FieldPlugin;
import pt.gongas.field.field.Field;
import pt.gongas.field.field.manager.FieldManager;

import java.util.List;

public class FieldAPI {

    private final FieldManager fieldManager = FieldPlugin.getInstance().getFieldManager();

    /**
     * Loads the field associated with the given block. If the field does not exist,
     * returns null.
     *
     * @param block The block for which to load the field.
     * @return The field instance associated with the block, or null if it doesn't exist.
     */
    public Field getField(Block block) { return fieldManager.getField(block); }

    /**
     * Loads the field associated with the given player. If the field does not exist,
     * returns null.
     *
     * @param player The player for which to load the field.
     * @return The field instance associated with the player, or null if it doesn't exist.
     */

    public Field getField(Player player) { return fieldManager.getField(player); }

    /**
     * Loads the field associated with the given field name. If the field does not exist,
     * returns null.
     *
     * @param name The field name for which to load the field.
     * @return The field instance associated with the field name, or null if it doesn't exist.
     */

    public Field getField(String name) { return fieldManager.getField(name); }

    /**
     * Checks if the player is not inside a field.
     *
     * @param player The player to check.
     * @return True if the player is not inside a field, otherwise false.
     */
    public boolean isNotField(Player player) { return fieldManager.isNotInField(player); }

    /**
     * Checks if the given block is not considered a field block.
     *
     * @param block The block to check.
     * @return True if the block is not considered a field block, otherwise false.
     */
    public boolean notIsFieldBlock(Block block) { return fieldManager.notIsFieldBlock(block); }

    /**
     * Checks if pvp is enabled for the given player within the field.
     *
     * @param player The player to check.
     * @return True if pvp is enabled for the player within the field, otherwise false.
     */
    public boolean isCombat(Player player) { return fieldManager.isCombat(player); }

    /**
     * Sets the combat for the given player within the field.
     *
     * @param player The player for whom to set the combat.
     */
    public void setCombat(Player player) { if (player != null) fieldManager.setCombat(player); }

    /**
     * Removes the combat for the given player within the field.
     *
     * @param player The player for whom to remove the combat.
     */
    public void removeCombat(Player player) { fieldManager.removeCombat(player); }

    /**
     * Retrieves a list of players who are currently in a battle within any field.
     *
     * @return A list of players who are currently in a battle within any field.
     */
    public List<Player> getFighters() { return fieldManager.getFighters(); }

    /**
     * Retrieves a list of players who are not currently in a battle on any field.
     *
     * @return A list of players who are not currently in a battle on any field.
     */
    public List<Player> getNonFighters() { return fieldManager.getNonFighters(); }

    /**
     * Retrieves a list of players who are farmers within the field.
     *
     * @return A list of players who are farmers within the field.
     */
    public List<Player> getFarmers() { return fieldManager.getFarmers(); }

    /**
     * Retrieves a list of all fields.
     *
     * @return A list of all fields.
     */
    public List<Field> getFields() { return fieldManager.getFields(); }

}
