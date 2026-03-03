public class OOPSBannerApp4 {
    /**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by replacing string concatenation (+)
 * with the String.join() method to construct each line of the
 * "OOPS" banner efficiently.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                " ******** ",
                "  *****  "
        ));

        System.out.println(String.join("",
                " **     **",
                " **     **",
                " **     **",
                " **     **"
        ));

        System.out.println(String.join("",
                " **     **",
                " **     **",
                " **     **",
                " **       "
        ));

        System.out.println(String.join("",
                " **     **",
                " **     **",
                " ******** ",
                "  *****  "
        ));

        System.out.println(String.join("",
                " **     **",
                " **     **",
                " **       ",
                "       ** "
        ));

        System.out.println(String.join("",
                " **     **",
                " **     **",
                " **       ",
                " **     **"
        ));

        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                " **       ",
                "  *****  "
        ));
    }
}
}
