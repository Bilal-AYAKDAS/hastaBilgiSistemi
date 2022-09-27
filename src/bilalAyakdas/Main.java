package bilalAyakdas;

public class Main {
	public static void main(String[] args) {

		BilgiSistemi bilgiSistemi=new BilgiSistemi();
        Hasta hasta1 = new Hasta("Ahmet","222",2000);
        Hasta hasta2 = new Hasta("Mehmet","333",1980);
        Doktor doktor1 = new Doktor("Mustafa","111",1990);
        Doktor doktor2 = new Doktor("Berke","444",1975);

        bilgiSistemi.doktorEkle(doktor1);
        bilgiSistemi.hastaEkle(hasta1);
        System.out.println(bilgiSistemi.doktorEkle(doktor1));
        System.out.println(bilgiSistemi.hastaEkle(hasta1));
        bilgiSistemi.doktorEkle(doktor2);
        bilgiSistemi.hastaEkle(hasta2);

        try {
            bilgiSistemi.doktorBul("555");
        }catch (KisiBulunamadiException exception){
            exception.printStackTrace();
        }

        try {
            bilgiSistemi.hastaBul("333");
        }catch (KisiBulunamadiException exception){
            exception.printStackTrace();
        }

        try {
            bilgiSistemi.tedaviEkle(hasta2,doktor1);
        }catch (KisiBulunamadiException exception){
            exception.printStackTrace();
        }


    }


}
