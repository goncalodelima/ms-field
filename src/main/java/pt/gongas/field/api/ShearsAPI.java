package pt.gongas.field.api;

import org.bukkit.inventory.ItemStack;
import pt.gongas.field.FieldPlugin;
import pt.gongas.field.enchant.Enchant;
import pt.gongas.field.enchant.manager.EnchantManager;
import pt.gongas.field.utils.ItemNBT;

import java.util.List;

public class ShearsAPI {

    private final EnchantManager enchantManager = FieldPlugin.getInstance().getEnchantManager();


    public boolean isShears(ItemStack itemStack) { return ItemNBT.getBoolean(itemStack, "isShears"); }

    public int getLevel(ItemStack shears) { return ItemNBT.getInt(shears, "level"); }

    public List<Enchant> getEnchants() { return enchantManager.getEnchants(); }

    public Enchant getEnchant(String name) { return enchantManager.getEnchant(name); }

    public void applyEnchant(ItemStack shears, Enchant enchant, int level) { EnchantManager.applyEnchant(shears, enchant, level); }

}
