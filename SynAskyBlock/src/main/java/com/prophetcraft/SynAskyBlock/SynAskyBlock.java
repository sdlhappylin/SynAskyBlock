package com.prophetcraft.SynAskyBlock;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class SynAskyBlock extends JavaPlugin{
	
	
	private JavaPlugin instance;
	@Override
	public void onEnable() {
		this.instance = this;
	}
	
	public JavaPlugin getInstance(){
		return this.instance;
	}
  
	
}
