package Kakashi.demon.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.caaarlowsz.extrememc.kitpvp.ExtremePvP;
import Kakashi.demon.eventos.Dinheiro;

public class LojaKits implements Listener, CommandExecutor {
	@SuppressWarnings("unused")
	private ExtremePvP plugin;

	public LojaKits(ExtremePvP instance) {
		this.plugin = instance;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("�7[�cErro�7] �cApenas jogadores podem executar esse comando");
			return true;
		}

		ItemStack iron = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);

		ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta Swordmeta = Sword.getItemMeta();
		Swordmeta.setDisplayName(ChatColor.GREEN + " �fEspada de Diamante �a$200");
		Sword.setItemMeta(Swordmeta);

		ItemStack Sharp4 = new ItemStack(Material.DIAMOND_SWORD);
		Sharp4.addEnchantment(Enchantment.DAMAGE_ALL, 4);
		ItemMeta Sharp4meta = Sharp4.getItemMeta();
		Sharp4meta.setDisplayName(ChatColor.GREEN + " �fEspada Sharpness 4 �a$6000");
		Sharp4.setItemMeta(Sharp4meta);

		ItemStack Sharp5 = new ItemStack(Material.DIAMOND_SWORD);
		Sharp5.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		ItemMeta Sharp5meta = Sharp5.getItemMeta();
		Sharp5meta.setDisplayName(ChatColor.GREEN + " �fEspada Sharpness 5 �a$8000");
		Sharp5.setItemMeta(Sharp5meta);

		ItemStack EXP = new ItemStack(Material.EXP_BOTTLE);
		ItemMeta EXPmeta = EXP.getItemMeta();
		EXPmeta.setDisplayName(ChatColor.GREEN + " �fEXP �a$5200");
		EXP.setItemMeta(EXPmeta);

		ItemStack Arco = new ItemStack(Material.BOW);
		ItemMeta Arcometa = Arco.getItemMeta();
		Arcometa.setDisplayName(ChatColor.GREEN + " �fArco e Flecha �a$250");
		Arco.setItemMeta(Arcometa);

		ItemStack ArcoFor�a = new ItemStack(Material.BOW);
		ArcoFor�a.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
		ItemMeta ArcoFor�ameta = ArcoFor�a.getItemMeta();
		ArcoFor�ameta.setDisplayName(ChatColor.GREEN + " �fArco For�a 5 �a$7000");
		ArcoFor�a.setItemMeta(ArcoFor�ameta);

		ItemStack ArcoImpacto = new ItemStack(Material.BOW);
		ArcoImpacto.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
		ItemMeta ArcoImpactometa = ArcoImpacto.getItemMeta();
		ArcoImpactometa.setDisplayName(ChatColor.GREEN + " �fArco Impacto 2 �a$4000");
		ArcoImpacto.setItemMeta(ArcoImpactometa);

		ItemStack warps = new ItemStack(Material.ARROW);
		ItemMeta Flechasmeta = warps.getItemMeta();
		Flechasmeta.setDisplayName(ChatColor.GREEN + "warps �a$150");
		warps.setItemMeta(Flechasmeta);

		ItemStack po��o = new ItemStack(Material.POTION);
		po��o.setDurability((short) 8265);
		ItemMeta po��ometa = po��o.getItemMeta();
		po��ometa.setDisplayName(ChatColor.GREEN + " �fPo��o de For�a �a$9500");
		po��o.setItemMeta(po��ometa);

		ItemStack po��o2 = new ItemStack(Material.POTION);
		po��o2.setDurability((short) 16457);
		ItemMeta po��o2meta = po��o2.getItemMeta();
		po��o2meta.setDisplayName(ChatColor.GREEN + " �fDuas Po��es de For�a �a$9000");
		po��o2.setItemMeta(po��o2meta);

		ItemStack po��o3 = new ItemStack(Material.POTION);
		po��o3.setDurability((short) 16428);
		ItemMeta po��o3meta = po��o3.getItemMeta();
		po��o3meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Dano �a$2000");
		po��o3.setItemMeta(po��o3meta);

		ItemStack po��o4 = new ItemStack(Material.POTION);
		po��o4.setDurability((short) 16418);
		ItemMeta po��o4meta = po��o4.getItemMeta();
		po��o4meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Velocidade II �a$3000");
		po��o4.setItemMeta(po��o4meta);

		ItemStack po��o5 = new ItemStack(Material.POTION);
		po��o5.setDurability((short) 16388);
		ItemMeta po��o5meta = po��o5.getItemMeta();
		po��o5meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Veneno �a$1000");
		po��o5.setItemMeta(po��o5meta);
		Player p = (Player) sender;
		Inventory shop = Bukkit.getServer().createInventory(p, 18, ChatColor.GOLD + " �fShop");

		shop.setItem(0, iron);
		shop.setItem(1, iron);
		shop.setItem(2, ArcoImpacto);
		shop.setItem(3, Sharp4);
		shop.setItem(4, Sword);
		shop.setItem(5, Sharp5);
		shop.setItem(6, ArcoFor�a);
		shop.setItem(7, iron);
		shop.setItem(8, iron);
		shop.setItem(9, iron);
		shop.setItem(10, Arco);
		shop.setItem(11, po��o3);
		shop.setItem(12, po��o);
		shop.setItem(13, po��o2);
		shop.setItem(14, po��o4);
		shop.setItem(15, po��o5);
		shop.setItem(16, EXP);
		shop.setItem(17, iron);
		p.openInventory(shop);
		return false;

	}

	@EventHandler
	public void inventoryclick(InventoryClickEvent e) {
		if ((e.getInventory().getName().equalsIgnoreCase(ChatColor.GOLD + " �fShop")) && (e.getRawSlot() < 18)
				&& (e.getRawSlot() > -1)) {
			ItemStack itemclicked = e.getCurrentItem();
			ItemStack cursor = e.getCursor();
			e.setCancelled(true);
			if (cursor.getTypeId() == 0) {
				Player p = (Player) e.getWhoClicked();

				ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
				ItemMeta Swordmeta = Sword.getItemMeta();
				Swordmeta.setDisplayName(ChatColor.GREEN + " �fEspada de Diamante �a$200");
				Sword.setItemMeta(Swordmeta);

				ItemStack Sharp4 = new ItemStack(Material.DIAMOND_SWORD);
				Sharp4.addEnchantment(Enchantment.DAMAGE_ALL, 4);
				ItemMeta Sharp4meta = Sharp4.getItemMeta();
				Sharp4meta.setDisplayName(ChatColor.GREEN + " �fEspada Sharpness 4 �a$6000");
				Sharp4.setItemMeta(Sharp4meta);

				ItemStack Sharp5 = new ItemStack(Material.DIAMOND_SWORD);
				Sharp5.addEnchantment(Enchantment.DAMAGE_ALL, 5);
				ItemMeta Sharp5meta = Sharp5.getItemMeta();
				Sharp5meta.setDisplayName(ChatColor.GREEN + " �fEspada Sharpness 5 �a$8000");
				Sharp5.setItemMeta(Sharp5meta);

				ItemStack EXP = new ItemStack(Material.EXP_BOTTLE);
				ItemMeta EXPmeta = EXP.getItemMeta();
				EXPmeta.setDisplayName(ChatColor.GREEN + " �fEXP �a$5200");
				EXP.setItemMeta(EXPmeta);

				ItemStack Arco = new ItemStack(Material.BOW);
				ItemMeta Arcometa = Arco.getItemMeta();
				Arcometa.setDisplayName(ChatColor.GREEN + " �fArco e Flecha �a$250");
				Arco.setItemMeta(Arcometa);

				ItemStack ArcoFor�a = new ItemStack(Material.BOW);
				ArcoFor�a.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
				ItemMeta ArcoFor�ameta = ArcoFor�a.getItemMeta();
				ArcoFor�ameta.setDisplayName(ChatColor.GREEN + " �fArco For�a 5 �a$7000");
				ArcoFor�a.setItemMeta(ArcoFor�ameta);

				ItemStack ArcoImpacto = new ItemStack(Material.BOW);
				ArcoImpacto.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
				ItemMeta ArcoImpactometa = ArcoImpacto.getItemMeta();
				ArcoImpactometa.setDisplayName(ChatColor.GREEN + " �fArco Impacto 2 �a$4000");
				ArcoImpacto.setItemMeta(ArcoImpactometa);

				ItemStack warps = new ItemStack(Material.ARROW);
				ItemMeta Flechasmeta = warps.getItemMeta();
				Flechasmeta.setDisplayName(ChatColor.GREEN + "warps �a$150");
				warps.setItemMeta(Flechasmeta);

				ItemStack po��o = new ItemStack(Material.POTION);
				po��o.setDurability((short) 8265);
				ItemMeta po��ometa = po��o.getItemMeta();
				po��ometa.setDisplayName(ChatColor.GREEN + " �fPo��o de For�a �a$9500");
				po��o.setItemMeta(po��ometa);

				ItemStack po��o2 = new ItemStack(Material.POTION);
				po��o2.setDurability((short) 16457);
				ItemMeta po��o2meta = po��o2.getItemMeta();
				po��o2meta.setDisplayName(ChatColor.GREEN + " �fDuas Po��es de For�a �a$9000");
				po��o2.setItemMeta(po��o2meta);

				ItemStack po��o3 = new ItemStack(Material.POTION);
				po��o3.setDurability((short) 16428);
				ItemMeta po��o3meta = po��o3.getItemMeta();
				po��o3meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Dano �a$2000");
				po��o3.setItemMeta(po��o3meta);

				ItemStack po��o4 = new ItemStack(Material.POTION);
				po��o4.setDurability((short) 16418);
				ItemMeta po��o4meta = po��o4.getItemMeta();
				po��o4meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Velocidade II �a$3000");
				po��o4.setItemMeta(po��o4meta);

				ItemStack po��o5 = new ItemStack(Material.POTION);
				po��o5.setDurability((short) 16388);
				ItemMeta po��o5meta = po��o5.getItemMeta();
				po��o5meta.setDisplayName(ChatColor.GREEN + " �fPo��o de Veneno �a$1000");
				po��o5.setItemMeta(po��o5meta);
				if (itemclicked.equals(Sword)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack Diamond = new ItemStack(Material.DIAMOND_SWORD);
						p.getInventory().addItem(new ItemStack[] { Diamond });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma espada de diamante!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}
				if (itemclicked.equals(Sword)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack Diamond = new ItemStack(Material.DIAMOND_SWORD);
						p.getInventory().addItem(new ItemStack[] { Diamond });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma espada de diamante!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}
				if (itemclicked.equals(Sharp4)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);
						ItemStack Diamond = new ItemStack(Material.DIAMOND_SWORD);
						Diamond.addEnchantment(Enchantment.DAMAGE_ALL, 4);
						p.getInventory().addItem(new ItemStack[] { Diamond });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou For�a 4 para sua espada!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}
				if (itemclicked.equals(Sharp5)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack Diamond = new ItemStack(Material.DIAMOND_SWORD);
						Diamond.addEnchantment(Enchantment.DAMAGE_ALL, 5);
						p.getInventory().addItem(new ItemStack[] { Diamond });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou For�a 5 para sua espada!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}
				if (itemclicked.equals(EXP)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						for (int i = 0; i < 64; i++) {
							ItemStack Diamond = new ItemStack(Material.EXP_BOTTLE);
							p.getInventory().addItem(new ItemStack[] { Diamond });
						}
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou um pack de Exp!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}
				if (itemclicked.equals(Arco)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack Diamond = new ItemStack(Material.BOW);
						p.getInventory().addItem(new ItemStack[] { Diamond });
						p.getInventory().addItem(new ItemStack[] { new ItemStack(262, 64) });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou um arco e flecha!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}
				if (itemclicked.equals(po��o3)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack po��oa3 = new ItemStack(Material.POTION);
						po��oa3.setDurability((short) 16428);
						p.getInventory().addItem(new ItemStack[] { po��oa3 });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma Po��o de dano!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}
				if (itemclicked.equals(po��o4)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);
						ItemStack po��o4a = new ItemStack(Material.POTION);
						po��o4a.setDurability((short) 16418);
						p.getInventory().addItem(new ItemStack[] { po��o4a });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma Po��o de velocidade II!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}
				if (itemclicked.equals(po��o5)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);
						ItemStack po��o5a = new ItemStack(Material.POTION);
						po��o5a.setDurability((short) 16388);
						p.getInventory().addItem(new ItemStack[] { po��o5a });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma Po��o de Veneno!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}
				if (itemclicked.equals(ArcoFor�a)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack ArcoFor�aa = new ItemStack(Material.BOW);
						ArcoFor�aa.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
						p.getInventory().addItem(new ItemStack[] { ArcoFor�aa });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou For�a 5 para seu arco!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;

				}

				if (itemclicked.equals(ArcoImpacto)) {

					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);

						ItemStack ArcoFor�aaa = new ItemStack(Material.BOW);
						ArcoFor�aaa.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
						p.getInventory().addItem(new ItemStack[] { ArcoFor�aaa });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou Impacto 2 para seu arco!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}

				if (itemclicked.equals(po��o)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);
						ItemStack po��oa = new ItemStack(Material.POTION);
						po��oa.setDurability((short) 8265);
						p.getInventory().addItem(new ItemStack[] { po��oa });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou uma po��o de For�a!");
						p.closeInventory();
						return;
					}
					DinheiroErro(p);
					return;
				}

				if (itemclicked.equals(po��o2)) {
					if (Dinheiro.getMoney(p) >= 2000) {
						Dinheiro.removeMoney(p, 2000);
					} else
						DinheiroErro(p);
					DinheiroErro(p);
					{

						ItemStack po��oaa = new ItemStack(Material.POTION);
						po��oaa.setDurability((short) 16457);
						p.getInventory().addItem(new ItemStack[] { po��oaa });
						p.getInventory().addItem(new ItemStack[] { po��oaa });
						p.sendMessage(ChatColor.GREEN + " �aVoc�  comprou duas po��o de For�a!");
						p.closeInventory();
						return;
					}
				}
			}
		}
	}

	public void DinheiroErro(Player p) {
		p.sendMessage("�7[�6�lXP�7] �c XP Insuficiente");
		p.closeInventory();
	}

	{
	}
}
