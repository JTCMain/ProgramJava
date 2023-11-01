package javaapplication;

import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Operator Penugasan
        System.out.print("Masukkan angka pertama: ");
        int number1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int number2 = scanner.nextInt();
        int result;

        result = number1; // Operator Penugasan (=)
        System.out.println("Hasil operator penugasan (=): " + result);

        result += number2; // Operator Penugasan (+=)
        System.out.println("Hasil operator penugasan (+=): " + result);

        result -= number2; // Operator Penugasan (-=)
        System.out.println("Hasil operator penugasan (-=): " + result);

        result *= number2; // Operator Penugasan (*=)
        System.out.println("Hasil operator penugasan (*=): " + result);

        result /= number2; // Operator Penugasan (/=)
        System.out.println("Hasil operator penugasan (/=): " + result);

        result %= number2; // Operator Penugasan (%=)
        System.out.println("Hasil operator penugasan (%=): " + result);

        // Operator Pembanding
        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        boolean isEqual = (num1 == num2); // Operator Pembanding (==)
        System.out.println("Hasil operator pembanding (==): " + isEqual);

        boolean isNotEqual = (num1 != num2); // Operator Pembanding (!=)
        System.out.println("Hasil operator pembanding (!=): " + isNotEqual);

        boolean isGreaterThan = (num1 > num2); // Operator Pembanding (>)
        System.out.println("Hasil operator pembanding (>): " + isGreaterThan);

        boolean isLessThan = (num1 < num2); // Operator Pembanding (<)
        System.out.println("Hasil operator pembanding (<): " + isLessThan);

        // Operator Bitwise
        System.out.print("Masukkan angka pertama (integer): ");
        int operand1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua (integer): ");
        int operand2 = scanner.nextInt();

        int bitwiseAND = operand1 & operand2; // Operator Bitwise AND (&)
        System.out.println("Hasil operator bitwise AND (&): " + bitwiseAND);

        int bitwiseOR = operand1 | operand2; // Operator Bitwise OR (|)
        System.out.println("Hasil operator bitwise OR (|): " + bitwiseOR);

        int bitwiseXOR = operand1 ^ operand2; // Operator Bitwise XOR (^)
        System.out.println("Hasil operator bitwise XOR (^): " + bitwiseXOR);

        int bitwiseComplement1 = ~operand1; // Operator Bitwise NOT (~) pada operand1
        System.out.println("Hasil operator bitwise NOT (~) pada operand1: " + bitwiseComplement1);

        int bitwiseComplement2 = ~operand2; // Operator Bitwise NOT (~) pada operand2
        System.out.println("Hasil operator bitwise NOT (~) pada operand2: " + bitwiseComplement2);
    }
}

