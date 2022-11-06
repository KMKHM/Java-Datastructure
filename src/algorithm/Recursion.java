package algorithm;

public class Recursion {
    public static void main(String[] args) {
        int result = func("hello");
        System.out.println("result = " + result);
    }

    private static int func(String str) {
        if (str.equals("")) {
            return 0;
        }else {
            return 1 + func(str.substring(1));
        }
    }

    public static void printChars(String str) {
        if (str.length() == 0) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }

    }

    public void printIntBinary(int n) {
        if (n<2) {
            System.out.print(n);
        } else {
            printIntBinary(n/2);
            System.out.print(n%2);
        }
    }

    public static int sum(int n, int [] data) {
        if (n<=0) {
            return 0;
        } else {
            return sum(n-1, data) + data[n-1];
        }
    }

    int search(int [] data, int begin, int end, int target) {
       if (begin > end) {
           return -1;
       } else {
           int middle = (begin+end)/2;
           if (data[middle] == target) {
               return middle;
           }
           int index = search(data, begin, middle-1, target);
           if (index != -1) {
               return index;
           } else {
               return search(data,middle+1, end, target);
           }
       }
    }

    int findMax(int [] data, int begin, int end) {
        if (begin == end) {
            return data[begin];
        } else {
            int middle = (begin + end)/2;
            int max1 = findMax(data, begin, middle);
            int max2 = findMax(data,middle+1, end);
            return Math.max(max1, max2);
        }
    }

    int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin+end)/2;
            int compResult = target.compareTo(items[middle]);
            if (compResult==0) {
                return middle;
            } else if (compResult < 0) {
                return binarySearch(items, target, begin, middle-1);
            } else {
                return binarySearch(items, target, middle+1, end);
            }
        }
    }


}
