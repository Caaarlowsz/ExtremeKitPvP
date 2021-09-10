package Kakashi.demon.eventos;

import org.bukkit.entity.Player;

public class Ranks {

	public static String getRank(Player p) {
		Integer money = Dinheiro.getMoney(p);
		String rank = "";
		rank = "§7UNRANKED";
		if (money >= 2002) {
			rank = "§eNOOB";
		}
		if (money >= 4000) {
			rank = "§dPRIMARY";
		}
		if (money >= 6000) {
			rank = "§6INTERMEDIARY";
		}
		if (money >= 8000) {
			rank = "§cADVANCE";
		}
		if (money >= 10000) {
			rank = "§4EXPERT";
		}
		if (money >= 12000) {
			rank = "§8BRONZE";
		}
		if (money >= 14000) {
			rank = "§7SILVER";
		}
		if (money >= 16000) {
			rank = "§bDIAMOND";
		}
		if (money >= 18000) {
			rank = "§aKING";
		}
		if (money >= 20000) {
			rank = "§2LEGENDARY";
		}
		return rank;
	}

	public static String getRankChat(Player p) {
		Integer money = Dinheiro.getMoney(p);
		String rank = "";
		rank = "§7(§f-§7)";
		if (money >= 500) {
			rank = "§7(§e=§7)";
		}
		if (money >= 2000) {
			rank = "§7(§1=§7)";
		}
		if (money >= 6000) {
			rank = "§7(§6=§7)";
		}
		if (money >= 8000) {
			rank = "§7(§9=§7)";
		}
		if (money >= 10000) {
			rank = "§7(§4=§7)";
		}
		if (money >= 12000) {
			rank = "§7(§8=§7)";
		}
		if (money >= 14000) {
			rank = "§7(§7=§7)";
		}
		if (money >= 16000) {
			rank = "§7(§5=§7)";
		}
		if (money >= 18000) {
			rank = "§7(§0=§7)";
		}
		if (money >= 20000) {
			rank = "§7(§2=§7)";
		}
		return rank;
	}
}
