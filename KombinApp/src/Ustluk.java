import java.io.FileNotFoundException;

public abstract class Ustluk extends Kombin {
    public abstract String altlikGetir(String renk);

    public String ayakkabiGetir(String renk){
        String[] ayakkabilar = {"Casual Ayakkabı", "Spor Ayakkabı"};
        int randomSayi = (int) (Math.random() * 2);
        return okuRenkGetir(renk) +" "+  ayakkabilar[randomSayi];
    }

    ;
}
