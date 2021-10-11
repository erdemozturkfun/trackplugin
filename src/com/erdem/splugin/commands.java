package com.erdem.splugin;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class commands implements CommandExecutor{


	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		if (sender instanceof Player) {
			PotionEffect peffect = new PotionEffect(PotionEffectType.SPEED, 2000, 10);
			Player player = (Player) sender;
			
		if(args.length < 1) {
			player.sendMessage("not enough arguments!");

			
			
		}else {
			if(args[0].equalsIgnoreCase("sword")) {
				player.getEquipment().setHelmet(Kitmaker.createHelm(0));
				player.getEquipment().setChestplate(Kitmaker.createChestplate(0));
				player.getEquipment().setLeggings(Kitmaker.createLeggings(0));
				player.getEquipment().setBoots(Kitmaker.createBoots(0));
				player.getInventory().addItem(Kitmaker.createWeapon(0));
				player.removePotionEffect(PotionEffectType.SPEED);
				
			}else if(args[0].equalsIgnoreCase("axe")){
				
				player.getEquipment().setHelmet(Kitmaker.createHelm(1));
				player.getEquipment().setChestplate(Kitmaker.createChestplate(1));
				player.getEquipment().setLeggings(Kitmaker.createLeggings(1));
				player.getEquipment().setBoots(Kitmaker.createBoots(1));
				player.getInventory().addItem(Kitmaker.createWeapon(1));
				peffect.apply(player);
				
			}else {
				player.sendMessage("Wrong argument. Try again.");
			}
	
		}
				
			
		
		
			
		}
		
		
		
		return true;
	}
	
}
