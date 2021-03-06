/*    */
package Kakashi.demon.kits;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.Random;

/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.PlayerDeathEvent;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.potion.PotionEffect;
/*    */ import org.bukkit.potion.PotionEffectType;

import Kakashi.demon.eventos.KitAPI;
import Kakashi.demon.utils.Scoreboard;

/*    */
/*    */
/*    */
/*    */ public class Barbarian/*    */ implements Listener, CommandExecutor
/*    */ {
	/* 27 */ public static ArrayList<Player> barbarian = new ArrayList<>();

	/*    */
	/*    */ @EventHandler
	/*    */ public void deathe(PlayerDeathEvent e) {
		/* 31 */ Player p = e.getEntity();
		/*    */
		/* 33 */ barbarian.remove(p);
		/*    */ }

	/*    */
	/*    */ @EventHandler
	/* 37 */ public void ent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		/*    */
		/* 39 */ barbarian.remove(p);
		/*    */ }

	/*    */
	/*    */
	/*    */ public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	/*    */ {
		/* 45 */ Player jogador = (Player) sender;
		/* 46 */ if (label.equalsIgnoreCase("barbarian")) {
			/* 47 */ if (jogador.hasPermission("kit.barbarian"))
			/*    */ {
				/* 56 */ if (!(KitAPI.getkit(jogador) == ("Nenhum")))
				/*    */ {
					/* 51 */ jogador.sendMessage("?4?lKIT ?cVoce ja selecionou um kit !");
					/*    */ }
				/*    */ else
				/*    */ {
					/* 55 */ giveKit(jogador);
					/*    */ }
				/*    */
				/*    */ }
			/*    */ else {
				/* 60 */ jogador.sendMessage(ChatColor.RED + "?4?lKIT ?7Voce nao possue este kit !");
				/*    */ }
			/*    */ }
		/* 63 */ return false;
		/*    */ }

	/*    */
	/*    */ public static void giveKit(Player p)
	/*    */ {
		/* 68 */ p.getInventory().clear();
		/* 69 */ ItemStack sword = new ItemStack(Material.STONE_SWORD);
		/* 70 */ p.getInventory().addItem(new ItemStack[] { sword });
		/* 71 */ p.sendMessage(ChatColor.GREEN + "?4?lKIT ?7Voce escolheu ?cBarbarian!");
		KitAPI.setKit(p, "Barbarian");
		Scoreboard.iscoriboard(p);
		KitAPI.darsopa(p);
		/* 76 */ barbarian.add(p);
		/*    */ }

	/*    */
	/*    */ @EventHandler
	/*    */ public void onPosion(EntityDamageByEntityEvent e)
	/*    */ {
		/* 82 */ if (((e.getDamager() instanceof Player)) && ((e.getEntity() instanceof Player)))
		/*    */ {
			/* 84 */ Player p = (Player) e.getEntity();
			/* 85 */ Player d = (Player) e.getDamager();
			/* 86 */ if (barbarian.contains(d))
			/*    */ {
				/* 88 */ Random r = new Random();
				/* 89 */ int rand = r.nextInt(100);
				/* 90 */ if (rand >= 80) {
					/* 91 */ p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 80, 1));
					/*    */ }
				/*    */ }
			/*    */ }
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Infinite Sea\Desktop\Meus
 * plugins\JaapaPvP.jar!\com\Nerio\net\kits\Barbarian.class Java compiler
 * version: 7 (51.0) JD-Core Version: 0.7.1
 */