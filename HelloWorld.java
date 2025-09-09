public class HelloWOrld {

    public static boolean isPrime(int x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int number = 2;
        while (count <= n) {
            if (isPrime(number)) {
                if (count == n) {
                    return number;
                }
                count++;
            }
            number++;
        }
        return number - 1;
    }

    public static void main(String[] args) {
        int[] nValues = {0, 1, 2, 100, 200};
        int[] expected = {2, 3, 5, 547, 1229};

        for (int i = 0; i < nValues.length; i++) {
            int result = nthPrime(nValues[i]);
            if (result == expected[i]) {
                System.out.println("pass");
            } else {
                System.out.println("fail expected " + expected[i] + ", but value returned was " + result);
            }
        }
    }
}
