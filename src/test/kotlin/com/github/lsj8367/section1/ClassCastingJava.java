package com.github.lsj8367.section1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ClassCastingJava {

    @Test
    void test() {
        Object o = new Object();
        assertThat(o).isInstanceOf(Object.class);
    }
}
