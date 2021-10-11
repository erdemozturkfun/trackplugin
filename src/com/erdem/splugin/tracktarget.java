package com.erdem.splugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.inventory.meta.ItemMeta;


public class tracktarget implements CommandExecutor{
	
	public static Player p;
	public static Player t;
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
		
			Player cmdsender = (Player) sender;
			p = cmdsender;
			if(cmdsender.hasPermission("minecraft.commands.give")) {
				if(cmd.getName().equalsIgnoreCase("givetracker")) {
					ItemStack compass = new ItemStack(Material.COMPASS);
					cmdsender.getInventory().addItem(compass);
					
					
					
				}
				
			}
			if(cmd.getName().equalsIgnoreCase("track")) {
				
				t = Bukkit.getPlayer(args[0]);
				
				ItemStack compass = new ItemStack(Material.COMPASS);
				ItemMeta m = compass.getItemMeta();
				m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				m.setDisplayName(t.getName() + " Tracker");
				compass.setItemMeta(m);
				
				cmdsender.getInventory().addItem(compass);
				Location l = t.getLocation();
				cmdsender.setCompassTarget(l);
			}
			
			
			
				
			
			
		}
		
		
		return true;
	}

public static Location getcompasslocat() {
	return t.getLocation();
	
}
	
}
