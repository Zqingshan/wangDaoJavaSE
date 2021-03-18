package com.zqs.dayhomework.day14_exception;

/**
 * @description: 第二题
 * @author: z_qingshan
 * @create: 2021-03-16
 **/

/**
 * 分别自定义编译时异常和运行时异常，并在方法中抛出异常，main方法中调用该方法，并处理相应的异常
 */
public class Test02 {
    public static void main(String[] args) throws OverWeightException {

        //运行时异常处理
        try {
            JudgeWeight(56);
        } catch (OverWeightRuntimeException e) {
            e.printStackTrace();
        }

        //编译时异常处理
        JudgeWeight2(48);

    }

    //运行时异常
    public static void JudgeWeight(double weight) {
        if (weight >= 100) {
            throw new OverWeightRuntimeException(weight + "Kg太胖了，该去减肥了");
        } else if (weight < 50) {
            throw new OverWeightRuntimeException(weight + "Kg有点瘦");
        } else {
            System.out.println(weight + "Kg体重还算合适");
        }
    }

    //编译时异常
    public static void JudgeWeight2(double weight) throws OverWeightException {
        if (weight >= 100) {
            throw new OverWeightException(weight + "Kg太胖了，该去减肥了");
        } else if (weight < 50) {
            throw new OverWeightException(weight + "Kg有点瘦");
        } else {
            System.out.println(weight + "Kg体重还算合适");
        }
    }
}

//体重超重异常，运行时异常
class OverWeightRuntimeException extends RuntimeException {
    public OverWeightRuntimeException() {
    }

    public OverWeightRuntimeException(String message) {
        super(message);
    }
}

///编译时异常
class OverWeightException extends Exception {
    public OverWeightException() {
    }

    public OverWeightException(String message) {
        super(message);
    }
}
