package dev.thecodewarrior.hooked.capability

import dev.thecodewarrior.hooked.hook.HookType
import net.minecraft.nbt.CompoundNBT
import net.minecraftforge.common.util.INBTSerializable

class BasicHookItem(
    override val type: HookType
): IHookItem {
}