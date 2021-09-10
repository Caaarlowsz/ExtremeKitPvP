package Kakashi.demon.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menu implements CommandExecutor, Listener {
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("extra")) {
			Inventory menu = Bukkit.createInventory(p, 36, "§c§lMENU §bKITPVP");

			ItemStack kHeads = new ItemStack(Material.PAPER);
			ItemMeta mHeads = kHeads.getItemMeta();
			mHeads.setDisplayName("§bWarps");
			kHeads.setItemMeta(mHeads);

			ItemStack vidru = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
			ItemMeta vidro = vidru.getItemMeta();
			vidro.setDisplayName("§c-");
			vidru.setItemMeta(vidro);

			ItemStack kEfeitos = new ItemStack(Material.NETHER_STAR);
			ItemMeta mEfeitos = kEfeitos.getItemMeta();
			mEfeitos.setDisplayName("§bInformaçoes");
			kEfeitos.setItemMeta(mEfeitos);

			ItemStack kSurprise = new ItemStack(Material.DIAMOND);
			ItemMeta mSurprise = kSurprise.getItemMeta();
			mSurprise.setDisplayName("§bYoutuber");
			kSurprise.setItemMeta(mSurprise);

			ItemStack kbuy = new ItemStack(Material.EMERALD);
			ItemMeta mbuy = kbuy.getItemMeta();
			mbuy.setDisplayName("§bBuycraft");
			kbuy.setItemMeta(mbuy);

			ItemStack kloja = new ItemStack(Material.getMaterial(342));
			ItemMeta mloja = kloja.getItemMeta();
			mloja.setDisplayName("§bLoja de Kits");
			kloja.setItemMeta(mloja);

			ItemStack kits = new ItemStack(Material.CHEST);
			ItemMeta kkits = kits.getItemMeta();
			kkits.setDisplayName("§bKits Primarios");
			kits.setItemMeta(kkits);

			ItemStack kits2 = new ItemStack(Material.ENDER_CHEST);
			ItemMeta kkits2 = kits2.getItemMeta();
			kkits2.setDisplayName("§bKits Secundarios");
			kits2.setItemMeta(kkits2);

			ItemStack cc = new ItemStack(Material.getMaterial(131));
			ItemMeta ccc = cc.getItemMeta();
			ccc.setDisplayName("§bClicktest");
			cc.setItemMeta(ccc);

			ItemStack kSlotVazio = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
			ItemMeta mSlotVazio = kSlotVazio.getItemMeta();
			mSlotVazio.setDisplayName(" ");
			kSlotVazio.setItemMeta(mSlotVazio);

			menu.setItem(4, kloja);
			menu.setItem(10, kEfeitos);
			menu.setItem(12, kHeads);
			menu.setItem(14, kSurprise);
			menu.setItem(16, kbuy);
			menu.setItem(29, kits);
			menu.setItem(31, cc);
			menu.setItem(33, kits2);
			menu.setItem(0, vidru);
			menu.setItem(9, vidru);
			menu.setItem(18, vidru);
			menu.setItem(27, vidru);

			menu.setItem(8, vidru);
			menu.setItem(17, vidru);
			menu.setItem(26, vidru);
			menu.setItem(35, vidru);

			for (int i = 0; i < menu.getSize(); i++) {
				if (menu.getItem(i) == null) {
					menu.setItem(i, kSlotVazio);
				}
			}
			p.openInventory(menu);
		}
		return false;
	}

	@EventHandler
	public void clickevent(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getTitle().equalsIgnoreCase("§c§lMENU §bKITPVP")) {
			e.getCurrentItem();
			e.setCancelled(true);

			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bWarps")) {
				p.closeInventory();
				p.chat("/warps");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bInformaçoes")) {
				p.closeInventory();
				p.chat("/serverinfo");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bLoja de Kits")) {
				p.closeInventory();
				p.chat("/loja");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bYoutuber")) {
				p.closeInventory();
				p.chat("/youtuber");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bClicktest")) {
				p.closeInventory();
				p.chat("/clicktest");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bKits Primarios")) {
				p.chat("/kits");

				Kit.setupGUI(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bKits Secundarios")) {
				Kit2.setupGUI(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bBuycraft")) {
				p.closeInventory();
				p.chat("/Buy");
			}

		}
	}
}
