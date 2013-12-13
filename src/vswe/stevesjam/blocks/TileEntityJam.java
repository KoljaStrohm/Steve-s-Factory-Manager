package vswe.stevesjam.blocks;

import net.minecraft.tileentity.TileEntity;
import vswe.stevesjam.components.ComponentType;
import vswe.stevesjam.components.ConnectionSet;
import vswe.stevesjam.components.FlowComponent;

import java.util.ArrayList;
import java.util.List;


public class TileEntityJam extends TileEntity {

    private List<FlowComponent> items;

    public TileEntityJam() {
        items = new ArrayList<>();

        items.add(new FlowComponent(30, 30, ComponentType.INPUT, ConnectionSet.STANDARD));
        items.add(new FlowComponent(200, 30, ComponentType.INPUT, ConnectionSet.FAIL_CHECK));
        items.add(new FlowComponent(200, 80, ComponentType.INPUT, ConnectionSet.FAIL_CHECK));
    }


    public List<FlowComponent> getFlowItems() {
        return items;
    }
}