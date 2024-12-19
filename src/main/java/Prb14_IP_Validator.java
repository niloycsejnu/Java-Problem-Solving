public class Prb14_IP_Validator {
    public static void main(String[] args) {
        checkAndPrintIPValidity("192.168.0.1");
        checkAndPrintIPValidity("172.16.56");
        checkAndPrintIPValidity("0.0.0.1");
        checkAndPrintIPValidity("1.12.72.2");
    }

    public static void checkAndPrintIPValidity(String ip){
        String[] segments = ip.split("\\.");
        if (segments.length != 4) {
            System.out.println(ip + " - Invalid IP");
            return;
        }
        if (!isValidFirstSegment(segments[0])) {
            System.out.println(ip + " - Invalid IP");
            return;
        }
        for (int i = 1; i < segments.length; i++) {
            int num = Integer.parseInt(segments[i]);
            if (num < 0 || num > 255) {
                System.out.println(ip + " - Invalid IP");
                return;
            }
        }
        System.out.println(ip + " - Valid IP");
    }

    private static boolean isValidFirstSegment(String segment) {
        if (segment.length() == 1 || segment.startsWith("0")) {
            return false;
        }
        try {
            int num = Integer.parseInt(segment);
            return num >= 10 && num <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
