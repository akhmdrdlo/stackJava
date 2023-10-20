
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackBuku {
    private static Stack<String> stack;
    private static int batas;

    public static void main(String[] args) throws IOException {
        System.out.println("Berapa banyak buku yang ingin disimpan?");
        batas = inputBuku();
        buatStack(batas);
        taruhBuku();
        lihatData();
    }

    public static void buatStack(int batas) {
        stack = new Stack<String>();
    }

    public static void taruhBuku() throws IOException {
        String data;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Saatnya menaruh buku!! ");
        for (int i = 0; i < batas; i++) {
            System.out.print("Buku ke-" + (i + 1) + " : ");
            data = br.readLine(); // Menggunakan nextLine() untuk membaca string
            stack.push(data);
            System.out.println("_______________________________");
        }
    }

    private static void lihatData() {
        System.out.println("_______________________________");
        System.out.println("Buku yang ditumpuk dari bawah ke atas : ");
        String dataBuku;
        for (int i = 0; i < batas; i++) {
            // Mengeluarkan elemen dari stack
            dataBuku = stack.pop();
            System.out.println("Judul Buku = " + dataBuku);
        }
    }

    private static int inputBuku() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = br.readLine();
        int data = Integer.parseInt(angkaInput);
        return data;
    }
}
