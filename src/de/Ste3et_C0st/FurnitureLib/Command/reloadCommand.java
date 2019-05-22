package de.Ste3et_C0st.FurnitureLib.Command;

import org.bukkit.command.CommandSender;

import de.Ste3et_C0st.FurnitureLib.main.FurnitureLib;

public class reloadCommand extends iCommand{

	public reloadCommand(String subCommand, String permissions, String ...args) {
		super(subCommand, permissions);
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(!hasCommandPermission(sender)) return;
		FurnitureLib.getInstance().reloadPluginConfig();
		sender.sendMessage(FurnitureLib.getInstance().getLangManager().getString("message.reload"));
		return;
	}
	
}
