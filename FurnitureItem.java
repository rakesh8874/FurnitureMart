public class FurnitureItem{
    String size;
    int cost;
    String color;
    String design;
    String quality;
    String brand;
    void tables(){
        size = "36 inches to 40 inches wide and 60 inches long";
        cost = 12000;
        color = "Gray";
        design = "Nova Office Table";
        quality = "High";
        brand = "Supreme";
    }
    void chairs(){
        size = "seat height averages 18\" to 20\", seat width averages about 15-1/2\" in back and 18\" in front, and average seat depth is 16\" to 18\"";
        cost = 1200;
        color = "Brown";
        design = "Vinil Wooden Chair";
        quality = "High";
        brand = "Adiko";
    }
    void cupboards(){
        size = "12 to 15 inch height";
        cost = 15000;
        color = "gray light";
        design = "modern cupboard design";
        quality = "high";
        brand = "Space Wood";
    }
    void stools(){
        size = "8 inces";
        cost = 1200;
        color = "dark red";
        design = "Modern Stool";
        quality = "High";
        brand = "Space wood";
    }
    void displayTables(){
        System.out.println("Can be used to study, at the of family gathering for break fast lunch dinner");
        System.out.println("Size of Table is : "+size);
        System.out.println("Cost of Table is : "+cost);
        System.out.println("Color Of the Table is : "+color);
        System.out.println("Design of The Table is : "+design);
        System.out.println("Quality of the Table is : "+quality);
        System.out.println("Brand Name of the Table is : "+brand);
    }
    void displayChairs(){
        System.out.println("Can be Used for Sitting");
        System.out.println("Size of Chair is : "+size);
        System.out.println("Cost of Chair is : "+cost);
        System.out.println("Color Of the Chair is : "+color);
        System.out.println("Design of The Chair is : "+design);
        System.out.println("Quality of the Chair is : "+quality);
        System.out.println("Brand Name of the Chair is : "+brand);
    }
    void displayCupboards(){
        System.out.println("A cupboard is a piece of furniture that's used for storing things.");
        System.out.println("Size of Cupboard is : "+size);
        System.out.println("Cost of Cupboard is : "+cost);
        System.out.println("Color Of the Cupboard is : "+color);
        System.out.println("Design of The Cupboard is : "+design);
        System.out.println("Quality of the Cupboard is : "+quality);
        System.out.println("Brand Name of the Cupboard is : "+brand);
    }
    void displayStools(){
        System.out.println("Can be used for breakfast, lunch and dinner as well as for sitting");
        System.out.println("Size of Stool is : "+size);
        System.out.println("Cost of Stool is : "+cost);
        System.out.println("Color Of the Stool is : "+color);
        System.out.println("Design of The Stool is : "+design);
        System.out.println("Quality of the Stool is : "+quality);
        System.out.println("Brand Name of the Stool is : "+brand);
    }

}

