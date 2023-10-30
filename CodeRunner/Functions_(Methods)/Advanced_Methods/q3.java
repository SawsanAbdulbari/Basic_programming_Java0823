public static void printAphorisms(String aphorisms[])
{
    String aphorism = aphorismPrinter(2);
    System.out.println(aphorism);
}
public static String aphorismPrinter(int index){
    String aphorisms [] ={
        "Actions speak louder than words.",
        "A barking dog never bites.",
        "A penny saved is a penny earned.",
        "All things come to those who wait."
    };
    
    if (index >= 0 && index < aphorisms.length)
        return aphorisms[index];
    else 
        return "Invalid index.";
   
}