package com.github.lsj8367.`class`

class Cat (species: String) : Animal(species, 4) {
    // 상속할때 extends대신 : 로 바로 만들어준다

    override fun move() {
        println("고양이가 사뿐사뿐 걸어간다.")
    }

}
