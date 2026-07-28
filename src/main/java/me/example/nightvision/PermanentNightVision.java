package me.example.nightvision;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PermanentNightVision extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getScheduler().runTaskTimer(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.addPotionEffect(new PotionEffect(
                        PotionEffectType.NIGHT_VISION,
                        220,
                        0,
                        false,
                        false,
                        false
                ), true);
            }
        }, 0L, 200L); // Cấp lại mỗi 10 giây
    }
}
