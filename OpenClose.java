package kouka3;
// EbisuDanshiインターフェースを実装したOpenCloseクラス
public class OpenClose implements EbisuDanshi{
    // openメソッドをオーバーライド
    @Override
    public void open(){
        System.out.println("EBiDAN図鑑をお手に取っていただきありがとうございます！！！！！");
        System.out.println("\n・・・・・・・・・・・・・・・・・・・・・");
        System.out.println("\n・・・・・・・・・・・・・・・・・・・・・!(^^)!ｴﾋﾞﾀﾞﾝ");
    }
    // closeメソッドをオーバーライド
    @Override
    public void close(){
        System.out.println("\nEBiDAN図鑑を閉じます。");
        System.out.println("\n・・・・・・・・・・・・・・・・・・・・・(ノД`)・゜・。ﾏﾀｷﾃｸﾀﾞｻｲﾈ");
    }
}
