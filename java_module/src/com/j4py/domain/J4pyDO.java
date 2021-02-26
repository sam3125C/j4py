/**
 * Yang Rong Individual Service
 * All Rights Reserved @2021
 */
package com.j4py.domain;

/**
 * 测试普通类的实例化及普通方法调用。
 *
 * @author Yang Rong
 * @version 1.0
 * @email samyang3125c@gmail.com
 * @create 2021-02-26
 */
public class J4pyDO {

    private String name;

    private String age;

    public J4pyDO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "J4pyDO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
