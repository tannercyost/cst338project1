// T7: Test deleteCourse().
public class T7
{
    public static void main(String[] args)
    {
        School SCD = new School("SCD");

        SCD.readData("C:\\Users\\Tanner Yost\\Desktop\\f18cst338\\cst338project1\\src\\test7.txt");
        SCD.register (301, 1111);
        SCD.register (301, 2222);

        System.out.println("\n\n===== ANSWER: 1 course deletion should be failed. =====\n");
        SCD.deleteCourse(301);
        SCD.deleteCourse(302);
    }
}