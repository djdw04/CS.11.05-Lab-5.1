public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
;
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            total += array[i];
        }
        return total;
    }

    public static double average(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            total += array[i];
        }
        double unRounded = total / array.length;
        double roundedNumber = Math.floor(unRounded * 100.0) / 100.0;
        return roundedNumber;
    }

    public static int minimum(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int maximum(int[] array) {
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int length = array.length;
        int lastIndex = length - 1;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                    return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = array[i] * n;
        }
    }
    public static String toString(int[] array) {
        if (array.length == 0) {
            return "";
        }

        String result = String.valueOf(array[0]);

        for (int i = 1; i < array.length; i++) {
            result += ", " + array[i];
        }

        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void shiftRight(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int firstElement = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1) {
            return;
        }

        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[(i + n) % array.length] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1) {
            return;
        }

        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i - n) % array.length;
            if (newIndex < 0) {
                newIndex += array.length;
            }
            temp[newIndex] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }


}
