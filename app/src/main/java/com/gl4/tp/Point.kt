package com.gl4.tp

class Point(var xx: Int,var yy:Int) {
    var x: Int=xx;
    var y:Int=yy
    fun distance(p1:Point,p2:Point): Int {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y)
    }
}