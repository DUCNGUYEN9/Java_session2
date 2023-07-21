import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 số tối đa 3 chữ số:  ");
        int numbers = Integer.parseInt(scanner.nextLine());
        if (numbers > 999 || numbers < 0) {
            System.err.println("bạn đã nhập hơn 3 số hoặc số âm");
            System.exit(0);
        }
        int so_hang_tram = numbers / 100;
        int so_hang_chuc = (numbers / 10) % 10;
        int so_hang_don_vi = numbers % 10;
        String word = "";
        if (numbers < 10) {
            word = lay_chu_so(numbers, true);
        } else if (numbers < 16) {
            switch (numbers) {
                case 10:
                    word = "ten";
                    break;
                case 11:
                    word = "eleven";
                    break;
                case 12:
                    word = "twelve";
                    break;
                case 13:
                    word = "thirteen";
                    break;
                case 14:
                    word = "fourteen";
                    break;
                case 15:
                    word = "fifteen";
                    break;
            }
        } else if (numbers == 20) {
            word = "twenty";
        } else {
            String chu_hang_tram = so_hang_tram != 0 ? lay_chu_so(so_hang_tram, true) + " hundred" : "";
            String chu_hang_chuc = so_hang_chuc != 0 ? lay_chu_so(so_hang_chuc, false) + "ty" : "";
            String chu_hang_don_vi = so_hang_don_vi != 0 ? lay_chu_so(so_hang_don_vi, true) : "";
            word = chu_hang_tram + " " + chu_hang_chuc + " " + chu_hang_don_vi;
        }

        System.out.println(word);
    }
    public static String lay_chu_so(Integer number, Boolean is_don_vi) {
        String word;
        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = is_don_vi ? "two" : "twen";
                break;
            case 3:
                word = is_don_vi ? "three" : "thir";
                break;
            case 4:
                word = is_don_vi ? "four" : "for";
                break;
            case 5:
                word = is_don_vi ? "five" : "fif";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = is_don_vi ? "eight" : "eigh";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "out of ability";
                break;
        }

        return word;
    }
}
