package com.panwy.nlp.mynlp;

import com.mayabot.nlp.segment.FluentLexerBuilder;
import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import com.mayabot.nlp.segment.plugins.customwords.CustomDictionaryPlugin;
import com.mayabot.nlp.segment.plugins.customwords.MemCustomDictionary;

public class PipelinePlugin {
    public static void main(String[] args) {
        //自定义词典
        MemCustomDictionary dictionary = new MemCustomDictionary();
        dictionary.addWord("逛吃");
        dictionary.rebuild();

        FluentLexerBuilder builder = Lexers.coreBuilder()
                .withPos()
                .withPersonName();

        //配置插件
        builder.with(new CustomDictionaryPlugin((dictionary)));

        Lexer lexer = builder.build();
        System.out.println(lexer.scan("逛吃行动小组成立"));
    }
}
