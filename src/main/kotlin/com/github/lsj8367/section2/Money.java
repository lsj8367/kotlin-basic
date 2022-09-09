package com.github.lsj8367.section2;

public record Money(int value) {

    public Money plus(final Money money) {
        return new Money(this.value + money.value);
    }

    public Money minus(final Money money) {
        compareMoneyValue(money);
        return new Money(this.value - money.value);
    }

    private void compareMoneyValue(final Money money) {
        if (this.value < money.value) {
            throw new IllegalStateException("소비하고자 하는 돈이 더 클 수 없습니다.");
        }
    }

}
