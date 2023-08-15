package pt.gongas.field.api.events;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ShearsUpgradeEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final ItemStack itemStack;
    @Getter
    private int beforeLevel;
    @Getter
    private int currentLevel;

    public ShearsUpgradeEvent(Player player, ItemStack itemStack, int beforeLevel, int currentLevel) {
        this.player = player;
        this.itemStack = itemStack;
        this.beforeLevel = beforeLevel;
        this.currentLevel = currentLevel;
    }

}
