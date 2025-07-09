public class Arguments 
{
    public static void Update(int marks[] , int nonchangeble)
    {
        nonchangeble = 10;
        for(int i=0; i<marks.length; i++)
        {
            marks[i]  =+ 1;
        }
    }    

    public static void main(String args[])
    {
        int nonchangeble = 5;
        int marks[] = {96 , 93 , 98};
        Update(marks, nonchangeble);

        System.out.println("Nonchangeble : "+nonchangeble);

        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
