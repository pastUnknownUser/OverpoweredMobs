 package com.unknownuser.overpoweredmobs.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.inventory.ItemStack;


public class MobEvents implements Listener {

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

        if (event.getEntityType() == EntityType.CREEPER) {

            Creeper creeper = (Creeper) event.getEntity();

            creeper.setAware(true);

            creeper.setPowered(true);
        }
        if (event.getEntityType() == EntityType.PIGLIN) {

            Piglin piglin = (Piglin) event.getEntity();

            piglin.setAware(true);

            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.KNOCKBACK, 2);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

            ItemStack PigHelmet = new ItemStack(Material.NETHERITE_HELMET);
            PigHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigHelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack PigChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            PigChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigChestplate.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack PigLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            PigLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigLeggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack PigBoots = new ItemStack(Material.NETHERITE_BOOTS);
            PigBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigBoots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            piglin.getEquipment().setHelmet(PigHelmet);
            piglin.getEquipment().setChestplate(PigChestplate);
            piglin.getEquipment().setLeggings(PigLeggings);
            piglin.getEquipment().setBoots(PigBoots);
            piglin.getEquipment().setItemInMainHand(opSword);
        }
        if (event.getEntityType() == EntityType.PIGLIN_BRUTE) {

            PiglinBrute piglinBrute = (PiglinBrute) event.getEntity();

            ItemStack opAxe = new ItemStack(Material.NETHERITE_AXE);
            opAxe.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 5);

            ItemStack PigBHelmet = new ItemStack(Material.NETHERITE_HELMET);
            PigBHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigBHelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack PigBChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            PigBChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigBChestplate.addEnchantment(Enchantment.PROTECTION_PROJECTILE,2);

            ItemStack PigBLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            PigBLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigBLeggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE,2);

            ItemStack PigBBoots = new ItemStack(Material.NETHERITE_BOOTS);
            PigBBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            PigBBoots.addEnchantment(Enchantment.PROTECTION_PROJECTILE,2);

            piglinBrute.getEquipment().setHelmet(PigBHelmet);
            piglinBrute.getEquipment().setChestplate(PigBChestplate);
            piglinBrute.getEquipment().setLeggings(PigBLeggings);
            piglinBrute.getEquipment().setBoots(PigBBoots);
            piglinBrute.getEquipment().setItemInMainHand(opAxe);
        }
        if (event.getEntityType() == EntityType.WITHER_SKELETON) {

            WitherSkeleton Witherskele = (WitherSkeleton) event.getEntity();

            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.KNOCKBACK, 2);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

            ItemStack WithHelmet = new ItemStack(Material.NETHERITE_HELMET);
            WithHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack WithChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            WithChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack WithLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            WithLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack WithBoots = new ItemStack(Material.NETHERITE_BOOTS);
            WithBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            Witherskele.getEquipment().setHelmet(WithHelmet);
            Witherskele.getEquipment().setChestplate(WithChestplate);
            Witherskele.getEquipment().setLeggings(WithLeggings);
            Witherskele.getEquipment().setBoots(WithBoots);
            Witherskele.getEquipment().setItemInMainHand(opSword);
        }
        if (event.getEntityType() == EntityType.PILLAGER) {

            Pillager pillager = (Pillager) event.getEntity();

            ItemStack opCBow = new ItemStack(Material.CROSSBOW);
            opCBow.addEnchantment(Enchantment.MULTISHOT, 1);
            opCBow.addEnchantment(Enchantment.QUICK_CHARGE,3);
            pillager.getEquipment().setItemInMainHand(opCBow);
        }
        if (event.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) event.getEntity();

            ItemStack SkeleHelmet = new ItemStack(Material.NETHERITE_HELMET);
            SkeleHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            SkeleHelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack SkeleChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            SkeleChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            SkeleChestplate.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack SkeleLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            SkeleLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            SkeleLeggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            ItemStack SkeleBoots = new ItemStack(Material.NETHERITE_BOOTS);
            SkeleBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            SkeleBoots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

            skeleton.getEquipment().setHelmet(SkeleHelmet);
            skeleton.getEquipment().setChestplate(SkeleChestplate);
            skeleton.getEquipment().setLeggings(SkeleLeggings);
            skeleton.getEquipment().setBoots(SkeleBoots);


            ItemStack opBow = new ItemStack(Material.BOW);
            opBow.addEnchantment(Enchantment.ARROW_DAMAGE,2);
            opBow.addEnchantment(Enchantment.ARROW_FIRE,1);
            skeleton.getEquipment().setItemInMainHand(opBow);
        }
        if (event.getEntityType() == EntityType.ZOMBIE) {

            Zombie zombie = (Zombie) event.getEntity();

            ItemStack ZomHelmet = new ItemStack(Material.NETHERITE_HELMET);
            ZomHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack ZomChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            ZomChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack ZomLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            ZomLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack ZomBoots = new ItemStack(Material.NETHERITE_BOOTS);
            ZomBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            zombie.getEquipment().setHelmet(ZomHelmet);
            zombie.getEquipment().setChestplate(ZomChestplate);
            zombie.getEquipment().setLeggings(ZomLeggings);
            zombie.getEquipment().setBoots(ZomBoots);

            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.KNOCKBACK, 2);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

            zombie.getEquipment().setItemInMainHand(opSword);
        }
        if (event.getEntityType() == EntityType.HUSK) {

            Husk Husk = (Husk) event.getEntity();

            ItemStack HuskHelmet = new ItemStack(Material.NETHERITE_HELMET);
            HuskHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack HuskChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            HuskChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack HuskLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            HuskLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            ItemStack HuskBoots = new ItemStack(Material.NETHERITE_BOOTS);
            HuskBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

            Husk.getEquipment().setHelmet(HuskHelmet);
            Husk.getEquipment().setChestplate(HuskChestplate);
            Husk.getEquipment().setLeggings(HuskLeggings);
            Husk.getEquipment().setBoots(HuskBoots);

            ItemStack opSword = new ItemStack(Material.NETHERITE_SWORD);
            opSword.addEnchantment(Enchantment.KNOCKBACK, 2);
            opSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

            Husk.getEquipment().setItemInMainHand(opSword);
        }
        if (event.getEntityType() == EntityType.WOLF) {

            Wolf wolf = (Wolf) event.getEntity();
            wolf.setAngry(true);
        }
        if (event.getEntityType() == EntityType.IRON_GOLEM) {

            IronGolem ironGolem = (IronGolem) event.getEntity();
            ironGolem.setAware(true);
        }
    }
    @EventHandler
    public void onExplode(ExplosionPrimeEvent e) {
        if(e.getEntity() instanceof Creeper) {
            e.setCancelled(true);
            Entity creeper = e.getEntity();
            Location loc = creeper.getLocation();
            Fireball fireball = creeper.getWorld().spawn(loc,Fireball.class);
            creeper.teleport(new Location(creeper.getWorld(), 0,0,0));
            fireball.setYield(80);
            fireball.teleport(new Location(loc.getWorld(),loc.getX(), loc.getY()-2, loc.getZ()));
        }else if (e.getEntity() instanceof Fireball) {
            e.setFire(false);
        }
    }
}