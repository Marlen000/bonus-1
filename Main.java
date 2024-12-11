import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество сдвигов: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        CaesarCipher cipher = new CaesarCipher(shift);

        System.out.print("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        String encrypted = cipher.encrypt(text);
        System.out.println("Зашифрованный текст: " + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Расшифрованный текст: " + decrypted);
    }
}

