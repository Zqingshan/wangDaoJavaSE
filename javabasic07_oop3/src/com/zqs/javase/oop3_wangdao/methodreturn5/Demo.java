package com.zqs.javase.oop3_wangdao.methodreturn5;

/**
 * @description: 方法重写中的返回值类型
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * void和基本数据类型 要保持一致
 * 引用数据类型是可以类型提升的
 */
public class Demo {
}
class Father{
    public Father test(){
        return null;
    }
}
class Son extends Father{
    @Override
    public Son test() {
       return null;
    }
}
