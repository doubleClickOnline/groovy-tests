package com.groovy.start

import spock.lang.Specification

class LogicTests extends Specification {

    def "Find biggest element value in list"() {
        given:
            def list = [1,2,5,3,4]

        when:
            def result = new Logic().findBiggest(list);

        then:
            result == 5
    }

    def "Find biggest element value in list using data tables"(List<Integer> a, Integer b) {
        expect:
            new Logic().findBiggest(a) == b

        where:
            a         | b
            [1,3,2]   | 3
            [1,2,5,3] | 5
    }
}
