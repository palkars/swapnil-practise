package com.swapnil

import spock.lang.Specification

class NumberReversalTest extends Specification {
    NumberReversal numberReversal

    void setup() {
        numberReversal = new NumberReversal()
    }

    def "Reverse"() {
        when:
        def output = numberReversal.reverse(input)
        then:
        output == expectedOutput
        where:
        input | expectedOutput
        0     | 0
        123   | 321
    }
}
