// T10: Test searchByEmail().
public class T10
{
    public static void main(String[] args)
    {
        School SCD = new School("SCD");

        SCD.readData("C:\\Users\\Tanner Yost\\Desktop\\f18cst338\\cst338project1\\src\\test10.txt");
        System.out.println("\n\n===== ANSWER: No employee with the email =====\n");
        SCD.searchByEmail("ccc@csu.edu");

        System.out.println("\n\n===== ANSWER: Employee Number: 300, Name: CCC =====\n");
        SCD.searchByEmail("ccc@csumb.edu");
    }
}