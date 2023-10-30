public class test0 {
    public static void main(String[] args)
    {
        
        String furniture[] = {"chair", "sofa", "table",
        "cabinet"};
        System.out.println("The Furniture are: ");
        for( int i = 0; i < furniture.length; i++) {

            System.out.println(furniture[i]);
        }

        System.out.println("First 2 elements are : \n"+ furniture[0] +"\n"+ furniture[1]);

        for( String i : furniture)
        {
            if (i.equals("sofa"))
            {
                System.out.println("The item " + i + " is here.");
                //break;
            }
        }

    }
}
