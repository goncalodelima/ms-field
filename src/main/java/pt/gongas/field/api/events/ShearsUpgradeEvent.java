package pt.gongas.field.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FlowerBreakEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final Block block;

    public FlowerBreakEvent(Player player, Block block) {
        this.player = player;
        this.block = block;
    }

}
