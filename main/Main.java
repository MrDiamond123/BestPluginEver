package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	@Override
		public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	
	@Override
		public void onDisable() {
		
	}
	
	
	 @EventHandler
		public void onPlayerJoin(PlayerJoinEvent e) {
			Player p = e.getPlayer();
			String pn = p.getName();
			if (pn.equals("DiamondMCPro")) {
					Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + 
							"DiamondMCPro, the Diamond God Joined The Game");
			}
	}
}
