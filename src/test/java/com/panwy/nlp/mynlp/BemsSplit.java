package com.panwy.nlp.mynlp;

import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import org.springframework.util.StopWatch;

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
        StopWatch stopWatch = new StopWatch("test");
        stopWatch.start("计时");
        for (int i = 0; i < 1000000; i++) {
            lexer.scan("人力资源和社会保障局"+i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }
}
