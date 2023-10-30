 public static void printTitle(boolean includeStars) {
        String title = "The Title";
        System.out.println(title);
        
        if (includeStars) {
            int starCount = title.length();
            String stars = "*".repeat(starCount);
            System.out.println(stars);
        }
    }