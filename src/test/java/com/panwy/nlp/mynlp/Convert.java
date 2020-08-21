package com.panwy.nlp.mynlp;

import com.mayabot.nlp.module.trans.Simplified2Traditional;
import com.mayabot.nlp.module.trans.Traditional2Simplified;
import com.mayabot.nlp.module.trans.TransformService;

/**
 * 简繁转换
 */
public class Convert {
    public static void main(String[] args) {
        Simplified2Traditional s2t = TransformService.simplified2Traditional();
        System.out.println(s2t.transform("软件和体育艺术"));
        Traditional2Simplified t2s = TransformService.traditional2Simplified();
        System.out.println(t2s.transform("軟件和體育的藝術"));
    }
}
