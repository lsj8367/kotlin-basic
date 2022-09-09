package com.github.lsj8367.section2

class MoneyKot(val value: Int) {

    operator fun plus(moneyKot: MoneyKot): MoneyKot {
        return MoneyKot(this.value + moneyKot.value)
    }

    operator fun minus(moneyKot: MoneyKot): MoneyKot {
        return MoneyKot(this.value - moneyKot.value)
    }

    operator fun times(moneyKot: MoneyKot): MoneyKot {
        return MoneyKot(this.value * moneyKot.value)
    }
}
