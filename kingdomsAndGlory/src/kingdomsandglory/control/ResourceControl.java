/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdomsandglory.control;

import kingdomsandglory.exceptions.ResourceControlException;
import kingdomsandglory.model.Army;
import kingdomsandglory.model.Resource;
import kingdomsandglory.model.ResourceEnum;

/**
 *
 * @author piano
 */
public class ResourceControl {
    public static Resource[] createItems() {
        Resource[] resourceType = new Resource[6];

        Resource cloth = new Resource();
        cloth.resourceQty = 0;
        cloth.resourceDiscription = "cloth";
        resourceType[ResourceEnum.cloth.ordinal()] = cloth;

        Resource wood = new Resource();
        wood.resourceQty = 0;
        wood.resourceDiscription = "wood";
        resourceType[ResourceEnum.wood.ordinal()] = wood;

        Resource stone = new Resource();
        stone.resourceQty = 0;
        stone.resourceDiscription = "stone";
        resourceType[ResourceEnum.stone.ordinal()] = stone;

        Resource metal = new Resource();
        metal.resourceQty = 0;
        metal.resourceDiscription = "metal";
        resourceType[ResourceEnum.metal.ordinal()] = metal;

        Resource gold = new Resource();
        gold.resourceQty = 0;
        gold.resourceDiscription = "gold";
        resourceType[ResourceEnum.gold.ordinal()] = gold;
        
        Resource army = new Resource();
        army.resourceQty = 50;
        army.resourceDiscription = "Army";
        resourceType[ResourceEnum.army.ordinal()] = army;
        
        

        return resourceType;
    }
    
    public static String makeTransaction(int[] inputs) throws ResourceControlException {
        System.out.println("*** makeTransaction() called ***");
        return null;
    }
    
}
