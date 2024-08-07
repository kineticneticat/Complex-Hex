package dev.kineticcat.complexhex.block.entity;

import at.petrak.hexcasting.api.block.HexBlockEntity;
import dev.kineticcat.complexhex.block.BlockBurnt;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.BiFunction;

public class BlockEntityBurntAmethyst extends HexBlockEntity {
    public BlockEntityBurntAmethyst(BlockBurnt block, BlockPos pos, BlockState state) {
        super(ComplexHexBlockEntities.typeForQuenchedAllay(block), pos, state);
    }
    public static BiFunction<BlockPos, BlockState, BlockEntityBurntAmethyst> fromKnownBlock(BlockBurnt block) {
        return (pos, state) -> new BlockEntityBurntAmethyst(block, pos, state);
    }
    @Override
    protected void saveModData(CompoundTag tag) {

    }

    @Override
    protected void loadModData(CompoundTag tag) {

    }
}
