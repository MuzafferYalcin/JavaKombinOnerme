import java.io.FileNotFoundException;
import java.util.List;

public class CasualAyakkabi extends Ayakkabi {


    @Override
    public String altlikGetir(String renk){
        String alt = okuRenkGetir(renk)+ " Pantolon";
        return alt;
    }

}
