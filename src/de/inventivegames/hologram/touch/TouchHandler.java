package de.inventivegames.hologram.touch;

import de.inventivegames.hologram.Hologram;
import org.bukkit.entity.Player;

public interface TouchHandler {

	public void onTouch(Hologram hologram, Player player, TouchAction action);

}
