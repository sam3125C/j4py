"""
Yang Rong Individual Service
All Rights Reserved @2021

本包相关的初始化工作。

@author: Yang Rong
@version 1.0
@email: samyang3125c@gmail.com
@create: 2021-02-26
"""

import os
import jpype
import jpype.imports
from jpype.types import *

from src.__init__ import base_path

jpype.startJVM(classpath=['jars/*'])

py4j_jar_path = os.path.join(base_path, 'resource/j4py-util.jar')
jpype.addClassPath(py4j_jar_path)
