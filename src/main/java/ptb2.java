public class ptb2 {
    public static String PTB2(float a, float b, float c) {
        String ketqua = null;

        float delta;
        float x1;
        float x2;

        // kiểm tra hệ số
        if (a == 0) {
            return "Errors!!!";
        }

        // tính delta
        delta = b*b - 4*a*c;

        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "x1 = " + x1 + "; " + "x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "x1 = x2 = " + x1;
        } else {
            ketqua = "No results";
        }

        return ketqua;
    }

}

