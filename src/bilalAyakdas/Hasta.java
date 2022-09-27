package bilalAyakdas;

public class Hasta extends Kisi{
	 private int dogumYili;

	    public Hasta(String isim, String TCKimlik, int dogumYili) {
	        super(isim,TCKimlik);
	        this.dogumYili=dogumYili;
	    }



	    public int getDogumYili() {

	        return dogumYili;
	    }
}
