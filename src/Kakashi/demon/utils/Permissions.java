/*    */ package Kakashi.demon.utils;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.permissions.Permission;
/*    */ 
/*    */ public class Permissions
/*    */   implements Listener
/*    */ {
/* 11 */   public Permission StaffChat = new Permission("kitpvp.staffchat");
/* 12 */   public Permission StaffReceiveChat = new Permission("kitpvp.staffchat");
/*    */   
/*    */   public static void semPermiassao(Player player)
/*    */   {
/* 16 */     player.sendMessage(ChatColor.RED + "Você nao tem permissao!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Infinite Sea\Desktop\Meus plugins\JaapaPvP.jar!\com\Nerio\net\managers\Permissions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */