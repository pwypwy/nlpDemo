package com.panwy.nlp.hanlp.fc;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.List;

public class Standar {
    public static void main(String[] args) {
        List<Term> termList = StandardTokenizer.segment("全部词典和模型都是惰性加载的，不使用的模型相当于不存在，可以自由删除");
        System.out.println(termList);
    }
}
