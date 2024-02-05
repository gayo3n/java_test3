package kouka3;

import java.util.InputMismatchException;
import java.util.Scanner;

// メインクラス
public class Dictionary extends OpenClose {

    public static void main(String[] args){
        
        // Groupsクラスのインスタンス化
        Groups groups = new Groups();
        // OpenCloseクラスのインスタンス化
        OpenClose openclose = new OpenClose();
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);

        // Openメソッド=>図鑑を開く！！！！
        openclose.open();

        System.out.println("-----------------------EBiDAN図鑑👨-----------------------");

        // while文を使って正しい入力がされない場合はループする。
        while (true) {
            System.out.println("----------目次----------");
            System.out.println("1>>>所属グループ紹介！！");
            System.out.println("00>>EBiDAN図鑑を閉じる");
            System.out.print("\nご覧になりたいメニューに対応する数字を入力してください。>>>");

            try {
                // メニューの番号を入力
                int menu = stdIn.nextInt();

                switch (menu) {
                    // case1所属グループの紹介ページを開く
                    case 1:
                        System.out.println("\n「所属グループ紹介！！」を開きます。");
                        // Groupsクラスのgroup_changeメソッドを開く
                        groups.group_change();
                        break;
                    case 00:
                        // opencloseクラスのcloseメソッドを開く
                        openclose.close();
                        break;
                    // デフォルトケースで指定外の数値のときメッセージを表示
                    default:
                        System.out.println("\n入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                        break;
                }
            } catch (InputMismatchException e) {
                // 数値以外が入力された場合の例外処理
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                stdIn.nextLine();       // 不正な入力をクリアする
            }
        }
    }

    
}
