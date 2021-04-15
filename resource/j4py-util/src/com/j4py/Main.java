/**
 * Yang Rong Individual Service
 * All Rights Reserved @2021
 */
package com.j4py;

import com.j4py.domain.J4pyDO;
import com.j4py.util.J4pyUtil;

/**
 * 在 java 中测试，对应 python 调用 java 的测试。
 *
 * @author Yang Rong
 * @version 1.0
 * @email samyang3125c@gmail.com
 * @create 2021-02-26
 */
public class Main {

    public static void main(String[] args) {
        // 测试普通类的实例化及普通方法调用。
        J4pyDO j4PyDO = new J4pyDO("sam", "28");
        System.out.println("--- 测试普通类的实例化及普通方法调用 ---");
        System.out.println(j4PyDO.toString());
        //测试静态方法的引用。
        System.out.println("--- 测试静态方法的调用 ---");
        System.out.println(J4pyUtil.testJ4pyUtil());
        System.out.println("--- 测试静态变量的调用 ---");
        System.out.println(J4pyUtil.J4PY_UTIL_CONSTANT);
    }

}
