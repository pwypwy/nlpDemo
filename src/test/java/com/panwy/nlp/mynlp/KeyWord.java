package com.panwy.nlp.mynlp;

import com.mayabot.nlp.module.summary.KeywordSummary;
import com.mayabot.nlp.module.summary.SentenceSummary;

import java.util.List;

public class KeyWord {
    public static void main(String[] args) {
        KeywordSummary keywordSummary = new KeywordSummary();
        keywordSummary.keyword("test",10);

        SentenceSummary sentenceSummary = new SentenceSummary();
        List<String> result = sentenceSummary.summarySentences("document",10);
    }
}
