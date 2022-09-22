package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satis = 100;
        System.out.println(indirimliiFiyat(satis)); // 90
        System.out.println("satis fiyati : " + satis); // 100
        System.out.println(indirimliiFiyat(satis)); // 90
        System.out.println("satis fiyati : " + satis); // 100
        /*
        Iki farkli method'da satis isminde variable olabilir Java bua itiraz etmez
        Cunu scope'lari farklidir
         */
    }
    public static double indirimliiFiyat(double orjinalFiyat){
        /*
        metodumuz %10 indirim yapip yeni fiyyati main methoda dondursun
         */
/*
        yukarıdaki satisfiyati burada declare edilmis(main method'da), yukarısı ile burası aynı variable değildir.
        iste bu farklı satis fiyatlari icin java pass by value kullanıyor.
        java variable'ı buraya gecirmez, ama variable ın değerini gecirir,
        biz gözlerimizle satisFiyati görürüz ama java burada 100 görür.
        yani satisFiyatinin bir kopyasını gecirir diyebiliriz.
        bundan sonra bu scope'ta kullanacağımız değisiklikler benim main body'mde yazan değerimi değil
        buradaki değeri kullanir.
        buradaki satisFiyatinin adını xyz de yapabilirsin hangi isim oldugu hic bir önemi yok,
        farkli methodlara gidis yapıyor olsak bile aynı isimleri kullanırız ki karısıklık olmasın. tek amac budur
        ne yazarsanız yazın java sizin satisFiyati parametresi olustururken bunun değirini buraya gecirir
        ve siz arka arkaya isterseniz 5 kere indirim yapın her seferinde indirimliFiyat 90 yazar.
*/
        double satis = orjinalFiyat*0.9;
        return satis;
    }
}
