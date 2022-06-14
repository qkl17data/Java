package com.learn.javaUtilsLearn;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringDemoLearn {
    public static void main(String[] args) throws UnsupportedEncodingException {
        testUTF_8();
//        testStringToChar();
//        testType();
//        testOperation();
//        testEquals();
//        test01();
    }

    /**
     * ASCII缂栫爜  :涓€濂楄嫳鏂囧瓧姣嶃€佹暟瀛楀拰甯哥敤绗﹀彿鐨勭紪鐮?     * GB2312:鎶婃眽瀛椾篃绾冲叆璁＄畻鏈虹紪鐮?     *
     * unicode 涓轰簡缁熶竴鍏ㄧ悆鎵€鏈夎瑷€鐨勭紪鐮侊紝鍏ㄧ悆缁熶竴鐮佽仈鐩熷彂甯冧簡Unicode缂栫爜锛屽畠鎶婁笘鐣屼笂涓昏璇█閮界撼鍏ュ悓涓€涓紪鐮侊紝杩欐牱锛屼腑鏂囥€佹棩鏂囥€侀煩鏂囧拰鍏朵粬璇█灏变笉浼氬啿绐併€?     * UTF-8 :鑻辨枃瀛楃鐨刄nicode缂栫爜楂樺瓧鑺傛€绘槸00锛屽寘鍚ぇ閲忚嫳鏂囩殑鏂囨湰浼氭氮璐圭┖闂达紝鎵€浠ワ紝鍑虹幇浜哢TF-8缂栫爜锛屽畠鏄竴绉嶅彉闀跨紪鐮侊紝鐢ㄦ潵鎶婂浐瀹氶暱搴︾殑Unicode缂栫爜鍙樻垚1锝?瀛楄妭鐨勫彉闀跨紪鐮併€傞€氳繃UTF-8缂栫爜锛岃嫳鏂囧瓧绗?A'鐨刄TF-8缂栫爜鍙樹负0x41锛屾濂藉拰ASCII鐮佷竴鑷达紝鑰屼腑鏂?涓?鐨刄TF-8缂栫爜涓?瀛楄妭0xe4b8ad
     * UTF-8缂栫爜鐨勫彟涓€涓ソ澶勬槸瀹归敊鑳藉姏寮恒€傚鏋滀紶杈撹繃绋嬩腑鏌愪簺瀛楃鍑洪敊锛屼笉浼氬奖鍝嶅悗缁瓧绗︼紝鍥犱负UTF-8缂栫爜渚濋潬楂樺瓧鑺備綅鏉ョ‘瀹氫竴涓瓧绗︾┒绔熸槸鍑犱釜瀛楄妭锛屽畠缁忓父鐢ㄦ潵浣滀负浼犺緭缂栫爜銆?     * */
    private static void testUTF_8() throws UnsupportedEncodingException {
        //杞崲缂栫爜鍚庯紝灏变笉鍐嶆槸char绫诲瀷锛岃€屾槸byte绫诲瀷琛ㄧず鐨勬暟缁勩€?
        byte[] b1 = "Hello".getBytes(); // 鎸夌郴缁熼粯璁ょ紪鐮佽浆鎹紝涓嶆帹鑽?
        byte[] b2 = "Hello".getBytes("UTF-8"); // 鎸塙TF-8缂栫爜杞崲
        byte[] b3 = "Hello".getBytes("GBK"); // 鎸塆BK缂栫爜杞崲
        byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 鎸塙TF-8缂栫爜杞崲

        byte[] b = b3;
        String s1 = new String(b, "GBK"); // 鎸塆BK杞崲
        String s2 = new String(b, StandardCharsets.UTF_8); // 鎸塙TF-8杞崲
        System.out.println(s1);
        System.out.println(s2);
        //Java鐨凷tring鍜宑har鍦ㄥ唴瀛樹腑鎬绘槸浠nicode缂栫爜琛ㄧず銆?
    }

    private static void testStringToChar() {
        //String鍜宑har[]绫诲瀷鍙互浜掔浉杞崲
        char[] chars = "Hello".toCharArray();
        System.out.println("Hello".charAt(0));
        System.out.println(chars[0]);
        String s1 = new String(chars);
        System.out.println(s1);

        /**
         * 濡傛灉淇敼浜哻har[]鏁扮粍锛孲tring骞朵笉浼氭敼鍙?
         * 閫氳繃new String(char[])鍒涘缓鏂扮殑String瀹炰緥鏃讹紝瀹冨苟涓嶄細鐩存帴寮曠敤浼犲叆鐨刢har[]鏁扮粍锛岃€屾槸浼氬鍒朵竴浠斤紝鎵€浠ワ紝淇敼澶栭儴鐨刢har[]鏁扮粍涓嶄細褰卞搷String瀹炰緥鍐呴儴鐨刢har[]鏁扮粍锛屽洜涓鸿繖鏄袱涓笉鍚岀殑鏁扮粍銆?         * 浠嶴tring鐨勪笉鍙樻€ц璁″彲浠ョ湅鍑猴紝濡傛灉浼犲叆鐨勫璞℃湁鍙兘鏀瑰彉锛屾垜浠渶瑕佸鍒惰€屼笉鏄洿鎺ュ紩鐢ㄣ€?         *
         */
        char[] cs = "Hello".toCharArray();
        String s = new String(cs);
        System.out.println(s);
        cs[0] = 'X';
        System.out.println(s);
    }

    private static void testType() {
        //绫诲瀷杞崲锛氳鎶婁换鎰忓熀鏈被鍨嬫垨寮曠敤绫诲瀷杞崲涓哄瓧绗︿覆锛屽彲浠ヤ娇鐢ㄩ潤鎬佹柟娉晇alueOf().
        // 閲嶈浇鏂规硶锛岀紪璇戝櫒浼氭牴鎹弬鏁拌嚜鍔ㄩ€夋嫨鍚堥€傜殑鏂规硶
        //鍏朵粬绫诲瀷杞琒tring
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(45.76));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new Object()));
        //String杞叾浠栫被鍨?        //瀛楃涓茶浆int
        int n1 = Integer.parseInt("123");
        int ff = Integer.parseInt("ff", 16);
        System.out.println(n1);
        System.out.println(ff);
        //瀛楃涓茶浆boolean
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("false"));

        //Integer鏈変釜getInteger(String)鏂规硶锛屽畠涓嶆槸灏嗗瓧绗︿覆杞崲涓篿nt锛岃€屾槸鎶婅瀛楃涓插搴旂殑绯荤粺鍙橀噺杞崲涓篒nteger
        System.out.println(Integer.getInteger("java.version"));


    }

    private static void testOperation() {
        //鎼滅储瀛椾覆  (鏄惁鍖呭惈瀛愪覆)
        System.out.println("Hello".contains("ll"));
        //鎼滅储绗竴涓嚭鐜拌鍏冪礌鐨勭储寮曞€?        System.out.println("Hello".indexOf("l"));
        //
        System.out.println("Hello".lastIndexOf("l"));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("llo"));


        //鎻愬彇瀛愪覆   绱㈠紩浠?寮€濮?        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2, 4));

        //鍘婚櫎棣栧熬绌虹櫧瀛楃
        //浣跨敤trim()鏂规硶鍙互绉婚櫎瀛楃涓查灏剧┖鐧藉瓧绗︺€傜┖鐧藉瓧绗﹀寘鎷┖鏍硷紝\t锛孿r锛孿n锛?        //trim()骞舵病鏈夋敼鍙樺瓧绗︿覆鐨勫唴瀹癸紝鑰屾槸杩斿洖浜嗕竴涓柊瀛楃涓层€?        System.out.println(" \tHello\r\n");
        System.out.println(" \tHello\r\n".trim());
        //鍙︿竴涓猻trip()鏂规硶涔熷彲浠ョЩ闄ゅ瓧绗︿覆棣栧熬绌虹櫧瀛楃銆?        //瀹冨拰trim()涓嶅悓鐨勬槸锛岀被浼间腑鏂囩殑绌烘牸瀛楃\u3000涔熶細琚Щ闄わ細
        System.out.println("\u3000Hello\u3000".strip());
        System.out.println(" Hello ".stripLeading());
        System.out.println(" Hello ".stripTrailing().stripLeading());


        //瀛楃涓插垽绌?鍒ゆ柇瀛楃涓叉槸鍚︿负绌哄拰绌虹櫧瀛楃涓?        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" \n".isBlank());
        System.out.println(" Hello ".isBlank());

        //鏇挎崲瀛愪覆
        //鏂规硶涓€锛氭牴鎹瓧绗︽垨瀛楃涓叉浛鎹?
        String s = "hello";
        System.out.println(s.replace('l', 'w'));
        // "hewwo"锛屾墍鏈夊瓧绗?l'琚浛鎹负'w'
        System.out.println(s.replace("ll", "~~"));
        // "he~~o"锛屾墍鏈夊瓙涓?ll"琚浛鎹负"~~"
        //鏂规硶浜岋細閫氳繃姝ｅ垯琛ㄨ揪寮?
        String s1 = "A,,B;C ,D";
        System.out.println(s1.replaceAll("[\\,\\;\\s]+", ","));
        // "A,B,C,D"

        //鍒嗗壊瀛楃涓?        //瑕佸垎鍓插瓧绗︿覆锛屼娇鐢╯plit()鏂规硶锛屽苟涓斾紶鍏ョ殑涔熸槸姝ｅ垯琛ㄨ揪寮?
         String s2 = s1.replaceAll("[\\,\\;\\s]+", ",");
        System.out.println(s2);
        String[] arr = s2.split(",");

        //鎷兼帴瀛楃涓?
         String join = String.join("***", arr);
        System.out.println(join);


        //鏍煎紡鍖栧瓧绗︿覆  %s  %d   %x %f   %.2f琛ㄧず鏄剧ず涓や綅灏忔暟
        String sN = "Hi %s, your score is %d!";
        System.out.println(String.format(sN, "Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

    }


    /**
     * 褰撴垜浠兂瑕佹瘮杈冧袱涓瓧绗︿覆鏄惁鐩稿悓鏃讹紝
     * 瑕佺壒鍒敞鎰忥紝鎴戜滑瀹為檯涓婃槸鎯虫瘮杈冨瓧绗︿覆鐨勫唴瀹规槸鍚︾浉鍚屻€?     * 蹇呴』浣跨敤equals()鏂规硶鑰屼笉鑳界敤==銆?     * <p>
     * 涓や釜瀛楃涓叉瘮杈冿紝蹇呴』鎬绘槸浣跨敤equals()鏂规硶銆?     * 瑕佸拷鐣ュぇ灏忓啓姣旇緝锛屼娇鐢╡qualsIgnoreCase()鏂规硶銆?     */
    private static void testEquals() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);  //true
        System.out.println(s1.equals(s2));  //true
        /**
         * 浠庤〃闈笂鐪嬶紝涓や釜瀛楃涓茬敤==鍜宔quals()姣旇緝閮戒负true锛?         * 浣嗗疄闄呬笂閭ｅ彧鏄疛ava缂栬瘧鍣ㄥ湪缂栬瘧鏈燂紝
         * 浼氳嚜鍔ㄦ妸鎵€鏈夌浉鍚岀殑瀛楃涓插綋浣滀竴涓璞℃斁鍏ュ父閲忔睜锛?         * 鑷劧s1鍜宻2鐨勫紩鐢ㄥ氨鏄浉鍚岀殑銆?         * */
        String s3 = "HELLO".toLowerCase(Locale.ROOT);
        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s3)); //true
    }

    /**
     * JAVA瀛楃涓茬殑涓€涓噸瑕佺壒鐐瑰氨鏄瓧绗︿覆涓嶅彲鍙樸€?     * 杩欑涓嶅彲鍙樻€ф槸閫氳繃鍐呴儴鐨刾rivate final char[] 瀛楁锛?     * 浠ュ強娌℃湁浠讳綍淇敼char[]鐨勬柟寮忓疄鐜扮殑
     */
    private static void test01() {
        String s = "Hello";
        System.out.println(s); //Hello
        String s1 = s.toUpperCase(Locale.ROOT);
        System.out.println(s); //Hello
        System.out.println(s1); //HELLO
    }
}
