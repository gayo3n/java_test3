package kouka3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;
// Starクラスを継承したMemberクラスを作成
public class Member extends Star{
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // Groupsクラスのインスタンス化
    Groups groups = new Groups();
    // OpenCloseクラスのインスタンス化
    OpenClose openclose = new OpenClose();

    // 超特急のメソッドをオーバーライドする
    @Override
    public void eight(){
        // 超特急のリストを作る
        List<Star> tyo_list = new ArrayList<>();
        // メンバー9人をtyo_listに追加する
        tyo_list.add(new Star("カイ" , "1994年9月27日", "神奈川県", "177cm", "2号車。EBiDAN最年長。\nメンバーカラー：青"));
        tyo_list.add(new Star("リョウガ", "1994年10月23日", "神奈川県", "177cm", "3号車。超特急のリーダー。\nメンバーカラー：紫"));
        tyo_list.add(new Star("タクヤ", "1994年11月24日", "東京都", "173cm", "4号車。ONE N' ONLYに実の弟（草川直弥）がいる。\nメンバーカラー：緑"));
        tyo_list.add(new Star("ユーキ", "1995年1月2日", "徳島県", "172cm", "5号車。超特急の前リーダー。\nメンバーカラー：赤"));
        tyo_list.add(new Star("タカシ", "1996年9月23日", "大阪府", "180cm", "7号車。本名は'太陽'と書いてタカシと読む。\nメンバーカラー：純白"));
        tyo_list.add(new Star("シューヤ", "1995年3月25日", "埼玉県", "172cm", "11号車。ハイトーンボイスがキレイ。\nメンバーカラー：チャコールグレー"));
        tyo_list.add(new Star("マサヒロ", "1998年9月15日", "山口県", "171cm", "12号車。女性みたいなキレイな顔立ちをしている。\nメンバーカラー：ブラウン"));
        tyo_list.add(new Star("アロハ", "2000年10月26日", "神奈川県", "173cm", "13号車。特技は横跳び。\nメンバーカラー：ターコイズブルー"));
        tyo_list.add(new Star("ハル", "2005年3月31日", "熊本県", "166cm", "14号車。笑顔が可愛らしい超特急の最年少。\nメンバーカラー：オレンジ"));

        // 超特急のページであるメッセージの表示
        System.out.println("\n超特急(ﾁｮｳﾄｯｷｭｳ)のページです。");
        // 超特急の紹介メッセージ
        System.out.println("超特急は、2011年12月25日に結成された9人組ダンス＆ボーカルグループです。ファンの愛称は「8号車」。");
        System.out.println("1度ライブに行けば、カッコイイだけじゃない彼らのパフォーマンスにハマることでしょう。\n");
        // メンバーの分岐メッセージ
        System.out.println("2号車>>>カイ");
        System.out.println("3号車>>>リョウガ");
        System.out.println("4号車>>>タクヤ");
        System.out.println("5号車>>>ユーキ");
        System.out.println("7号車>>>タカシ");
        System.out.println("11号車>>>シューヤ");
        System.out.println("12号車>>>マサヒロ");
        System.out.println("13号車>>>アロハ");
        System.out.println("14号車>>>ハル");
        System.out.println("**00>>>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーの号車番号を入力してください。>>>");
        // 入力された数値をchoiceに代入
        int choice = stdIn.nextInt();
        // switch文で入力された数値に対するメンバーの情報の表示
        switch (choice) {
            case 2:         // カイの情報表示
                System.out.println(tyo_list.get(0));
                break;
            case 3:         // リョウガの情報表示
                System.out.println(tyo_list.get(1));
                break;
            case 4:         // タクヤの情報表示
                System.out.println(tyo_list.get(2));
                break;
            case 5:         // ユーキの情報表示
                System.out.println(tyo_list.get(3));
                break;
            case 7:         // タカシの情報表示
                System.out.println(tyo_list.get(4));
                break;
            case 11:        // シューヤの情報表示
                System.out.println(tyo_list.get(5));
                break;
            case 12:        // マサヒロの情報表示
                System.out.println(tyo_list.get(6));
                break;
            case 13:        // アロハの情報表示
                System.out.println(tyo_list.get(7));
                break;
            case 14:        // ハルの情報表示
                System.out.println(tyo_list.get(8));
                break;
            case 00:        // 00が入力された場合、所属グループ紹介ページ(group_changeメソッド)を呼び出す
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合eightメソッドを呼び出す
                System.out.println("\n入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                eight();
                break;
        }

    }
    // MILKのメソッドをオーバーライド
    @Override
    public void milky(){
        // MiLKのリストを作る
        List<Star> milk_list = new ArrayList<>();
        // メンバー5人をmilk_listに追加する
        milk_list.add(new Star("佐野勇人(ﾊﾔﾄ)", "1998年3月23日", "愛知県", "179cm", "ドラマで活躍する俳優でもある。インスタライブでよく料理をしている。\nメンバーカラー：ピーチヒップピンク"));
        milk_list.add(new Star("塩﨑大智(ﾀﾞｲﾁ)", "2000年9月11日", "和歌山県", "174㎝", "M!LKのバラエティ担当。幼いころから体操を習っていて、体が柔らかい。\nメンバーカラー：サファイアブルー"));
        milk_list.add(new Star("曽野舜太(ｼｭﾝﾀ)", "2002年5月3日", "三重県", "182cm", "M!LKで一番頭が良い。M!LKの最年少でもあり、現役大学生。\nメンバーカラー：ハッピーレッド"));
        milk_list.add(new Star("山中柔太郎(ｼﾞｭｳﾀﾛｳ)", "2001年12月23日", "栃木県", "177cm", "佐野勇人の次に世に出る男(自称)。一番思考が読めない。\nメンバーカラー：クリスタルホワイト"));
        milk_list.add(new Star("吉田仁人(ｼﾞﾝﾄ)", "1992年12月15日", "鹿児島県", "173cm", "M!LKのリーダー。歌声は通るし、ダンスは軸がブレない天才アイドル。\nメンバーカラー：きらめきイエロー"));
        // メッセージ表示
        System.out.println("M!LKのページです。");
        // M!LKの紹介メッセージ
        System.out.println("\nM!LK(ﾐﾙｸ)は、2014年11月24日に結成された5人組ダンスボーカルグループです。ファンの愛称は「み！るきーず」。");
        System.out.println("YouTubeに投稿されている動画を見れば、彼らのおもしろい一面も見ることができます。\n");
        // メンバーの分岐メッセージ
        System.out.println("1>>>佐野勇人");
        System.out.println("2>>>塩﨑大智");
        System.out.println("3>>>曽野舜太");
        System.out.println("4>>>山中柔太郎");
        System.out.println("5>>>吉田仁人");

        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        
        // switchで分岐する
        switch (choice) {
            case 1:         // 佐野勇人の情報表示
                System.out.println(milk_list.get(0));
                break;
            case 2:         // 塩﨑大智の情報表示
                System.out.println(milk_list.get(1));
                break;
            case 3:         // 曽野舜太の情報表示
                System.out.println(milk_list.get(2));
                break;
            case 4:         // 山中柔太郎の情報表示
                System.out.println(milk_list.get(3));
                break;
            case 5:         // 吉田仁人の情報表示
                System.out.println(milk_list.get(4));
                break;
            case 00:        // 00が入力された場合、グループ紹介に戻る（group_changeメソッドを呼び出す）
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、milkyメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                milky();
                break;
        }
    
    }
    // SUPER.DRAGONのメソッドをオーバーライド
    @Override
    public void blue(){
        // sup_listを作成
        List<Star> sup_list = new ArrayList<>();
        // メンバー9人をsup_listに追加する
        sup_list.add(new Star("志村玲於(ﾚｵ)", "1999年1月29日", "東京都", "164.5cm", "趣味はアニメ鑑賞と紅茶を飲むこと。担当もダンス。\nユニット：ファイヤードラゴン"));
        sup_list.add(new Star("古川毅(ﾂﾖｼ)", "2000年2月27日", "東京都", "182cm", "生まれは北海道札幌市。\nユニット：ファイヤードラゴン"));
        sup_list.add(new Star("ジャン海渡(ｶｲﾄ)", "2000年5月4日", "東京都", "181cm", "トルコと日本のハーフ。\nユニット：ファイヤードラゴン"));
        sup_list.add(new Star("飯島颯(ﾊﾔﾃ)", "2001年10月12日", "東京都", "182.2cm", "3年間ニューヨークに住んでいた帰国子女。\nユニット：ファイヤードラゴン"));
        sup_list.add(new Star("伊藤壮吾(ｿｳｺﾞ)", "2003年2月17日", "千葉県", "171cm", "乗るのも撮るのも時刻表も大好きな鉄道オタク。\nユニット：サンダードラゴン"));
        sup_list.add(new Star("田中洸希(ｺｳｷ)", "2003年2月27日", "東京都", "173cm", "ビートボックスが得意。\nユニット：サンダードラゴン"));
        sup_list.add(new Star("池田彪馬(ﾋｮｳﾏ)", "2003年6月2日", "北海道", "180cm", "現役の慶応大学生。\nユニット：サンダードラゴン"));
        sup_list.add(new Star("松村和哉(ﾄﾓﾔ)", "2004年4月15日", "長野県", "171cm", "ファンサービスがすごい。\nユニット：サンダードラゴン"));
        sup_list.add(new Star("柴崎楽(ﾗｸ)", "2004年4月28日", "千葉県", "178cm", "スパドラの最年少。肉が嫌い。\nユニット：サンダードラゴン"));
        // メッセージ表示
        System.out.println("SUPER★DRAGONのページです。");
        // SUPER DRAGONの紹介メッセージ
        System.out.println("\nSUPER★DRAGON(ｽｰﾊﾟｰﾄﾞﾗｺﾞﾝ)は2015年9月27日に結成された9人組ダンス＆ボーカルグループです。ファンの愛称は「BLUE」。");
        System.out.println("年上の4人で構成された「ファイヤードラゴン」と年下5人で構成された「サンダードラゴン」に分かれて活動することもあります。\n");
        // メンバーの分岐メッセージ
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
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();

        // switchで分岐する
        switch (choice) {
            case 1:         // 志村玲於の情報表示
                System.out.println(sup_list.get(0));
                break;
            case 2:         // 古川毅の情報表示
                System.out.println(sup_list.get(1));
                break;
            case 3:         // ジャン海渡の情報表示
                System.out.println(sup_list.get(2));
                break;
            case 4:         // 飯島颯の情報表示
                System.out.println(sup_list.get(3));
                break;
            case 5:         // 伊藤壮吾の情報表示
                System.out.println(sup_list.get(4));
                break;
            case 6:         // 田中洸希の情報表示
                System.out.println(sup_list.get(5));
                break;
            case 7:         // 池田彪馬の情報表示
                System.out.println(sup_list.get(6));
                break;
            case 8:         // 松村和哉の情報表示
                System.out.println(sup_list.get(7));
                break;
            case 9:         // 柴崎楽の情報表示
                System.out.println(sup_list.get(8));
                break;
            case 00:        // 00が入力された場合、グループ紹介のページに戻る(group_changeメソッド)
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、blueメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                blue();
                break;
        }
    }
    // さくらしめじのメソッドをオーバーライド
    @Override
    public void kinoko(){
        // sakura_listを作成
        List<Star> sakura_list = new ArrayList<>();
        // メンバー2人をsakukra_listに追加
        sakura_list.add(new Star("田中雅功(ｶﾞｸ)", "2002年1月24日", "東京都", "165.3cm", "見た目とは裏腹に、先輩にもズバズバと物言いするタイプ。ド天然な髙田彪我のサポート役。"));
        sakura_list.add(new Star("髙田彪我(ﾋｮｳｶﾞ)", "2001年10月23日", "東京都", "176cm", "俳優としても活躍しており。NHKの朝ドラにも出演した。歌声が高い方。特技は耳コピ。"));
        // メッセージ表示
        System.out.println("さくらしめじのページです。");
        // さくらしめじの紹介メッセージ
        System.out.println("\nさくらしめじは、田中雅功と髙田彪我で結成されたフォークデュオです。ファンの愛称は「きのこりあん」");
        System.out.println("2014年6月14日、TOKYO MXにて放送されたバラエティ番組『EBiDAN』にて、“ガク＆ヒョウガ”名義で結成されました。その後、グループ名を「さくらしめじ」に変更しました。");
        // メンバーの分岐メッセージ
        System.out.println("1>>>田中雅功");
        System.out.println("2>>>髙田彪我");
        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switchで分岐する
        switch (choice) {
            case 1:         // 田中雅功の情報表示
                System.out.println(sakura_list.get(0));
                break;
            case 2:         // 髙田彪我の情報表示
                System.out.println(sakura_list.get(1));
                break;
            case 00:        // 00が入力された場合、グループ紹介に戻る（group_changeメソッド）
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、kinokoメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                kinoko();
                break;
        }
    }
    // ONE N' ONLYのメソッドをオーバーライド
    @Override
    public void swag(){
        // one_listを作成
        List<Star> one_list = new ArrayList<>();
        // メンバー6人をone_listに追加
        one_list.add(new Star("TETTA", "1997年11月24日", "神奈川県", "169cm", "ボーカル担当。隙さえあれば筋トレをしている。EBiSSHのメンバー。"));
        one_list.add(new Star("REI", "1997年1月2日", "静岡県", "177cm", "ボーカル担当。イヤホン集めが趣味。EBiSSHのメンバー。"));
        one_list.add(new Star("EIKU", "1999年12月19日", "山梨県", "170cm", "ボーカル担当。楽器が得意。さとり少年団のメンバー。"));
        one_list.add(new Star("HAYATO", "1999年9月17日", "静岡県", "176cm", "ラップ＆ダンス担当。BUDDiiSに実の弟（高尾楓弥）がいる。さとり少年団のメンバー。"));
        one_list.add(new Star("KENSHIN", "1999年7月8日", "愛知県", "180cm", "ラップ＆ダンス担当。お笑いやバラエティなどが好き。さとり少年団のメンバー。"));
        one_list.add(new Star("NAOYA", "1998年4月6日", "東京都", "175cm", "ランプ＆ダンス担当。超特急に実の兄（草川拓弥）がいる。EBiSSHのメンバー。"));
        // メッセージ表示
        System.out.println("ONE N' ONLYのページです。");
        // ONE N' ONLYの紹介メッセージ
        System.out.println("\nONE N’ ONLY(ﾜﾝｴﾝｵﾝﾘｰ)は、J-POPでもK-POPでもない、唯一無二の新たなジャンル“JK-POP”を貫いた6人組ダンス＆ボーカルグループです。ファンの愛称は「SWAG」(ｽﾜｯｸﾞ)。");
        System.out.println("2018年4月、EBiDAN内のユニットであるEBiSSHとさとり少年団の合同グループとして結成されました。（現在は2グループとも活動休止中。）\n");
        // メンバーの分岐メッセージ
        System.out.println("1>>>TETTA\n2>>>REI\n3>>>EIKU\n4>>>HAYATO\n5>>>KENSHIN\n6>>>NAOYA");
        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switchで分岐する
        switch (choice) {
            case 1:         // TETTAの情報表示
                System.out.println(one_list.get(0));
                break;
            case 2:         // REIの情報表示
                System.out.println(one_list.get(1));
                break;
            case 3:         // EIKUの情報表示
                System.out.println(one_list.get(2));
                break;
            case 4:         // HAYATOの情報表示
                System.out.println(one_list.get(3));
                break;
            case 5:         // KENSHINの情報表示
                System.out.println(one_list.get(4));
                break;
            case 6:         // NAOYAの情報表示
                System.out.println(one_list.get(5));
                break;
            case 00:        // 00が入力された場合、グループ紹介に戻る(group_changeメソッド)
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、swagメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                swag();
                break;
        }
    }
    // 原因は自分にある。のメソッドをオーバーライド
    @Override
    public void observer(){
        // gnjb_listを作成
        List<Star> gnjb_list = new ArrayList<>();
        // メンバー7人をgnjb_listに追加
        gnjb_list.add(new Star("大倉空人(ﾀｶﾄ)", "2002年4月12日", "神奈川県", "175cm", "ラップを主に担当。犬系を体現したかのような人懐っこい性格。ライブではそんな人懐っこさも一変するので見てほしいです。\nメンバーカラー：黄色"));
        gnjb_list.add(new Star("小泉光咲(ｺｳｻｸ)", "2003年3月11日", "宮城県", "175cm", "透き通るような歌声の持ち主。げんじぶの天然１号。世に見つかってほしいです。でも見つからないでほしいです(?)。\nメンバーカラー：白"));
        gnjb_list.add(new Star("桜木雅哉(ﾏｻﾔ)", "2006年3月19日", "東京都", "179cm", "歌割はかなり少ないので貴重。げんじぶの最年少、デビュー当時から辿っていくと彼の成長っぷりがよくわかります。\nメンバーカラー：ピンク"));
        gnjb_list.add(new Star("長野凌大(ﾘｮｳﾀ)", "2003年7月16日", "静岡県", "170cm", "げんじぶのダンスリーダーであり、センターにいることが多い。彼のダンスは目を引き付けるダンスです。ぜひ一度見てほしいです。\nメンバーカラー：青"));
        gnjb_list.add(new Star("武藤潤(ｼﾞｭﾝ)", "2001年8月18日", "東京都", "176.5cm", "力強い歌声が素敵なげんじぶの最年長。ガンダムシリーズのプラモデルを作るのが趣味で、夢はポケモンマスターになること。\nメンバーカラー：赤"));
        gnjb_list.add(new Star("杢代和人(ｶｽﾞﾄ)", "2004年5月20日", "東京都", "176cm", "俳優としても活動している。ツッコミをやらされることが多い。レベチイケメン。\nメンバーカラー：緑"));
        gnjb_list.add(new Star("吉澤要人(ｶﾅﾒ)", "2003年7月12日", "東京都", "179cm", "げんじぶのリーダー。低い歌声でげんじぶの低音を支えている。同じメンバーの桜木雅哉のことを溺愛している。\nメンバーカラー：紫"));
        // メッセージ表示
        System.out.println("原因は自分にある。のページです。");
        // 原因は自分にある。の紹介メッセージ
        System.out.println("\n原因は自分にある。(ｹﾞﾝｲﾝﾊｼﾞﾌﾞﾝﾆｱﾙ.)は7人組ダンス＆ボーカルグループです。ファンの愛称は「観測者」。");
        System.out.println("哲学的な貸家ピアノロックサウンド、ボーカロイドの要素が織り込まれたMVなど、独自の世界観で聴く人見る人すべてを魅了します。\n");
        // 念のため注意喚起
        System.out.println("※作成者は観測者なので、作成者の個人的意見が含まれています。※\n");
        // メンバーの分岐メッセージ
        System.out.println("1>>>大倉空人\n2>>>小泉光咲\n3>>>桜木雅哉\n4>>>長野凌大\n5>>>武藤潤\n6>>>杢代和人\n7>>>吉澤要人");
        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switch文で分岐
        switch (choice) {
            case 1:         // 大倉空人の情報表示
                System.out.println(gnjb_list.get(0));
                break;
            case 2:         // 小泉光咲の情報表示
                System.out.println(gnjb_list.get(1));
                break;
            case 3:         // 桜木雅哉の情報表示
                System.out.println(gnjb_list.get(2));
                break;
            case 4:         // 長野凌大の情報表示
                System.out.println(gnjb_list.get(3));
                break;
            case 5:         // 武藤潤の情報表示
                System.out.println(gnjb_list.get(4));
                break;
            case 6:         // 杢代和人の情報表示
                System.out.println(gnjb_list.get(5));
                break;
            case 7:         // 吉澤要人の情報表示
                System.out.println(gnjb_list.get(6));
                break;
            case 00:        // 00が入力された場合、グループ紹介に戻る(group_changeメソッド)
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、observerメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値を確認の上、再入力してください。");
                observer();
                break;
        }
    }
    // BUDDiiSのメソッドをオーバーライド
    @Override
    public void buddy(){
        // bud_listを作成
        List<Star> bud_list = new ArrayList<>();
        // メンバー10人をbud_listに追加
        bud_list.add(new Star("FUMINORI", "1994年11月21日", "埼玉県", "174cm", "BUDDiiSのリーダー。奇跡の29歳で、超特急先輩たちと同世代。"));
        bud_list.add(new Star("KEVIN", "1997年7月12日", "神奈川県", "173cm", "主にメインボーカルを務める。作詞作曲もできる頭のいい人。"));
        bud_list.add(new Star("MORRIE", "1999年11月20日", "東京都", "175.5cm", "弟のSHOOTと「もーりーとしゅーと」というチャンネルでYouTube活動もしている。"));
        bud_list.add(new Star("SEIYA", "2000年12月20日", "東京都", "177cm", "ラッパー兼ダンサー担当。アクロバットが得意。"));
        bud_list.add(new Star("YUMA", "2001年6月25日", "神奈川県", "170cm", "調理師免許を持っている。22歳とは思えない大人びた顔立ちをしている。"));
        bud_list.add(new Star("SHOW", "2003年1月1日", "東京都", "170cm", "アクロバットはライブでも披露するほどの実力。俳優としても着実に経験を増やしている。"));
        bud_list.add(new Star("TAKUYA", "2003年3月5日", "東京都", "175cm", "ダンサーを務める。筋肉には自信がある様子。"));
        bud_list.add(new Star("HARUKI", "2004年3月16日", "神奈川県", "175cm", "特技は笑顔。見る人を幸せにするような明るい笑顔である。"));
        bud_list.add(new Star("FUMIYA", "2004年10月3日", "静岡県", "164cm", "実の兄は、ONE N' ONLYのHAYATO。グミが大好き。BUDDiiSの最年少。"));
        bud_list.add(new Star("SHOOT", "2002年9月18日", "東京都", "167cm", "本名で俳優としても活動している。兄のMORRIEとTouTubeでも活動中。"));
        // メッセージ表示
        System.out.println("BUDDiiSのページです。");
        // BUDDiiSの紹介メッセージ
        System.out.println("\nBUDDiiS(ﾊﾞﾃﾞｨｰｽﾞ)は、2020年9月16日、「自分たちにかかわる人たちすべてをバディに巻き込んでいく」という意味のもと、結成された10人組ダンス＆ボーカルグループです。ファンの愛称は「バディ」");
        System.out.println("作詞作曲から振り付け、グッズデザイン、衣装やライブ演出もメンバーが手掛けており、「DIYグループ」とも呼ばれています。\n");
        // メンバーの分岐メッセージ
        System.out.println("1>>>FUMINORI\n2>>>KEVIN\n3>>>MORRIE\n4>>>SEIYA\n5>>>YUMA\n6>>>SHOW\n7>>>TAKUYA\n8>>>HARUKI\n9>>>FUMIYA\n10>>>SHOOT");
        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switchで分岐
        switch (choice) {
            case 1:         // FUMINORIの情報表示
                System.out.println(bud_list.get(0));
                break;
            case 2:         // KEVINの情報表示
                System.out.println(bud_list.get(1));
                break;
            case 3:         // MORRIEの情報表示
                System.out.println(bud_list.get(2));
                break;
            case 4:         // SEIYAの情報表示
                System.out.println(bud_list.get(3));
                break;
            case 5:         // YUMAの情報表示
                System.out.println(bud_list.get(4));
                break;
            case 6:         // SHOWの情報表示
                System.out.println(bud_list.get(5));
                break;
            case 7:         // TAKUYAの情報表示
                System.out.println(bud_list.get(6));
                break;
            case 8:         // HARUKIの情報表示
                System.out.println(bud_list.get(7));
                break;
            case 9:         // FUMIYAの情報表示
                System.out.println(bud_list.get(8));
                break;
            case 10:        // SHOOTの情報表示
                System.out.println(bud_list.get(9));
                break;
            case 00:        // 00が入力された場合、所属グループ紹介のページに戻る（group_changeメソッド）
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、buddyメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                buddy();
                break;
        }

    }
    // ICExのメソッドをオーバーライド
    @Override
    public void cooler(){
        // ice_listを作成
        List<Star> ice_list = new ArrayList<>();
        // メンバー8人をice_listに追加
        ice_list.add(new Star("志賀李玖(ﾘｸ)", "2004年5月20日", "福島県", "170cm", "ICExのセンター的存在。\nメンバーカラー：青"));
        ice_list.add(new Star("中村旺太郎(ｵｳﾀﾛｳ)", "2004年4月27日", "愛知県", "173cm", "仮面ライダーの変身アクションが特技。いつか先輩に続いて仮面ライダー俳優になれるとイイネ。\nメンバーカラー：黄"));
        ice_list.add(new Star("阿久根温世(ﾊﾙｾ)", "2005年4月13日", "大阪府", "177cm", "サッカーが得意で、指でボールが回せる。\nメンバーカラー：赤"));
        ice_list.add(new Star("千田波空斗(ﾊｸﾄ)", "2005年6月14日", "宮城県", "171.5cm", "アクロバットが得意。\nメンバーカラー：緑"));
        ice_list.add(new Star("筒井俊旭(ﾄｼｱｷ)", "2006年3月27日", "兵庫県", "167cm", "とにかく様々なダンスが得意。\nメンバーカラー：オレンジ"));
        ice_list.add(new Star("山本龍人(ﾘｭｳﾄ)", "2007年4月13日", "千葉県", "160cm", "まだ成長盛りの年下組。EBiDANイチ小顔。\nメンバーカラー：ピンク"));
        ice_list.add(new Star("竹野世梛(ｾﾅ)", "2008年8月28日", "大阪府", "172cm", "まだ成長盛りの年下組。絵を描くのが得意。\nメンバーカラー：紫"));
        ice_list.add(new Star("八神遼介(ﾘｮｳｽｹ)", "2008年8月11日", "愛知県", "174cm", "まだ成長盛りの年下組。バレーボールが得意。\nメンバーカラー：白"));
        // メッセージ表示
        System.out.println("ICExのページです。");
        // ICExの紹介メッセージ
        System.out.println("\nICEx(ｱｲｽ)は、「全ての愛を愛す」をコンセプトに結成された8人組ダンス＆ボーカルグループ。ファンの愛称は「Cooler」");
        System.out.println("ICExの魅力は、平均年齢17歳という若さ。EBiDANの他のグループには出せないフレッシュさや今後の成長過程が強みです。");
        // メンバーの分岐メッセージ
        System.out.println("1>>>志賀李玖\n2>>>中村旺太郎\n3>>>阿久根温世\n4>>>千田波空斗\n5>>>筒井俊旭\n6>>>山本龍人\n7>>>竹野世梛\n8>>>八神遼介");
        System.out.println("**00>>>所属グループ紹介のページに戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switchで分岐
        switch (choice) {
            case 1:         // 志賀李玖の情報表示
                System.out.println(ice_list.get(0));
                break;
            case 2:         // 中村旺太郎の情報表示
                System.out.println(ice_list.get(1));
                break;
            case 3:         // 阿久根温世の情報表示
                System.out.println(ice_list.get(2));
                break;
            case 4:         // 千田波空斗の情報表示
                System.out.println(ice_list.get(3));
                break;
            case 5:         // 筒井俊旭の情報表示
                System.out.println(ice_list.get(4));
                break;
            case 6:         // 山本龍人の情報表示
                System.out.println(ice_list.get(5));
                break;
            case 7:         // 竹野世梛の情報表示
                System.out.println(ice_list.get(6));
                break;
            case 8:         // 八神遼介の情報表示
                System.out.println(ice_list.get(7));
                break;
            case 00:        // 00が入力された場合、所属グループ紹介のページに戻る（group_changeメソッド）
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、coolerメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                cooler();
                break;
        }
    }
    // Lienelのメソッドをオーバーライド
    @Override
    public void lien(){
        // lie_listを作成
        List<Star> lienel_list = new ArrayList<>();
        lienel_list.add(new Star("芳賀柊斗(ｼｭｳﾄ)", "2005年1月25日", "宮城県", "160cm", "いつも元気なLienelの最年長。でもLienelで一番抜けている。"));
        lienel_list.add(new Star("近藤駿太(ｼｭﾝﾀ)", "2005年9月18日", "北海道", "175cm", "特技は野球と野球選手の物真似。顔がとても小さい。"));
        lienel_list.add(new Star("高岡ミロ", "2006年10月3日", "東京都", "173cm", "生まれは福岡県。瞳がきゅるきゅるとは彼のこと。"));
        lienel_list.add(new Star("森田璃空(ﾘｸ)", "2006年10月27日", "大阪府", "167cm", "ダンスが得意。よくTikTokで踊っている。"));
        lienel_list.add(new Star("武田創世(ｿｳｾ)", "2009年4月3日", "埼玉県", "159cm", "中学生ながら、Lienelのメインボーカルである。これからの成長が楽しみな一人。"));
        lienel_list.add(new Star("高桑真之(ｻﾈﾕｷ)", "2009年12月9日", "東京都", "175cm", "EBiDANの最年少(14歳)。しかし最年少とは思えない大人びた雰囲気を既に持ち合わせている。"));
        // メッセージ表示
        System.out.println("Lienelのページです。");
        // Lienelの紹介メッセージ
        System.out.println("\nLienel(ﾘｴﾈﾙ)は、フランス語で「永遠の絆」を意味する“Lien éternel”から名付けられた6人組ダンス＆ボーカルグループです。");
        System.out.println("EBiDANのなかでも1番若手のグループですが、若さのなかに見える上品さや大人っぽさが人気を集めています。\n");
        // メンバーの分岐メッセージ
        System.out.println("1>>>芳賀柊斗\n2>>>近藤駿太\n3>>>高岡ミロ\n4>>>森田璃空\n5>>>武田創世\n6>>>高桑真之");
        System.out.println("**00>>>所属グループ紹介のページの戻る**");
        // 入力を促す
        System.out.print("\n詳細を見たいメンバーのメニュー番号を入力してください。>>>");
        // 入力された数値をchoiceに代入する
        int choice = stdIn.nextInt();
        // switchで分岐
        switch (choice) {
            case 1:         // 芳賀柊斗の情報表示
                System.out.println(lienel_list.get(0));
                break;
            case 2:         // 近藤駿太の情報表示
                System.out.println(lienel_list.get(1));
                break;
            case 3:         // 高岡ミロの情報表示
                System.out.println(lienel_list.get(2));
                break;
            case 4:         // 森田璃空の情報表示
                System.out.println(lienel_list.get(3));
                break;
            case 5:         // 武田創世の情報表示
                System.out.println(lienel_list.get(4));
                break;
            case 6:         // 高桑真之の情報表示
                System.out.println(lienel_list.get(5));
                break;
            case 00:        // 00が入力された場合、所属グループ紹介のページに戻る（group_changeメソッド）
                System.out.println("所属グループ紹介のページに戻ります。");
                groups.group_change();
                break;
            default:        // 該当するメニューがない場合、lienメソッドを呼び出す
                System.out.println("入力された数値に対応するメニューが存在しません。\n入力値と号車番号を確認の上、再入力してください。");
                lien();
                break;
        }
    }
}


