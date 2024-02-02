package kouka3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Member extends Star{

    Scanner stdIn = new Scanner(System.in);
    Groups groups = new Groups();

    // 超特急のメソッド
    @Override
    public void eight(){
        // 超特急のリストを作る
        List<Star> tyo_list = new ArrayList<>();
        // 追加する
        tyo_list.add(new Star("カイ" , "1994年9月27日", "神奈川県", "177cm", "2号車。EBiDAN最年長。メンバーカラー：青"));
        tyo_list.add(new Star("リョウガ", "1994年10月23日", "神奈川県", "177cm", "3号車。超特急のリーダー。メンバーカラー：紫"));
        tyo_list.add(new Star("タクヤ", "1994年11月24日", "東京都", "173cm", "4号車。ONE N' ONLYに実の弟（草川直哉）がいる。メンバーカラー：緑"));
        tyo_list.add(new Star("ユーキ", "1995年1月2日", "徳島県", "172cm", "5号車。超特急の前リーダー。メンバーカラー：赤"));
        tyo_list.add(new Star("タカシ", "1996年9月23日", "大阪府", "180cm", "7号車。本名は'太陽'と書いてタカシと読む。メンバーカラー：純白"));
        tyo_list.add(new Star("シューヤ", "1995年3月25日", "埼玉県", "172cm", "11号車。ハイトーンボイスがキレイ。メンバーカラー：チャコールグレー"));
        tyo_list.add(new Star("マサヒロ", "1998年9月15日", "山口県", "171cm", "12号車。女性みたいなキレイな顔立ちをしている。メンバーカラー：ブラウン"));
        tyo_list.add(new Star("アロハ", "2000年10月26日", "神奈川県", "173cm", "13号車。お母さんがハワイ好きでアロハになった。メンバーカラー：ターコイズブルー"));
        tyo_list.add(new Star("ハル", "2005年3月31日", "熊本県", "166cm", "14号車。超特急の最年少。メンバーカラー：オレンジ"));



        System.out.println("超特急のページです。");

        System.out.println("超特急は、2011年12月25日に結成された9人組ダンス＆ボーカルグループです。ファンの愛称は「8号車」。");
        System.out.println("1度ライブに行けば、カッコイイだけじゃない彼らのパフォーマンスにハマることでしょう。");

        System.out.println("2号車>>>カイ");
        System.out.println("3号車>>>リョウガ");
        System.out.println("4号車>>>タクヤ");
        System.out.println("5号車>>>ユーキ");
        System.out.println("7号車>>>タカシ");
        System.out.println("11号車>>>シューヤ");
        System.out.println("12号車>>>マサヒロ");
        System.out.println("13号車>>>アロハ");
        System.out.println("14号車>>>ハル");
        System.out.println("**00号車>>>所属グループ紹介のページに戻る**");

        System.out.print("詳細を見たいメンバーの号車番号を入力してください。>>>");
        int choice = stdIn.nextInt();

        switch (choice) {
            case 2:
                System.out.println(tyo_list.get(0));
                break;
            case 3:
                System.out.println(tyo_list.get(1));
                break;
            case 4:
                System.out.println(tyo_list.get(2));
                break;
            case 5:
                System.out.println(tyo_list.get(3));
                break;
            case 7:
                System.out.println(tyo_list.get(4));
                break;
            case 11:
                System.out.println(tyo_list.get(5));
                break;
            case 12:
                System.out.println(tyo_list.get(6));
                break;
            case 13:
                System.out.println(tyo_list.get(7));
                break;
            case 14:
                System.out.println(tyo_list.get(8));
                break;
            case 00:
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                break;
        }

    }

    @Override
    public void milky(){
        // MiLKのリストを作る
        List<Star> milk_list = new ArrayList<>();
        // 追加する
        milk_list.add(new Star("佐野勇人", "1998年3月23日", "愛知県", "179cm", "ドラマで活躍する俳優でもある。メンバーカラー：ピーチヒップピンク"));
        milk_list.add(new Star("塩﨑大智", "2000年9月11日", "和歌山県", "174㎝", "M!LKのバラエティ担当。メンバーカラー：サファイアブルー"));
        milk_list.add(new Star("曽野舜太", "2002年5月3日", "三重県", "182cm", "M!LKで一番頭が良い。メンバーカラー：ハッピーレッド"));
        milk_list.add(new Star("山中柔太郎", "2001年12月23日", "栃木県", "177cm", "M!LKで一番よくわからない男。メンバーカラー：クリスタルホワイト"));
        milk_list.add(new Star("吉田仁人", "1992年12月15日", "鹿児島県", "173cm", "M!LKのリーダー。メンバーカラー：きらめきイエロー"));
        

        System.out.println("M!LKのページです。");

        System.out.println("M!LK(みるく)は、2014年11月24日に結成された5人組ダンスボーカルグループです。ファンの愛称は「み！るきーず」。");
        System.out.println("YouTubeに投稿されている動画を見れば、彼らのおもしろい一面も見ることができます。");

        System.out.println("1>>>佐野勇人");
        System.out.println("2>>>塩﨑大智");
        System.out.println("3>>>曽野舜太");
        System.out.println("4>>>山中柔太郎");
        System.out.println("5>>>吉田仁人");

        System.out.println("**00>>>所属グループ紹介のページに戻る**");

        System.out.print("詳細を見たいメンバーのメニュー番号を入力してください。>>>");

        int choice = stdIn.nextInt();
        

        switch (choice) {
            case 1:
                System.out.println(milk_list.get(0));
                break;
            case 2:
                System.out.println(milk_list.get(1));
                break;
            case 3:
                System.out.println(milk_list.get(2));
                break;
            case 4:
                System.out.println(milk_list.get(3));
                break;
            case 5:
                System.out.println(milk_list.get(4));
                break;
            case 00:
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                break;
        }
    
    }

    @Override
    public void blue(){

        List<Star> sup_list = new ArrayList<>();

        sup_list.add(new Star("志村玲於", "1999年1月29日", "東京都", "164.5cm", "趣味はアニメ鑑賞と紅茶を飲むこと。担当もダンス。ユニット：ファイヤードラゴン"));
        sup_list.add(new Star("古川毅", "2000年2月27日", "東京都", "182cm", "生まれは北海道札幌市。ユニット：ファイヤードラゴン"));
        sup_list.add(new Star("ジャン海渡", "2000年5月4日", "東京都", "181cm", "トルコと日本のハーフ。ユニット：ファイヤードラゴン"));
        sup_list.add(new Star("飯島颯", "2001年10月12日", "東京都", "182.2cm", "3年間ニューヨークに住んでいた帰国子女。ユニット：ファイヤードラゴン"));
        sup_list.add(new Star("伊藤壮吾", "2003年2月17日", "千葉県", "171cm", "乗るのも撮るのも時刻表も大好きな鉄道オタク。ユニット：サンダードラゴン"));
        sup_list.add(new Star("田中洸希", "2003年2月27日", "東京都", "173cm", "ビートボックスが得意。ユニット：サンダードラゴン"));
        sup_list.add(new Star("池田彪馬", "2003年6月2日", "北海道", "180cm", "現役の慶応大学生。ユニット：サンダードラゴン"));
        sup_list.add(new Star("松村和哉", "2004年4月15日", "長野県", "171cm", "ファンサービスがすごい。ユニット：サンダードラゴン"));
        sup_list.add(new Star("柴崎楽", "2004年4月28日", "千葉県", "178cm", "スパドラの最年少。肉が嫌い。ユニット：サンダードラゴン"));



        System.out.println("SUPER★DRAGONのページです。");

        System.out.println("SUPER★DRAGONは2015年9月27日に結成された9人組ダンス＆ボーカルグループです。ファンの愛称は「BLUE」。");
        System.out.println("年上の4人で構成された「ファイヤードラゴン」と年下5人で構成された「サンダードラゴン」に分かれて活動することもあります。");

        System.out.println("1>>>志村玲於");
        System.out.println("2>>>古川毅");
        System.out.println("3>>>ジャン海渡");
        System.out.println("4>>>飯島颯");
        System.out.println("5>>>伊藤壮吾");
        System.out.println("6>>>田中洸希");
        System.out.println("7>>>池田彪馬");
        System.out.println("8>>>松村和哉");
        System.out.println("9>>>柴崎楽");
  
        System.out.println("**00>>>所属グループ紹介のページに戻る**");

        System.out.print("詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        int choice = stdIn.nextInt();

        
        switch (choice) {
            case 1:
                System.out.println(sup_list.get(0));
                break;
            case 2:
                System.out.println(sup_list.get(1));
                break;
            case 3:
                System.out.println(sup_list.get(2));
                break;
            case 4:
                System.out.println(sup_list.get(3));
                break;
            case 5:
                System.out.println(sup_list.get(4));
                break;
            case 6:
                System.out.println(sup_list.get(5));
                break;
            case 7:
                System.out.println(sup_list.get(6));
                break;
            case 8:
                System.out.println(sup_list.get(7));
                break;
            case 9:
                System.out.println(sup_list.get(8));
                break;
            case 00:
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                break;
        }
    }
    @Override
    public void kinoko(){

        List<Star> sakura_list = new ArrayList<>();

        System.out.println("さくらしめじは、田中雅功と髙田彪我で結成されたフォークデュオです。ファンの愛称は「きのこりあん」");
        System.out.println("2014年6月14日、TOKYO MXにて放送されたバラエティ番組『EBiDAN』にて、“ガク＆ヒョウガ”名義で結成されました。その後、グループ名を「さくらしめじ」に変更。");

    }
    
}


