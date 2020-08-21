package com.panwy.nlp.mynlp;


import com.mayabot.nlp.fasttext.FastText;
import com.mayabot.nlp.fasttext.args.InputArgs;
import com.mayabot.nlp.fasttext.loss.LossName;

import java.io.File;
import java.sql.SQLOutput;

/**
 * mynlp采用fasttext算法提供文本分类功能，你可以训练、评估自己的分类模型。
 *
 * 训练数据是个纯文本文件，每一行一条数据，词之间使用空格分开，每一行必须包含至少一个label标签。默认 情况下，是一个带`label`前缀的字符串。
 */
public class Classify {
    public static void main(String[] args) {

        File trainFile = new File("src\\test\\resources\\train.txt");
        File testFile = new File("src\\test\\resources\\test.txt");

        InputArgs trainArgs = new InputArgs();
        trainArgs.setLoss(LossName.hs);
        trainArgs.setEpoch(10);
        trainArgs.setDim(100);
        trainArgs.setLr(0.2);

        FastText fastText = FastText.trainSupervised(trainFile,trainArgs);
        //FastText qFast = fastText.quantize();

        fastText.test(testFile,1,0.0f,true);
        System.out.println("--------------------");
        //qFast.test(testFile,1,0.0f,true);
    }
}
