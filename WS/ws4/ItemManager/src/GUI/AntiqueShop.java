package GUI;

import DTO.Item;
import DTO.Vase;
import DTO.Statue;  // Assuming there is a Statue class in the DTO package
import DTO.Painting; // Assuming there is a Painting class in the DTO package

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class AntiqueShop 
{

    public static void main(String[] args) 
    {
        String[] options={" Create a Vase “,”Create a Statue”,” Create a Statue”,” display the item"};
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            choice = MENU.getChoice(options);

            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase) item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue) item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting) item).outputPainting();
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }

        } while (choice <= 4);
    }
}
