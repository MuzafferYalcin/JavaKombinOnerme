import java.io.FileNotFoundException;

public class SporAyakkabi extends Ayakkabi{

    @Override
    public String altlikGetir(String renk){
        String[] altliklar = {"Pantolon","Eşofman"};
        int randomSayi = (int)(Math.random()*2);
        String alt = okuRenkGetir(renk)+" "+ altliklar[randomSayi];
        return alt;
    }

}
