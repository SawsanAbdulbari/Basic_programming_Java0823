public class Array {
    public static void main(String[] args) {

        String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};

        for (String item : furniture)
        {
            if (item.equals("Sofa"))
            {
                System.out.println("Sofa found");
                break;
            }
        }
    }
}