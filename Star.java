package kouka3;
// Starクラス
// 基本プロフィール＆紹介
public class Star {
    // 基本プロフィールのプロパティを作成
    // 名前
    private String name;
    // 誕生日
    private String birthday;
    // 出身地
    private String born;
    // 身長
    private String height;
    // 補足
    private String memo;

    // コンストラクタ
    public Star(String name, String birthday, String born, String height, String memo) {
        this.name = name;
        this.birthday = birthday;
        this.born = born;
        this.height = height;
        this.memo = memo;
    }
    // デフォルトコンストラクタ
    public Star(){

    }

    // toStringメソッドをoverrideして、ArrayListのメンバー詳細を表示させる
    @Override
    public String toString(){
        return "名前：" + this.name + "\n生年月日：" + this.birthday + "\n出身地：" + this.born + "\n身長：" + this.height + "\n補足：" + this.memo;
    }
    // 超特急の紹介メソッド
    public void eight(){
        System.out.println("超特急のページです。");
    }
    // MILKの紹介メソッド
    public void milky(){
        System.out.println("M!LKのページです。");
    }
    // SUPER　DRAGONの紹介メソッド
    public void blue(){
        System.out.println("SUPER★DRAGONのページです。");
    }
    // さくらしめじ紹介のメソッド
    public void kinoko(){
        System.out.println("さくらしめじのページです。");
    }
    // ONE N' ONLYの紹介メソッド
    public void swag(){
        System.out.println("ONE N' ONLYのページです。");
    }
    // 原因は自分にある。の紹介メソッド
    public void observer(){
        System.out.println("原因は自分にある。のページです。");
    }
    // BUDDiiSの紹介メソッド
    public void buddy(){
        System.out.println("BUDDiiSのページです。");
    }
    // ICExの紹介メソッド
    public void cooler(){
        System.out.println("ICExのページです。");
    }
    // Lienelの紹介メソッド
    public void lien(){
        System.out.println("Lienelのページです。");

    }
}
