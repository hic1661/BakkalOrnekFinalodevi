import java.util.Scanner;//Klavyeden girdi aldık
enum MListe {
   SU(2),ÇİKOLATA(2),CAY(20),PİRİNÇ(15);//market ürünlerini ve fiyatlarını tanımladık
    public int fiyat;
   MListe(int fiyat)
    {
        this.fiyat=fiyat;//Ürün fiyatlarını tanımladık
    }}
public class BakkalOrnek {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
       float adet1,adet2,adet3,adet4,vtutar;//alınıcak ürünlerin adetleri
       System.out.print("Su adetini girin: ");
       adet1 =girdi.nextFloat();//klavyeden su adetini aldık ve adet1 e atadık
       System.out.print("Çikolata adetini girin:");
       adet2=girdi.nextFloat();//klavyeden çikolataadetini aldık ve adet2 e atadık
        System.out.print("Çay adetini girin: ");
       adet3 =girdi.nextFloat();//klavyeden Çay adetini aldık ve adet3 e atadık
       System.out.print("Pirinç adetini girin:");
       adet4=girdi.nextFloat();//klavyeden prinç adetini aldık ve adet4 e atadık
        System.out.print("Markete verilen para miktarı:");
        vtutar=girdi.nextFloat();//Markete verilen parayı vtutar a tanımladık
       float fatura;
       
       fatura=(MListe.SU.fiyat*adet1)+(MListe.ÇİKOLATA.fiyat*adet2)
               +(MListe.CAY.fiyat*adet3)+(MListe.PİRİNÇ.fiyat*adet4);//alışverş tutarını hesapladık
       
       System.out.println("Fatura fiyatı   :"+fatura);
       System.out.println("Verilen mikatar :"+vtutar);
       System.out.println("Para üstü       :"+(vtutar-fatura));
        
    }}