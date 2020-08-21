package com.panwy.nlp.mynlp;

import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import com.mayabot.nlp.segment.Sentence;

/**
 * CORE分词器
 * CORE分词器是基于词典和二元语言模型的分词算法实现
 */
public class LexerDemo {
    public static void main(String[] args) {
        Lexer lexer =  Lexers.coreBuilder()
                .withPos()
                .withPersonName()
                .build();

        Sentence sentence = lexer.scan("2001年，他还在纽约医学院工作时，在英国学术刊物《自然》上发表一篇论文");
        System.out.println(sentence.toList());
    }
}
