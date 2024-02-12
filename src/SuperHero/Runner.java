package SuperHero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.

        Collections.addAll(allHeroes,"Superman","SpiderMan","Wolverine","WonderWoman","Batman");

        Scanner scanner=new Scanner(System.in);
////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun
        //      "Süper Kahramanlar gösterisine hoş geldiniz..."
        //      "Mevcut Süper Kahramanlar: " + allHeroes
        //       "Çıkmak için q'ya basın...

        while (true) {
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz? ");
            String selection = scanner.nextLine();
            if (selection.equalsIgnoreCase("q")) {
                System.out.println("Süper kahraman dünyasından çıkış yaptınız. Görüşmek üzere...");
                break;}
            else if (allHeroes.contains(selection) && !activeHeroes.contains(selection)) {
                HeroFactory factory = new HeroFactory();

                SuperHeroes superhero = factory.produceSuperHero(selection);
                ////////////////////////////////////////////////////////////////////////////////////
                // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin

                //TODO: Eğer girilen isim allHeros listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
                // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

                //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

                //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

                //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...
                if (superhero != null) {
                    superhero.printInfo();
                    superhero.attack();
                    superhero.exposeSecretPower();

                    activeHeroes.add(selection);
                    System.out.println(selection + " oyuna başarıyla eklendi!");
                    System.out.println("Oyunda Aktif Kahramanlar: " + activeHeroes);
                    System.out.println("Henüz Eklenmemiş Kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));
                } else {
                    System.out.println("Lütfen geçerli bir süper kahraman girin...");
                }
            } else if (activeHeroes.contains(selection)) {
                System.out.println(selection + " zaten oyunda aktif!");
                System.out.println("Oyunda Aktif Kahramanlar: " + activeHeroes);
                System.out.println("Henüz Eklenmemiş Kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));
            } else {
                System.out.println("Lütfen geçerli bir süper kahraman girin...");
            }
        }
    }

    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
