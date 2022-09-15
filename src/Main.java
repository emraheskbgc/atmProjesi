import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;
        int price;
        while (right >0){
            System.out.print("Kullanıcı Adını Giriniz = ");
            userName = input.nextLine();
            System.out.print("Parolanızı Giriniz = ");
            password = input.nextLine();
            if (userName.equals("emraheskbgc") && password.equals("367244")){
                System.out.println("Merhaba Eskibağcı Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                            "1-Para Yatırma\n"+
                            "2-Para Çekme \n"+
                            "3- Bakiye Sorgulama \n"+
                            "4-Çıkş");
                    System.out.print("Lütfen Bir Seçim Yapınız = ");
                    select = input.nextInt();
                    if (select==1){
                        System.out.print("Yatırılacak Para Miktarı = ");
                        price =input.nextInt();
                        balance +=price;

                    }else if (select==2){
                        System.out.print("Çekmek İstediğiniz Para Miktarı = ");
                        price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz .");
                        }else {
                            balance -= price;
                        }
                    }else if (select == 3){
                        System.out.println("Bakiyeniiz = "+ balance);
                    }


                }while (select !=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }else
            {
                right--;
                System.out.println("Hatalı Şifre Veya Kullanıcı Adı Girdiniz. Lütfen Tekrar Deneyiniz ." );

                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Bankamıza Müracaat Ediniz .");
                }else {
                    System.out.println("Kalan Hakkınız = "+ right);
                }
            }
        }

    }
}
