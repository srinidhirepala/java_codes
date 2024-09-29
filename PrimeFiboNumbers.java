5. Write a Java program to print all numbers below 100,000 that are both prime and Fibonacci number (some examples are 2, 3, 5, 13, etc.).


class PrimeFiboNumbers {
    public static void main(String s[]) {
        int max = 100000;
        boolean[] Prime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            Prime[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (Prime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    Prime[j] = false;
                }
            }
        }

        int[] fiboNum = new int[max];
        int index = 0;
        int a = 0, b = 1;
        while (b < max) {
            fiboNum[index++] = b;
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println("Prime Fibonacci numbers below 1 Lakh" + ":");
        for (int i = 0; i < index; i++) {
            if (Prime[fiboNum[i]]) {
                System.out.print(fiboNum[i] + " ");
            }
        }
    }
}