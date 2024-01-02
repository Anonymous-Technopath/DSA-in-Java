'''
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem :  Convert String
*Problem Source : Coding Ninjas
* 
'''

from os import *
from sys import *
from collections import *
from math import *

def convertString(s):
    # Write your code here
    a=""
    for i in s.split():
        a=a+i[:1].upper()+i[1:]+" "
    return a[:len(a)-1]
