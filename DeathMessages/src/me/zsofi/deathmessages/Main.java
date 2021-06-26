package me.zsofi.deathmessages;

import org.bukkit.plugin.java.JavaPlugin;

import me.zsofi.deathmessages.listeners.PlayerDeathListeners;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new PlayerDeathListeners(this);
	}
}
