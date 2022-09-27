package bilalAyakdas;
import java.util.ArrayList;
import java.util.List;

public class BilgiSistemi {
	


	public static List<Doktor> doktorlar = new ArrayList<Doktor>();
    public static List<Hasta> hastalar = new ArrayList<Hasta>();

    public BilgiSistemi() {

    }

    public boolean hastaEkle(Hasta hasta) {
        if (hastalar.contains(hasta)) {
            return false;
        } else {
            hastalar.add(hasta);
            return true;
        }

    }

    public boolean doktorEkle(Doktor doktor) {
        if (doktorlar.contains(doktor)) {
            return false;
        } else {
            doktorlar.add(doktor);
            return true;
        }

    }

    public void tedaviEkle(Hasta hasta, Doktor doktor) throws KisiBulunamadiException {
        if (hastalar.contains(hasta) && doktorlar.contains(doktor)) {
            System.out.println("Kisi bulundu.");


        } else {

            throw new KisiBulunamadiException();
        }
    }


    public void hastaBul(String TCKimlik) throws KisiBulunamadiException {
        boolean b = false;
        for (Hasta search : hastalar) {
            if (search.getTCKimlik().contains(TCKimlik)) {
                System.out.println("Hasta bulundu");
                b = true;
            }
        }
        if (b == false) {
            throw new KisiBulunamadiException();

        }
    }

    public void doktorBul(String TCKimlik) throws KisiBulunamadiException {
        boolean b = false;
        for (Doktor search : doktorlar) {
            if (search.getTCKimlik().contains(TCKimlik)) {
                System.out.println("Doktor  bulundu");
                b = true;
            }
        }
        if (b == false) {
            throw new KisiBulunamadiException();
        }
    }
	}


