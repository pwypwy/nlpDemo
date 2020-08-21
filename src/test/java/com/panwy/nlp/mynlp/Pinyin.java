package com.panwy.nlp.mynlp;

import com.mayabot.nlp.module.pinyin.PinyinResult;
import com.mayabot.nlp.module.pinyin.Pinyins;
import com.mayabot.nlp.module.pinyin.split.PinyinSplits;

public class Pinyin {
    public static void main(String[] args) {
        PinyinResult result = Pinyins.convert("好好学习天天向上");
        System.out.println(result.asString());
        System.out.println(result.asHeadString(","));
        result.fuzzy(true);
        System.out.println(result.fuzzy(true).asString());

        result.keepPunctuation(true);
        System.out.println(result.asString());
        System.out.println("==========拼音流切分");
        System.out.println(PinyinSplits.split("haohaoxuexitiantianxiangshang"));
    }
}
