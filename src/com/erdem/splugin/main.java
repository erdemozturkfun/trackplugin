package com.erdem.splugin;
import org.bukkit.plugin.java.JavaPlugin;
import com.erdem.splugin.events.*;

public class main extends JavaPlugin{

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new compassClick(), this);
		
		this.getLogger().info("§aPlugin up and Running!");
		
		this.getCommand("givetracker").setExecutor(new tracktarget());
		this.getCommand("track").setExecutor(new tracktarget());
		
	}
	
	@Override
	public void onDisable() {
		this.getLogger().warning("§6WARNING: §ereloading is not recomended!");
		this.getLogger().info("Plugin Disabled");
	}
	


}
