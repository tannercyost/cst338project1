public class T2
{
    public static void main(String[] args)
    {
        School SCD = new School("SCD");

        SCD.readData("C:\\Users\\Tanner Yost\\Desktop\\f18cst338\\cst338project1\\src\\test1.txt");
        System.out.println("\n\n===== ANSWER: 3 fail messages. One instructor fail, one course fail, one student fail. =====\n");
        SCD.readData("C:\\Users\\Tanner Yost\\Desktop\\f18cst338\\cst338project1\\src\\test2.txt");
    }
}