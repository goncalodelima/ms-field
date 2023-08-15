package pt.gongas.field.api;

import org.bukkit.inventory.ItemStack;
import pt.gongas.field.FieldPlugin;
import pt.gongas.field.enchant.Enchant;
import pt.gongas.field.enchant.manager.EnchantManager;
import pt.gongas.field.utils.ItemNBT;

import java.util.List;

public class ShearsAPI {

    private final EnchantManager enchantManager = FieldPlugin.getInstance().getEnchantManager();

    /**
     * Checks if the given ItemStack is a shears.
     *
     * @param itemStack The ItemStack to check.
     * @return True if the item is shears; otherwise, false.
     */
    public boolean isShears(ItemStack itemStack) {
        return ItemNBT.getBoolean(itemStack, "isShears");
    }

    /**
     * Retrieves the level of the specified shears.
     *
     * @param shears The shears ItemStack.
     * @return The level of the shears.
     */
    public int getLevel(ItemStack shears) {
        return ItemNBT.getInt(shears, "level");
    }

    /**
     * Gets a list of all available enchants.
     *
     * @return A list of available Enchant objects.
     */
    public List<Enchant> getEnchants() {
        return enchantManager.getEnchants();
    }

    /**
     /**
     * Retrieves an enchantment based on its name.
     *
     * @param name The name of the enchantment.
     * @return The Enchant object corresponding to the provided name, or null if not found.
     */
    public Enchant getEnchant(String name) { return enchantManager.getEnchant(name); }


    /**
     /**
     * Retrieves an enchantment name based on its object.
     *
     * @param enchant Enchant object.
     * @return The Enchant name corresponding to the provided object, or null if not found.
     */
    public String getEnchantName(Enchant enchant) { return enchantManager.getEnchantName(enchant); }

    /**
     * Applies an enchant to the provided shears with the specified level.
     *
     * @param shears  The shears ItemStack to enchant.
     * @param enchant The Enchant object to apply.
     * @param level   The level of the enchant.
     */
    public void applyEnchant(ItemStack shears, Enchant enchant, int level) { EnchantManager.applyEnchant(shears, enchant, level); }

}
