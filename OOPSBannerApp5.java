public class OOPSBannerApp5 {
    /**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by storing banner lines
 * in a String array and printing them using a for-each loop,
 * improving modularity and reusability.
 *
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create array to store 7 banner lines
        String[] lines = new String[7];

        // Populate array using String.join()
        lines[0] = String.join("",
                "  *****  ",
                "  *****  ",
                " ******** ",
                "  *****  "
        );

        lines[1] = String.join("",
                " **     **",
                " **     **",
                " **     **",
                " **     **"
        );

        lines[2] = String.join("",
                " **     **",
                " **     **",
                " **     **",
                " **       "
        );

        lines[3] = String.join("",
                " **     **",
                " **     **",
                " ******** ",
                "  *****  "
        );

        lines[4] = String.join("",
                " **     **",
                " **     **",
                " **       ",
                "       ** "
        );

        lines[5] = String.join("",
                " **     **",
                " **     **",
                " **       ",
                " **     **"
        );

        lines[6] = String.join("",
                "  *****  ",
                "  *****  ",
                " **       ",
                "  *****  "
        );

        // Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
}
