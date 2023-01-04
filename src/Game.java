import java.util.Scanner;

public class Game {

    public Player player;
    public Location location;

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oynuna Hoşgeldiniz! ");
        System.out.print("Lütfen bir isim giriniz: ");
        String palyerName = scanner.nextLine();
        Player player = new Player(palyerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !! Burada yaşananların hepsi gerçek!! ");
        System.out.println("Lütfen bir karakter seçiniz: ");
        System.out.println("------------------------------------------------------------------");

        player.selectChar();

        Location location = null;
        while (true) {
            if (player.getInventory().getItemlist().size() == 3) {
                System.out.println("Tebriklerrr Tüm Eşyaları Topladınız, Oyunu Kazandınız !");
                break;

            } else {
                player.printInfo();
                System.out.println();
                System.out.println("######## BÖLGELER #######");
                System.out.println();
                System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur! ");
                System.out.println("2 - Mağaza --> Silah veya Zırh satın alabilirsiniz !");
                System.out.println("3 - Mağara --> Ödül <Yemek>, Dikkatli ol karşına zombi çıkabilir !");
                System.out.println("4 - Orman --> Ödül <Odun>, Dikkatli ol karşına vampir çıkabilir !");
                System.out.println("5 - Nehir --> Ödül <Su>, Dikkatli ol karşına ayı çıkabilir !");
                System.out.println("6 - Maden --> Ödül <Para, Silah veya Zırh>, Dikkatli ol karşına yılan çıkabilir !");

                System.out.println("0 - Çıkış Yap --> Oyunu Sonlandır. ");
                System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
                int selectLoc = scanner.nextInt();
                switch (selectLoc) {
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
                        boolean enter = true;
                        for (Item a : player.getInventory().getItemlist()) {
                            if (a.getName().equals("Yemek")) {
                                System.out.println("Mağara bölgesindeki eşyayı aldınız !");
                                System.out.println("Bu bölgeye tekrar giremezsiniz");
                                enter = false;
                                break;
                            }
                        }
                        if (enter) {
                            location = new Cave(player);
                            break;
                        } else {
                            location = new SafeHouse(player);
                            break;
                        }

                    case 4:
                        boolean enter2 = true;
                        for (Item a : player.getInventory().getItemlist()) {
                            if (a.getName().equals("Odun")) {
                                System.out.println("Orman bölgesindeki esyayi aldiniz ! Bu bölgeye tekrar giremezsiniz !");
                                enter2 = false;
                                break;
                            }
                        }
                        if (enter2) {
                            location = new Forest(player);
                            break;
                        } else {
                            location = new SafeHouse(player);
                            break;
                        }
                    case 5:
                        boolean enter3 = true;
                        for (Item a : player.getInventory().getItemlist()) {
                            if (a.getName().equals("Su")) {
                                System.out.println("Nehir bölgesindeki esyayi aldiniz ! Bu bölgeye tekrar giremezsiniz !");
                                enter3 = false;
                                break;
                            }
                        }
                        if (enter3) {
                            location = new River(player);
                            break;
                        } else {
                            location = new SafeHouse(player);
                            break;
                        }
                    case 6:
                        location = new Mine(player);
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir bölge giriniz!!");
                        location = new SafeHouse(player);
                }
                if (location == null) {
                    System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin..");
                    break;
                }
                if (!location.onLocation()) {
                    System.out.println("GAME OVER!");
                    break;
                }
            }
        }

    }
}
