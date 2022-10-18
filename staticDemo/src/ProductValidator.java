public class ProductValidator {

    static {   //Birden fazla operasyon yapılacaksa birden fazla static oluşturulabilir.
        System.out.println("Static yapıcı blok çalıştı.");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı.");
    }

    //Bir ürünü kaydederken veya güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanılır.
    public static boolean isValid(Product product) {
        if (product.price>0 && !product.name.isEmpty()) {    //empty değilse
            return true;
        }else {
            return false;
            }
        }

    public void bisey() {

    }

    //inner class (Ana classta static kullanılmaz ancak inner classlarda kullanılabilir.)
    public static class BaskaBirClass{
        public static void Sil () {

        }
    }
}

