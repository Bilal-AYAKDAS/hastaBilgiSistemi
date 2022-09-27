package bilalAyakdas;

public class Doktor extends Kisi{

	private int diplomaNo;

    public Doktor(String isim, String TCKimlik, int diplomaNo) {
        super(isim,TCKimlik);
        this.diplomaNo=diplomaNo;
    }


    public int getDiplomaNo() {

        return diplomaNo;
    }
}
