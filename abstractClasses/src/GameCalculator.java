public abstract class GameCalculator {
    public abstract void hesapla();  //inherit eden her class kendi içerisinde fonsiyon yazmalı

    public final void gameOver() {  //inherit eden classlar override edemez.
        System.out.println("Oyun bitti.");
    }
}
