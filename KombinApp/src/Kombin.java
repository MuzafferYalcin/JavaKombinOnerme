import java.util.Random;

public class Kombin {
    public String okuRenkGetir(String renk){
        String[] Beyaz = {"Siyah","Kahverengi","Gri","Haki","Lacivert"};
        String[] Siyah = {"Beyaz","Gri","Hardal","Siyah","Krem"};
        String[] Lacivert= {"Kırmızı","Sarı","Krem","Beyaz","Gri"};
        String[] Kahverengi = {"Turkuaz","Krem","Pembe","Yeşil","Bej"};
        String[] Gri = {"Fuşya","Pembe","Mavi","Ultraviyole","Beyaz"};
        String[] Haki = {"Altın Kahverengi","Sarı","Kahverengi","Siyah","Krem"};
        String[] Bordo = {"Toprak","Beyaz","siyah","Krem","Kahverengi"};
        String[] Krem = {"Siyah","Lacivert","Kahverengi","Haki","Bordo"};
        String[] Hardal = {"Siyah","Yeşil","Gri","Pudra","Beyaz"};
        Random random = new Random();
        int rastsay = random.nextInt(5);

        if (renk == "Beyaz")
            return Beyaz[rastsay];
        else if (renk == "Siyah")
            return Siyah[rastsay];
        else if (renk == "Lacivert")
            return Lacivert[rastsay];
        else if(renk == "Kahverengi")
            return Kahverengi[rastsay];
        else if(renk == "Gri")
            return Gri[rastsay];
        else if(renk == "Haki")
            return Haki[rastsay];
        else if( renk == "Bordo")
            return Bordo[rastsay];
        else if( renk == "Krem")
            return Krem[rastsay];
        else if(renk == "Hardal")
            return Hardal[rastsay];
        else
            return "siyah";
    }

    public String aksesuarGetir(){
        String[] aksesuarlar = {"Kolye","Saat", "Bileklik"};
        int randomSayi = (int)(Math.random()*3);
        String aksesuar = aksesuarlar[randomSayi];
        return aksesuar;
    }
}
