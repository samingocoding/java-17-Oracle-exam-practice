package buildingblocks;

public class BuildingBlocks {
    {
        System.out.println("We are in class file first");
    }
    public BuildingBlocks() {
        {
            System.out.println("We are in class constructor");
        }
    }

    public static void main(String [] args){
        {
            BuildingBlocks buildingBlocks= new BuildingBlocks();
            System.out.println("We are in main");

        }
    }
    {
        System.out.println("We are in class file  last");
    }
}
