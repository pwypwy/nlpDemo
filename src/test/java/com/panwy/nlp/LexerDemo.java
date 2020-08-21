package com.panwy.nlp;

import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import com.mayabot.nlp.segment.Sentence;

public class LexerDemo {
    public static void main(String[] args) {
        Lexer lexer =  Lexers.coreBuilder().withPos().withPersonName().build();

        Sentence sentence = lexer.scan("我的希望是希望张晚霞的背影被晚霞映红");
        System.out.println(sentence.toList());
    }
}
