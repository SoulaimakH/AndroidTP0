package com.gl4.tp

class Rectangle(var p:Point,var q:Point) {

    constructor():this(Point(0,0),Point(1,1))

    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface (): Int {
        return p.distance(p,q)*p.distance(p,q)
    }
}