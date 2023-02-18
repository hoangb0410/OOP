class ForDemo
{
    public static void main(String[] args)
    {
        for (int i=1; i<11; i++)
        {
            System.out.println("Count is: " + i);
        }
    }
}
class WhileDemo
{
    public static void main(String[] args)
    {
        int count = 1;
        while (count < 11) {
        System.out.println("Count is: "+ count);
        count++;
        }
    }
}
class DoWhileDemo
{
    public static void main(String[] args)
    {
        int count = 1;
        do {
            System.out.println("Count is: + count");
            count++;
        } while (count < 11);
    }
}