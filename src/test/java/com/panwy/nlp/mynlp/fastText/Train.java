package com.panwy.nlp.mynlp.fastText;

import com.mayabot.nlp.fasttext.FastText;
import com.mayabot.nlp.fasttext.args.InputArgs;
import com.mayabot.nlp.fasttext.loss.LossName;

import java.io.File;

public class Train {
    public static void main(String[] args) throws Exception {
        File trainFile = new File("src/test/resource/train.txt");
        InputArgs inputArgs = new InputArgs();
        inputArgs.setLoss(LossName.softmax);
        inputArgs.setLr(0.1);//学习率
        inputArgs.setDim(100);//向量维度
        inputArgs.setEpoch(20);//迭代次数

        FastText model = FastText.trainSupervised(trainFile,inputArgs);

        FastText.trainCow(trainFile,inputArgs);
        FastText.trainSkipgram(trainFile,inputArgs);

        //模型评估
        model.test(new File("src/test/resource/test.txt"),1,9,true);

        model.saveModel("src/test/resource/test.model");
        //model.saveModelToSingleFile();

        //加载文件
        FastText model2 = FastText.loadModel(new File("xxx"),false);

        //预测标签
        //model2.predict();
    }
}
