import java.io.FileNotFoundException;

public class Gomlek extends Ustluk {

    @Override
    public String altlikGetir(String renk){

        return okuRenkGetir(renk) + " Pantolon";
    }


}