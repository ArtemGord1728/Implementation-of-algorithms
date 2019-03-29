package com.captcha;

import point_levels.GetFirstLevel;
import point_levels.GetFourthLevel;
import point_levels.GetSecondLevel;
import point_levels.GetThirdLevel;

public class AlgorithmCaptcha
{
    public static AlgorithmCaptcha create(){
        return new AlgorithmCaptcha();
    }


    public StringBuilder startAlgorithm(int num){
        assert(num < 0 || num > 9999);

        StringBuilder stringBuilder = new StringBuilder();
        int iter = 0;
        int[] num_pointer = new int[4];
        while (num > 0){
            num_pointer[iter] = num % 10;
            num /= 10;
            iter++;
        }

        for(int i = num_pointer.length - 1; i >= 0; i--){
            switch (i){
                case 3:
                    stringBuilder.append(GetFourthLevel.buildStr(num_pointer[i - 1]));
                    break;

                case 2:
                    stringBuilder.append(GetThirdLevel.buildStr(num_pointer[i]));
                    break;

                case 1:
                    stringBuilder.append(GetSecondLevel.buildStr(num_pointer[i], num_pointer[i - 1]));
                    break;

                case 0:
                    stringBuilder.append(GetFirstLevel.buildStr(num_pointer[i]));
                    break;
            }
        }

        return stringBuilder;
    }
}
