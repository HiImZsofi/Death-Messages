package me.zsofi.deathmessages.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.zsofi.deathmessages.Main;
import me.zsofi.deathmessages.utils.Utils;

public class PlayerDeathListeners implements Listener {

	private static Main plugin;
	
		
	public PlayerDeathListeners (Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		
		if(e.getEntity().getKiller() instanceof Player) {
			
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(Utils.chat("&8[&a*&8] &7 You have killed &6 " + p.getDisplayName())); 
			p.sendMessage(Utils.chat("&8[&c*&8] &7 You have been killed by &c" + killer.getDisplayName()));
			return;
			
		}
	}
	
	
}
