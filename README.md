# hastaBilgiSistemi
hasta ve doktordan oluşan hasta bilgi sistemi

**Kisi sınıfı:**<br />
İlk olarak abstract Kisi sınıfında  private olarak TcKimlik ve isim 
değişkenleri,parametreleri TC Kimlik ve isim olan Kisi 
constractarı kodlandı ,TcKimlik ve isim değişkenlerine diğer 
sınıflardan erişmek için getter methodları kodlandı .<br />
**Hasta sınıfı:**<br />
Hasta sınıfı Kisi sınıfını extend ederek.Kisi sınıfındaki 
değişkenleri ve methodları miras aldı .Kisi sınıfından farklı 
olarak dogumYili değişkeni kodlandı .Parametreleri isim 
,TCKimlik ve dogumYili olan Hasta constractarı kodlandı 
.Constractırın kisi sınıfındaki değişkenlere erişmesi için içine 
isim ve TCKimlik parametreleri alan super methodu 
kodlandı.dogumYili değişkenine diğer sınıflardan erişmek için 
getter methodu kodlandı.<br />
**Doktor sınıfı:**<br />
Doktor sınıfı Kisi sınıfını extend ederek.Kisi sınıfındaki 
değişkenleri ve methodları miras aldı .Kisi sınıfından farklı 
olarak diplomaNo değişkeni kodlandı .Parametreleri isim 
,TCKimlik ve diplomaNo olan Doktor constractarı kodlandı 
.Constractırın Kisi sınıfındaki değişkenlere erişmesi için içine 
isim ve TCKimlik parametreleri alan super methodu 
kodlandı.diplomaNo değişkenine diğer sınıflardan erişmek 
için getter methodu kodlandı.<br />
**KisiBulunamadiException Sınıfı:**<br />
KisiBulunamadiException sınıfı java.io.IOException 
sınıfını extend eder.Exception fırlatıldığı zaman exception Kisi 
Bulunamadığı içinse hata verip hatanın Kişi bulunamadığı için 
olduğunu göstermektir .<br />
**Tedavi Sınıfı:**<br />
İlk olarak Tedavi sınıfında gerektiğinde Tedavi sınıfından 
Hasta ve Doktor sınıflarına erişmek için private olarak Hasta 
ve Doktor sınıfı türünden iki değiken oluşturuldu .Ek olarak 
ayrintilar değişkeni oluşturldu .Parametreleri hasta ve doktor olan Tedavi 
constractarı kodlandı ,doktor ,hasta ayrintilar 
değişkenlerine diğer sınıflardan erişmek için getter 
methodları kodlandı .ayrintilar değişkenine diğer sınıflardan 
veri girişi yapmak için setter methodu kodalandı.<br />
**BilgiSistemi Sınıfı:**<br />
İlk olarak oluşturduğumuz Doktor Hasta ve Tedavi 
değişkenlerini bir yere kaydetmek ve ihtiyacımız olduğunda 
kolay bir şekilde ulaşmak için Doktor sınıfı türünden 
doktorlar,Hasta sınıfı türünden hastalar Tedavi sınıfı türünden 
tedaviler olarak üç tane arraylist oluşturuldu .
 parametresi hasta olan boolean hastaEkle methodu,parametresi doktor olan boolean 
doktorEkle methodu oluşturuldu bu methodlar içine 
gönderilen hasta veya doktor nesnesini ilk olarak araylistlerin
içine olup olmadığını kontrol ediyor varsa false döndürüyor 
eğer yoksa ilgili arraylistin içine ekleyip true döndürüyor. 
parametresi hasta ve doktor olan tedaviEkle methodu oluşturldu bu methodun 
içine parametre olarak gönderilen doktor ve hasta nesneleri 
bulunursa Kisi bulundu diye ekrana çıktı verip gönderilen 
hasta ve doktor nesnelerini kullnarak Tedavi sınıfı türünden 
tedavi nesnesi oluşturuyor ve oluşturduğu nesneyi tedaviler 
arraylistine ekliyor.Eğer parametre olarak gönderilen doktor 
ve hasta doktorlar ve hastalar arraylistine kayıtlı değil ise 
KisiBulunamadiException fırlatıyor.
hastaBul ve doktorBul methodları kendilerine 
parametre olarak gönderilen TcKimlik değişkeniyle arrayliste 
doktorun veya hastanın olup olmadığını kontrol ediyor varsa 
ekrana Kisi bulundu çıktısı veriyor yoksa KisiBulunmadi 
exception fırlatıyor.<br />
**Main Sınıfı:**<br />
BilgiSistemi sınıfındaki fonksiyonları kullanabilmek için ilk 
olarak Bilgisistemi sınıfından bir nesne oluşturuyoruz.
Hastan sınıfından ve Doktor sınıfından 3 tane nesne 
oluşturuyoruz.Oluşturduğum hastaları ve doktorları 
BilgiSistemindeki doktorEkle ve hastaEkle metodlarına 
parametre olarak yolluyoruz kayıtlı olan hastayı ve doktoru 
tekrar yollarsak şekilde görüldüğü gibi false döndürüyor.
doktorBul ,hastabul ve tedaviEkle methodları exception 
fırlatacağı için try – catch içine yazılır .Eğer Tckimlik 
numarasından aranan hasta ,doktor bulunursa ekrana Hasta 
bulunu veya doktor bulundu yazar.Eğer aranan hasta hastalar araylistinde yoksa veya 
doktor doktorlar araylistinde yoksa KisiBulunamadiException 
fırlatır 
tekrar yollarsak şekilde görüldüğü gibi false döndürüyor.
