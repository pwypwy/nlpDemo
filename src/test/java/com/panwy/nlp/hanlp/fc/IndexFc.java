package com.panwy.nlp.hanlp.fc;

import com.hankcs.hanlp.tokenizer.IndexTokenizer;

public class IndexFc {
    public static void main(String[] args) {
        System.out.println(IndexTokenizer.segment("主副食品"));
    }
}
