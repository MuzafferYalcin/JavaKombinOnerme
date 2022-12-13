import java.io.FileNotFoundException;

public class Pantolon extends Altlik{
    @Override
    public String ustlukGetir(String renk){
        String[] ustlukler = {"Gömlek","Sweat","Tshirt"};
        int randomSayi = (int)(Math.random()*3);
        return okuRenkGetir(renk) + " " + ustlukler[randomSayi];
    }

    @Override
    public String AyakkabiGetir(String renk){
        String[] ayakkabilar ={"Spor Ayakkabı","Casual Ayakkabı"};
        int randomSayi = (int)(Math.random()*2);
        return okuRenkGetir(renk) +" "+ ayakkabilar[randomSayi];
    }

}
