public class Chuoi{
    private static int a;

    // Phương thức để thiết lập giá trị cho biến a
    public static void f1() 
    {
        a = 1;
    }

    // Phương thức để in giá trị của biến a
    public static void f2() 
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Gọi hàm f1
        f1();
        // Gọi hàm f2 để in giá trị của a
        f2();
    }
}