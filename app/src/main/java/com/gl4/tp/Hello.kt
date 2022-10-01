package com.gl4.tp

import java.lang.Math.abs


fun main(argv : Array<String> ){
    val arr =  arrayOf(Rectangle(),Rectangle(Point(2,2),
        Point(5,5)))
    print("Hello")
    for (x in arr) {
        println(x.surface ())
    }


}


