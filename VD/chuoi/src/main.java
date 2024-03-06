public class main
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
		
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.add("ABC");
        stringBox.add("DEF");
        stringBox.add("GHK");

        // Duyệt và in ra tất cả các phần tử trong stringBox
        for (String s : stringBox.getAll()) 
        {
            System.out.println(s);
        }

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(10);
        intBox.add(20);
        intBox.add(30);

        // Duyệt và in ra tất cả các phần tử trong intBox
        for (Integer i : intBox.getAll()) 
        {
            System.out.println(i);
        }
    }
    
}