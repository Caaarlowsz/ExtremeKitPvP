package Kakashi.demon.utils;


import Kakashi.demon.eventos.Dinheiro;
import Kakashi.demon.eventos.KitAPI;
import Kakashi.demon.eventos.Ranks;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Scoreboard
  implements Listener
{
	public static void iscoriboard(Player p)
  
  {
    
    SimpleScoreboard iscori = new SimpleScoreboard("§bKITPVP");
    iscori.blankLine();
    iscori.add("§1§l>>  §fKit Primario:§7 " + KitAPI.getkit(p));
    iscori.add("§1§l>> §fKit Secundario:§7 " + KitAPI.getkit2(p));
    iscori.blankLine();
    iscori.add("§1§l>> §fClan:§7 Nenhum");
    iscori.add("§1§l>> §fLiga: " + Ranks.getRank(p));
    iscori.add("§1§l>> §fCoins:§7 " + Dinheiro.getMoney(p));
    iscori.blankLine();
    iscori.add("§1§l>> §7/score");
    iscori.blankLine();
    
    iscori.build();
    iscori.send(new Player[] { p });
    
    
    
  }
 
}
