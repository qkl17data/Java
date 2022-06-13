package com.learn.javaUtilsLearn;

public class StringBuilderTest {
    public static void main(String[] args) {
        test01();
        /**
         * 铏界劧鍙互鐩存帴鎷兼帴瀛楃涓诧紝浣嗘槸锛屽湪寰幆涓紝姣忔寰幆閮戒細鍒涘缓鏂扮殑瀛楃涓插璞★紝鐒跺悗鎵旀帀鏃х殑瀛楃涓层€?         * 杩欐牱锛岀粷澶ч儴鍒嗗瓧绗︿覆閮芥槸涓存椂瀵硅薄锛屼笉浣嗘氮璐瑰唴瀛橈紝杩樹細褰卞搷GC鏁堢巼銆?         *
         * 涓轰簡鑳介珮鏁堟嫾鎺ュ瓧绗︿覆锛孞ava鏍囧噯搴撴彁渚涗簡StringBuilder锛屽畠鏄竴涓彲鍙樺璞★紝鍙互棰勫垎閰嶇紦鍐插尯锛?         * 杩欐牱锛屽線StringBuilder涓柊澧炲瓧绗︽椂锛屼笉浼氬垱寤烘柊鐨勪复鏃跺璞?         * */
        testStringBuilderAppend();

        testStringBuilderInsert();

        /**
         * 瀵逛簬鏅€氱殑瀛楃涓?鎿嶄綔锛屽苟涓嶉渶瑕佹垜浠皢鍏舵敼鍐欎负StringBuilder锛屽洜涓篔ava缂栬瘧鍣ㄥ湪缂栬瘧鏃跺氨鑷姩鎶婂涓繛缁殑+鎿嶄綔缂栫爜涓篠tringConcatFactory鐨勬搷浣溿€?         * 鍦ㄨ繍琛屾湡锛孲tringConcatFactory浼氳嚜鍔ㄦ妸瀛楃涓茶繛鎺ユ搷浣滀紭鍖栦负鏁扮粍澶嶅埗鎴栬€匰tringBuilder鎿嶄綔銆?         *
         * 浣犲彲鑳借繕鍚杩嘢tringBuffer锛岃繖鏄疛ava鏃╂湡鐨勪竴涓猄tringBuilder鐨勭嚎绋嬪畨鍏ㄧ増鏈紝瀹冮€氳繃鍚屾鏉ヤ繚璇佸涓嚎绋嬫搷浣淪tringBuffer涔熸槸瀹夊叏鐨勶紝
         * 浣嗘槸鍚屾浼氬甫鏉ユ墽琛岄€熷害鐨勪笅闄嶃€?         * StringBuilder鍜孲tringBuffer鎺ュ彛瀹屽叏鐩稿悓锛岀幇鍦ㄥ畬鍏ㄦ病鏈夊繀瑕佷娇鐢⊿tringBuffer銆?         * */
    }
    //杩涜閾惧紡鎿嶄綔鐨勫叧閿槸锛屽畾涔夌殑append()鏂规硶浼氳繑鍥瀟his锛岃繖鏍凤紝灏卞彲浠ヤ笉鏂皟鐢ㄨ嚜韬殑鍏朵粬鏂规硶銆?
    private static void testStringBuilderInsert() {
        StringBuilder sbu = new StringBuilder();
        sbu.append("Mr ")
                .append("Bob ")
                .append("!")
                .insert(0,"Hello, ");
        System.out.println(sbu.toString());


    }

    private static void testStringBuilderAppend() {
        StringBuilder sbu = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sbu.append(i);
            sbu.append(",");
        }
        String str = sbu.toString();
        System.out.println(str.substring(0,str.length()-1));
    }

    private static void test01(){
        String s="";
        for (int i = 0; i < 1000; i++) {
            s=s+","+i;
        }
        System.out.println(s.substring(1));
    }
}
