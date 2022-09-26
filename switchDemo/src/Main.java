public class Main {
    public static void main(String[] args) {


        //CTRL + SHIFT + ALT + L -- DÜZENLEME EDİTÖRÜ

        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel  : geçtiniz ");
                break;
            case 'B':
                System.out.println("ÇOK GÜZEL  : geçtiniz ");
                break;
            case 'C':
                System.out.println("iyi  : geçtiniz ");
                break;
            case 'D':
                System.out.println("fena Değil  : Geçtiniz ");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız ");
                break;
            default:
                System.out.println("Geçersiz not girsiniz ");
        }


    }
}