package com.github.lsj8367.section2;

import java.util.Objects;

public record Money(int value) {

    public Money plus(final Money money) {
        return new Money(this.value + money.value);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Money{" +
            "value=" + value +
            '}';
    }

}
