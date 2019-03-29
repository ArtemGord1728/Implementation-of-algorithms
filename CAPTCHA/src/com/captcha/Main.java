package com.captcha;

public class Main {

    public static void main(String[] args) {
        AlgorithmCaptcha captcha = AlgorithmCaptcha.create();
        System.out.println(captcha.startAlgorithm(2230));
    }
}
