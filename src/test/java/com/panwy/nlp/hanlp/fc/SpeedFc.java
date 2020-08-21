package com.panwy.nlp.hanlp.fc;

import com.hankcs.hanlp.tokenizer.SpeedTokenizer;

/**
 *  极速分词是词典最长分词，速度极其快，精度一般
 */
public class SpeedFc {
    public static void main(String[] args) {
        String text = "江西鄱阳湖干枯，中国最大淡水湖变成大草原";
        System.out.println(SpeedTokenizer.segment(text));
        long start = System.currentTimeMillis();
        int pressure = 1000000;
        for (int i = 0; i < pressure; ++i) {
            SpeedTokenizer.segment(text);
        }
        //double costTime = (System.currentTimeMillis() - start) / (double)1000;
        //System.out.printf("分词速度：%.2f字每秒", text.length() * pressure / costTime);
    }
}
