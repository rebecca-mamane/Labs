public class PersonInfo3 {

<<<<<<< HEAD
    public static String firstName = "Cheikh Bassirou";
    public static String lastName = "Ndoye";
    public static int studentNo = 300045791;
    public static String description = "Walk it like I talk it";
=======
    public static String firstName = "shravan";
    public static String lastName = "Vyas";
    public static int studentNo = 300089045;
<<<<<<< HEAD
    public static String description = "Might as well Like a few long walks along the beach+ more description along the way .....";
=======
    public static String description = "Likes short runs along the beach";
>>>>>>> newBranch
>>>>>>> 27c67bb6a2825d2893f5cd125dd67687c2cead37

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }

    
    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
}
