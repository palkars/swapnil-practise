package com.swapnil

import spock.lang.Specification

class CollectionsSortUtilTest extends Specification {
    CollectionsSortUtil collectionsSortUtil = new CollectionsSortUtil()

    def "Sort numbers"() {
        when:
        def output = collectionsSortUtil.sort(input)
        then:
        output == expectedOutput
        where:
        input  | expectedOutput
        [2]    | [2]
        [2, 1] | [1, 2]

    }
}
