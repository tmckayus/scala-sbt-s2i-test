# spark-basic.py
import sys
import time
import numpy

from pyspark import SparkConf
from pyspark import SparkContext

conf = SparkConf()
conf.setAppName('spark-basic')
sc = SparkContext(conf=conf)

def mod(x):
    return (x, numpy.mod(x, 2))

print('\n'.join(sys.path))
rdd = sc.parallelize(range(1000000)).map(mod).take(30)
print rdd
time.sleep(60)
