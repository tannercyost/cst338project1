public class T1
{
    public static void main(String[] args)
    {
        School SCD = new School("SCD");

        SCD.readData("C:\\Users\\Tanner Yost\\Desktop\\f18cst338\\cst338project1\\src\\test1.txt");

        System.out.println("\n\n===== ANSWER: 1 Instructor (Y. Byun), 1 Course (CST338), 1 Student (Alice Otter) =====\n");
        SCD.schoolInfo();
    }
}