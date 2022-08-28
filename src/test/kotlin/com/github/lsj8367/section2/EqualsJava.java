package com.github.lsj8367.section2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class EqualsJava {

    @Test
    void test() {
        final Money money1 = new Money(1000);
        final Money money2 = money1;
        final Money money3 = new Money(1000);

        assertThat(money1 == money2).isTrue();
        assertThat(money1 == money3).isFalse();
        assertThat(money1.equals(money3)).isTrue();
    }

}
