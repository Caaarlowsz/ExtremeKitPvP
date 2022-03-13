package Kakashi.demon.eventos;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.util.Vector;

import com.github.caaarlowsz.extrememc.kitpvp.ExtremePvP;

public class Drops implements Listener {
	@EventHandler
	public void onItemDrop(final ItemSpawnEvent e) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(ExtremePvP.getPlugin(), new Runnable() {
			public void run() {
				Vector vector = e.getLocation().getDirection();
				vector.multiply(0.0F);
				vector.setY(0.6F);
				e.getEntity().setVelocity(vector);
			}
		}, 20L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(ExtremePvP.getPlugin(), new Runnable() {
			public void run() {
				e.getEntity().remove();
			}
		}, 60L);

		Bukkit.getScheduler().scheduleSyncDelayedTask(ExtremePvP.getPlugin(), new Runnable() {
			public void run() {
				e.getEntity().remove();
			}
		}, 65L);
	}
}
