import java.util.Scanner;

public class Game {

    public Player player;
    public Location location;

    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oynuna Hoşgeldiniz! ");
        System.out.print("Lütfen bir isim giriniz: ");
        String palyerName = scanner.nextLine();
        Player player = new Player(palyerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !! Burada yaşananların hepsi gerçek!! ");
        System.out.println("Lütfen bir karakter seçiniz: ");
        System.out.println("------------------------------------------------------------------");

        player.selectChar();


        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("######## BÖLGELER #######");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur! ");
            System.out.println("2 - Mağaza --> Silah veya Zırh satın alabilirsiniz !");
            System.out.println("3 - Mağara --> Ödül <Yemek>, Dikkatli ol karşına zombi çıkabilir !");
            System.out.println("4 - Orman --> Ödül <Odun>, Dikkatli ol karşına vampir çıkabilir !");
            System.out.println("5 - Nehir --> Ödül <Su>, Dikkatli ol karşına ayı çıkabilir !");

            System.out.println("0 - Çıkış Yap --> Oyunu Sonlandır. ");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz!!");
            }
            if(location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin..");
                break;
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }
        }
    }


}
