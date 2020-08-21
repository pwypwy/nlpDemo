package com.panwy.nlp.mynlp.lexer;

import com.mayabot.nlp.segment.FluentLexerBuilder;
import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import com.mayabot.nlp.segment.plugins.customwords.CustomDictionaryPlugin;
import com.mayabot.nlp.segment.plugins.customwords.MemCustomDictionary;
import net.minidev.json.JSONUtil;

public class Dictionary {
    public static void main(String[] args) {
        MemCustomDictionary memCustomDictionary = new MemCustomDictionary();
        FluentLexerBuilder builder = Lexers.coreBuilder();
        builder.with(new CustomDictionaryPlugin(memCustomDictionary));
        Lexer tokenizer = builder.build();

        System.out.println(tokenizer);
        System.out.println(tokenizer.scan("欢迎来到松江灵感科技城"));

        memCustomDictionary.addWord("灵感科技城");
        memCustomDictionary.rebuild();

        System.out.println(tokenizer.scan("欢迎来到宋佳灵感科技城"));
    }
}
