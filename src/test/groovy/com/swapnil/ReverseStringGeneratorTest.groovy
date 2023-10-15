package com.swapnil

import spock.lang.Specification

class ReverseStringGeneratorTest extends Specification {

    ReverseStringGenerator reverseStringGenerator

    void setup() {
        reverseStringGenerator = new ReverseStringGenerator()
    }

    void cleanup() {
    }

    def "Reverse"() {
        when:
        def actualOutput = reverseStringGenerator.reverse(input)

        then:
        actualOutput == expectedOutput

        where:
        input  | expectedOutput
        ""     | ""
        null   | null
        "    " | "    "
        "abc"  | "cba"

    }
}
