import java.io.FileNotFoundException;

public abstract class Ayakkabi extends Kombin {
    public  String ustlukGetir(String renk){
        String[] ust = {"Gömlek","Tshirt","Sweat"};
        int randomSayi = (int)(Math.random()*3);
        String ustluk = okuRenkGetir(renk) +" " + ust[randomSayi];
        return ustluk;
    };
    public abstract String altlikGetir(String renk);
}
