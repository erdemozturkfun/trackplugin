package com.erdem.splugin;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Weapons {
	

	public static ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
	public static ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
 

	
	public static void init() {
		createAxe();
		createSword();
	}
	
	public static ItemStack createAxe() {
		axe.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		return axe;
	}
	
	public static ItemStack createSword() {
	
		sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		return sword;
		
	}
	
}
