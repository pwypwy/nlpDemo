package com.panwy.nlp.hanlp.fc;

import com.hankcs.hanlp.tokenizer.NLPTokenizer;

/**
 * NLP分词  (缺少模型)
 */
public class NlpFc {
    public static void main(String[] args) {
        System.out.println(NLPTokenizer.segment("我新造一个词叫幻想乡你能识别并标注正确词性吗？"));
        // 注意观察下面两个“希望”的词性、两个“晚霞”的词性
        System.out.println(NLPTokenizer.analyze("我的希望是希望张晚霞的背影被晚霞映红").translateLabels());
        System.out.println(NLPTokenizer.analyze("支援臺灣正體香港繁體：微软公司於1975年由比爾·蓋茲和保羅·艾倫創立。"));
    }
}
