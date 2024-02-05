package kouka3;
import java.util.Scanner;
// Groupsクラス
// 各グループのページに分岐するクラス
public class Groups extends Star {
    // opencloseクラスのインスタンス化
    OpenClose openclose = new OpenClose();
    // dictionaryクラスのインスタンス化
    Dictionary dictionary = new Dictionary();
    // group_changeメソッド
    public void group_change(){
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // memberクラスのインスタンス化
        Member member = new Member();
        // メッセージ表示
        System.out.println("\n「所属グループ紹介」のページです。");
        System.out.println("1>>>超特急\n2>>>M!LK\n3>>>SUPER★DRAGON\n4>>>さくらしめじ\n5>>>ONE N' ONLY\n6>>>原因は自分にある。\n7>>>BUDDiiS\n8>>>ICEx\n9>>>Lienel");
        System.out.println("00>>>図鑑を閉じる");
        System.out.print("\nご覧になりたいグループのページに対応する数字を入力してください。>>>");
        // 入力された文字をmemuに代入
        int menu = stdIn.nextInt();

        // switchでページを分岐させる
        switch (menu) {
            case 1:         // eightメソッドを開く
                    System.out.println("超特急のページを開きます。");
                    member.eight();
                break;
            case 2:         // milkyメソッドを開く
                    System.out.println("M!LKのページを開きます。");
                    member.milky();
                break;
            case 3:         // blueメソッドを開く
                    System.out.println("SUPER★DRAGONのページを開きます。");
                    member.blue();
                break;
            case 4:         // kinokoメソッドを開く
                    System.out.println("さくらしめじのページを開きます。");
                    member.kinoko();
                break;
            case 5:         // swagメソッドを開く
                    System.out.println("ONE N' ONLYのページを開きます。");
                    member.swag();
                break;
            case 6:         // observerメソッドを開く
                    System.out.println("原因は自分にある。のページを開きます。");
                    member.observer();
                break;
            case 7:         // buddyメソッドを開く
                    System.out.println("BUDDiiSのページを開きます。");
                    member.buddy();
                break;
            case 8:         // coolerメソッドを開く
                    System.out.println("ICExのページを開きます。");
                    member.cooler();
                break;
            case 9:         // lienメソッドを開く
                    System.out.println("Lienelのページを開きます。");
                    member.lien();
                break;
            case 00:        // closeメソッドを開く
                    openclose.close();
                break;
            default:        // 該当するメニューが存在しないメッセージ
                    System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                break;
        }

    }
}
