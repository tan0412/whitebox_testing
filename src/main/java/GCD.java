public class GCD {

    public static int gcd(int num1, int num2) {

            if (num1 == 0)
                    return num2;
            while (num2 != 0) {
                    if (num1 > num2)
                              num1 -= num2;
                   else
                        num2 -= num1;
                 }

            return num1;
         }
}
