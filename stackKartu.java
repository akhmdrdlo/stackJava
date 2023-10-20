import java.util.Scanner;

public class stackKartu {
    private int batas;
    private String[] kartuStack;
    private int top;
    public static Scanner input = new Scanner(System.in);

    public stackKartu(int s) {
        batas = s;
        kartuStack = new String[batas];
        top = -1;
    }   
    public void push(String namaKartu) {
        kartuStack[++top] = namaKartu;
    }  
    public String pop() {
        return kartuStack[top--];
    } 
    public String peek() {
        return kartuStack[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == batas - 1);
    } 
    public static void main(String[] args) {
        System.out.println("Berapa kartu yang ingin ditumpuk?");
        int batas = input.nextInt();
        stackKartu kartu = new stackKartu(batas);
        input.nextLine();
        for (int i = 0; i < batas; i++) {
            System.out.print("Kartu ke-" + (i + 1) + " : ");
            String namaKartu = input.nextLine();
            kartu.push(namaKartu);
        }
        String atas = kartu.peek();
        System.out.println("Kartu yang paling atas : "+atas);
        while (!kartu.isEmpty()) {
            System.out.println("_________________________________");
            System.out.println("Daftar nama kartu yang ditumpuk (dari atas ke bawah)");
            String hasil = kartu.pop();
            System.out.println(hasil);
            System.out.print(" ");
        }
        input.close();
    }
}