"""
Yang Rong Individual Service
All Rights Reserved @2021

python call jar 测试。

@author: Yang Rong
@version 1.0
@email: samyang3125c@gmail.com
@create: 2021-02-26
"""

from com.j4py.domain import J4pyDO
from com.j4py.util import J4pyUtil
from com.alibaba.fastjson import JSON


def test_j4py():
    # 测试普通类的实例化及普通方法调用。
    j4py_obj = J4pyDO("sam", "28")
    print("--- 测试普通类的实例化及普通方法调用 ---")
    print(j4py_obj.toString())
    # 测试静态方法的引用。
    print("--- 测试静态方法的调用 ---")
    print(J4pyUtil.testJ4pyUtil())
    print("--- 测试静态变量的调用 ---")
    print(J4pyUtil.J4PY_UTIL_CONSTANT)
    # 测试随 j4py 工程打入的其它引用依赖 jar。
    print("--- 测试 j4py jar 中引用了其它依赖 jar ---")
    print(JSON.toJSONString(j4py_obj))
