package me.shalev.customcraft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemStack result = new ItemStack(Material.NETHERITE_PICKAXE, 1);

        ItemMeta meta = result.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_RED + "God Pickaxe");

        result.setItemMeta(meta);
        result.addEnchantment(Enchantment.DIG_SPEED, 5);
        result.addEnchantment(Enchantment.DURABILITY, 3);
        result.addEnchantment(Enchantment.MENDING, 1);
        result.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);

        NamespacedKey key = new NamespacedKey(this, "god_pickaxe");

        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape("DPD"," O "," O ");
        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('P', Material.NETHERITE_PICKAXE);
        recipe.setIngredient('O', Material.OBSIDIAN);

        Bukkit.addRecipe(recipe);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
