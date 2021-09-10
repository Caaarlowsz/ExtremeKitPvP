package Kakashi.demon.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ca.wacos.nametagedit.NametagAPI;

public class Tag implements CommandExecutor {
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		Player p = (Player) Sender;
		Cmd.getName().equalsIgnoreCase("Tag");
		if (Args.length == 0) {
			p.sendMessage(
					"§a» §cUse /tag <nome da tag> &f| §b§lExemplos: §4§l DONO §7- §c§lADMIN §7- §c§l§oADMINPLUS §7- §5§lMOD §7- §5§l§oMODPLUS §7- §d§lTRIAL §7- §6§lPRO §7- §a§lVIP §7- §e§l§oBUILDER §7- §9§lHELPER §7- §b§lYOUTUBER §7- §3§l§oYOUTUBER+ §7- §e§lSPRO §7- §9§lMVP §7- §3§lCODER §7- §fNORMAL §7");
			return true;
		}
		if (Args[0].equalsIgnoreCase("Normal")) {
			if (p.hasPermission("Tag.Normal")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§f" + p.getName());
				p.setPlayerListName("§f" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§7§lNORMAL§7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Vip")) {
			if (p.hasPermission("Tag.Vip")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§a§lVIP §7" + p.getName());
				p.setPlayerListName("§a" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§a§lVIP §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Mvp")) {
			if (p.hasPermission("Tag.Mvp")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§9§lMVP §7" + p.getName());
				p.setPlayerListName("§9" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§9§lMVP §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Pro")) {
			if (p.hasPermission("Tag.Pro")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§6§lPRO §7" + p.getName());
				p.setPlayerListName("§6" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§6§lPRO §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Youtuber+")) {
			if (p.hasPermission("Tag.Youtuber+")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§3§l§oYOUTUBER+ §7" + p.getName());
				p.setPlayerListName("§3§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§3§lYT+ §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("SPro")) {
			if (p.hasPermission("Tag.SPro")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§e§lSPRO §7" + p.getName());
				p.setPlayerListName("§e" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§e§lSPRO §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("AdminPlus")) {
			if (p.hasPermission("Tag.AdminPlus")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§c§l§oADMINPLUS §7" + p.getName());
				p.setPlayerListName("§c§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§c§lADMIN+ §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Youtuber")) {
			if (p.hasPermission("Tag.Youtuber")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§b§lYOUTUBER §7" + p.getName());
				p.setPlayerListName("§b" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§b§lYT §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Builder")) {
			if (p.hasPermission("Tag.Builder")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§e§l§oBUILDER §e" + p.getName());
				p.setPlayerListName("§e§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§e§lBUILDER §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Trial")) {
			if (p.hasPermission("Tag.Trial")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§d§lTRIAL §d" + p.getName());
				p.setPlayerListName("§d§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§D§lTRIAL §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Mod")) {
			if (p.hasPermission("Tag.Mod")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§5§lMOD §7" + p.getName());
				p.setPlayerListName("§5" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§5§lMOD §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Coder")) {
			if (p.hasPermission("Tag.Coder")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§3§lCODER §7" + p.getName());
				p.setPlayerListName("§3" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§3§lCODER §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("ModPlus")) {
			if (p.hasPermission("Tag.ModPlus")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§5§l§oMODPLUS §7" + p.getName());
				p.setPlayerListName("§5§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§5§lMOD+ §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Helper")) {
			if (p.hasPermission("Tag.Helper")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§9§l§oHELPER §7" + p.getName());
				p.setPlayerListName("§9§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§9§lHELPER §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Admin")) {
			if (p.hasPermission("Tag.Admin")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§c§lADMIN §7" + p.getName());
				p.setPlayerListName("§c" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§c§lADMIN §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Staff")) {
			if (p.hasPermission("Tag.Staff")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§2§l§oSTAFF §7" + p.getName());
				p.setPlayerListName("§2§o" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§2§lSTAFF §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		if (Args[0].equalsIgnoreCase("Dono")) {
			if (p.hasPermission("Tag.Dono")) {
				p.sendMessage("§7» §aTag Alterada.");
				p.setDisplayName("§4§lDONO §7" + p.getName());
				p.setPlayerListName("§4" + p.getName());
				NametagAPI.setPrefix(p.getName(), "§4§lDONO §7");
			} else {
				p.sendMessage("§7» §aVocê não possui esta TAG");
			}
		}
		return false;
	}
}
