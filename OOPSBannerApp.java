public class OOPSBannerApp {

    // Letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Letter P
    public static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // Letter S
    public static String[] getSPattern() {
        return new String[]{
                " ******  ",
                "**    ** ",
                "**       ",
                " ******  ",
                "       **",
                "**    ** ",
                " ******  "
        };
    }

    // Main Method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +   // First O
                    oPattern[i] + "  " +   // Second O
                    pPattern[i] + "  " +   // P
                    sPattern[i]            // S
            );
        }
    }
}