package dev.turnr.bangers_and_mash.datagen;

import dev.turnr.bangers_and_mash.datagen.loot.ModBlockLootTables;
import java.util.List;
import java.util.Set;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class ModLootTableProvider {
  public static LootTableProvider create(PackOutput output) {
    return new LootTableProvider(output, Set.of(), List.of(
        new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK)
    ));
  }
}