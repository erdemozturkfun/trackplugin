package com.erdem.splugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Kitmaker {
	
	private static ItemStack lighthelm = new ItemStack(Material.SEA_LANTERN);
	private static ItemStack lightchestplate = new ItemStack(Material.IRON_CHESTPLATE);
	private static ItemStack lightpants = new ItemStack(Material.IRON_LEGGINGS);
	private static ItemStack lightshoes = new ItemStack(Material.IRON_BOOTS);
	private static ItemStack lightweapon = new ItemStack(Material.IRON_SWORD);
	
	
	
	private static ItemStack darkhelm = new ItemStack(Material.WITHER_SKELETON_SKULL);
	private static ItemStack darkchestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
	private static ItemStack darkpants = new ItemStack(Material.LEATHER_LEGGINGS);
	private static ItemStack darkshoes = new ItemStack(Material.LEATHER_BOOTS);
	private static ItemStack darkweapon = new ItemStack(Material.DIAMOND_SWORD);
	
	
	public static  ItemStack createChestplate(int classa) {
		darkchestplate.addEnchantment(Enchantment.DURABILITY, 3);
		darkchestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		ItemMeta lightmeta = lightchestplate.getItemMeta();
		LeatherArmorMeta darkmeta = (LeatherArmorMeta) darkchestplate.getItemMeta();
		switch(classa) {
		case 1:
		
	
			darkmeta.setColor(Color.BLACK);
			List<String>darklore = new ArrayList<String>();
			darklore.add("§4More Darkness, More Power.");
			darkmeta.setLore(darklore);
		
			darkchestplate.setItemMeta(darkmeta);
			
			
		
			
			return darkchestplate;
			
		case 0:
			List<String>lightlore = new ArrayList<String>();
			lightlore.add("More Lightness, More Happiness.");
			lightmeta.setLore(lightlore);
			lightchestplate.setItemMeta(lightmeta);
			return lightchestplate;
			
			
		}
		return null;
	}
	
	
	
	public static  ItemStack createLeggings(int classa) {
		darkpants.addEnchantment(Enchantment.DURABILITY, 3);
		darkpants.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		ItemMeta lightmeta = lightpants.getItemMeta();
		LeatherArmorMeta darkmeta = (LeatherArmorMeta) darkpants.getItemMeta();
		switch(classa) {
		case 1:
		
	
			darkmeta.setColor(Color.BLACK);
			List<String>darklore = new ArrayList<String>();
			darklore.add("§4More Darkness, More Power.");
			darkmeta.setLore(darklore);
		
			darkpants.setItemMeta(darkmeta);
			
			
		
			
			return darkpants;
			
		case 0:
			List<String>lightlore = new ArrayList<String>();
			lightlore.add("More Lightness, More Happiness.");
			lightmeta.setLore(lightlore);
			lightpants.setItemMeta(lightmeta);
			return lightpants;
			
			
		}
		return null;
	}
	
	public static  ItemStack createBoots(int classa) {
		darkshoes.addEnchantment(Enchantment.DURABILITY, 3);
		darkshoes.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		ItemMeta lightmeta = lightshoes.getItemMeta();
		LeatherArmorMeta darkmeta = (LeatherArmorMeta) darkshoes.getItemMeta();
		switch(classa) {
		case 1:
		
	
			darkmeta.setColor(Color.BLACK);
			List<String>darklore = new ArrayList<String>();
			darklore.add("§4More Darkness, More Power.");
			darkmeta.setLore(darklore);
		
			darkshoes.setItemMeta(darkmeta);
			
			
		
			
			return darkshoes;
			
		case 0:
			List<String>lightlore = new ArrayList<String>();
			lightlore.add("More Lightness, More Happiness.");
			lightmeta.setLore(lightlore);
			lightshoes.setItemMeta(lightmeta);
			return lightshoes;
			
			
		}
		return null;
	}

	public static  ItemStack createHelm(int classa) {
	
		ItemMeta lightmeta = lighthelm.getItemMeta();
		ItemMeta darkmeta = darkhelm.getItemMeta();
		switch(classa) {
		case 1:
		
	
		
			List<String>darklore = new ArrayList<String>();
			darklore.add("§4More Darkness, More Power.");
			darkmeta.setLore(darklore);
		
			darkhelm.setItemMeta(darkmeta);
			
			
		
			
			return darkhelm;
			
		case 0:
			List<String>lightlore = new ArrayList<String>();
			lightlore.add("More Lightness, More Happiness.");
			lightmeta.setLore(lightlore);
			lighthelm.setItemMeta(lightmeta);
			
			return lighthelm;
			
			
		}
		return null;
	}

	public static  ItemStack createWeapon(int classa) {
		
		ItemMeta lightmeta = lightweapon.getItemMeta();
		ItemMeta darkmeta = darkweapon.getItemMeta();
		switch(classa) {
		case 1:
		
	
		
			List<String>darklore = new ArrayList<String>();
			darklore.add("§4I must cover this world in darkness.");
			darkmeta.setLore(darklore);
		
			darkweapon.setItemMeta(darkmeta);
			
			
		
			
			return darkweapon;
			
		case 0:
			List<String>lightlore = new ArrayList<String>();
			lightlore.add("Let the light be with you");
			lightmeta.setLore(lightlore);
			lightweapon.setItemMeta(lightmeta);
			
			return lightweapon;
			
			
		}
		return null;
	}

}
