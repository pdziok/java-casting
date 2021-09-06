package me.pdziok.casting

import spock.lang.Specification
import spock.lang.Unroll

class CastingSpec extends Specification {

    Casting casting = new Casting()

    @Unroll
    def "should cast float to int"() {
        expect:
        casting.floatToInt(input) == output

        where:
        input   || output
        4.2     || 4
        3.33333 || 3
        3.99999 || 3
    }

    @Unroll
    def "should cast double to int"() {
        expect:
        casting.doubleToInt(input) == output

        where:
        input           || output
        4.2             || 4
        3.3545454545555 || 3
        3.9999544555559 || 3
    }

    @Unroll
    def "should cast int to float"() {
        expect:
        casting.intToFloat(input) == output
        casting.intToFloat(input).class == output.class

        where:
        input || output
        4     || 4F
        6     || 6F
        3     || 3F
    }

    @Unroll
    def "should cast int to double"() {
        expect:
        casting.intToDouble(input) == output
        casting.intToDouble(input).class == output.class

        where:
        input || output
        4     || 4D
        6     || 6D
        3     || 3D
    }

    @Unroll
    def "should cast double to float"() {
        expect:
        casting.doubleToFloat(input) == output
        casting.doubleToFloat(input).class == output.class

        where:
        input                       || output
        4.2222222545454545454545454 || 4.2222223F
        6.3333333333356565656565655 || 6.3333335F
        3.8888888887777777777778787 || 3.8888888F
    }

    @Unroll
    def "should cast int to string"() {
        expect:
        casting.intToString(input) == output
        casting.intToString(input).class == output.class

        where:
        input || output
        5     || "5"
        6     || "6"
        3     || "3"
    }

    @Unroll
    def "should cast int to string2"() {
        expect:
        casting.intToString2(input) == output
        casting.intToString2(input).class == output.class

        where:
        input || output
        5     || "5"
        6     || "6"
        3     || "3"
    }

    @Unroll
    def "should cast string to int"() {
        expect:
        casting.stringToInt(input) == output
        casting.stringToInt(input).class == output.class

        where:
        input || output
        "5"   || 5
        "6"   || 6
    }

    @Unroll
    def "should throw error when casting non numeric string to int"() {
        when:
        casting.stringToInt(input)

        then:
        thrown(IllegalArgumentException)

        where:
        input << [
        "!@#",
        "6I"
        ]
    }
}
