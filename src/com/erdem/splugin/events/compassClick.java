package com.erdem.splugin.events;
import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.erdem.splugin.*;

public class compassClick implements Listener{
	
	public static Location lastloc;
	
	public static Location worldcheck() {
		if(tracktarget.t == null) {
			return tracktarget.p.getWorld().getSpawnLocation();
		}else {
			if((tracktarget.t.getWorld() != tracktarget.p.getWorld())) {
				return lastloc;
			}else {
				return tracktarget.getcompasslocat();
			}
		}
	
	
	}
	
	
	@EventHandler
	public static void onCompassClick(PlayerInteractEvent e) {
		if(e.getMaterial().equals(Material.COMPASS)) {
			ItemStack compass = e.getItem();
			compass.addUnsafeEnchantment(Enchantment.LUCK, 1);
			
			
			e.getPlayer().setCompassTarget(worldcheck());
		}
	}
	
	@EventHandler
	public static void onteleport(PlayerTeleportEvent e) {
		if(e.getCause().equals(TeleportCause.NETHER_PORTAL) || e.getCause().equals(TeleportCause.END_PORTAL)) {
			if(e.getPlayer() == tracktarget.t){
				lastloc = e.getFrom();
			}
		}
	}
	
	@EventHandler
	public static void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("§a<<3>Hoþgeldin " + e.getPlayer().getName() + "!");
	}
	
	@EventHandler
	public static void onquit(PlayerQuitEvent e) {
		if (e.getPlayer() == tracktarget.t) {
			tracktarget.t = null;
		}
	}
	
}
