package com.panwy.nlp.mynlp;

import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;

/**
 * 感知机分词
 * 感知机分词器是基于BEMS标注的，结构化感知机分词算法实现。
 */
public class BemsSplit {
    public static void main(String[] args) {
        Lexer lexer = Lexers.perceptronBuilder()
                .withPos()
                .withPersonName()
                .withNer()
                .build();
        System.out.println(lexer.scan("2001年，他还在纽约医学院工作时，在英国学术刊物《自然》上发表一篇论文"));
    }
}
