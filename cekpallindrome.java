import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Kelas PalindromeChecker digunakan untuk memeriksa apakah suatu kata atau frasa merupakan palindrome.
 */
class PalindromeChecker {
    /**
     * Metode utama program untuk memeriksa apakah input adalah palindrome.
     *
     * @parm args Argumen baris perintah (tidak digunakan dalam metode ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Masukkan kata atau frasa: ");
        String inputString = input.nextLine();

        // Memeriksa apakah input adalah palindrome dan mencetak pesan yang sesuai
        if (isPalindrome(inputString)) {
            out.println(inputString + " adalah palindrome.");
        } else {
            out.println(inputString + " bukan palindrome.");
        }
    }

    /**
     * Memeriksa apakah suatu teks adalah palindrome.
     *
     * @param text Teks yang akan diperiksa.
     * @return Mengembalikan true jika teks adalah palindrome, dan false jika bukan.
     */
    public static boolean isPalindrome(String text) {
        // Menghapus karakter non-alphanumeric dan mengubah teks menjadi huruf kecil
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = text.length();

        // Memeriksa apakah teks adalah palindrome
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

