import java.io.FileNotFoundException;

public class Sweat extends Ustluk{
    @Override
    public String altlikGetir(String renk){
        String[] altliklar = {"Pantolon","Esofman"};
        int randomSayi = (int)(Math.random()*2);
        return okuRenkGetir(renk) +" "+ altliklar[randomSayi];
    }




}
