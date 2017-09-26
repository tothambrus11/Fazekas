package tests;

import rail.RailMap;
import utest.*;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.io.IOException;

public class Part5 extends Testable {
    public void assertion() throws IOException {
        RailMap r = new RailMap("Magyarorszag", "railmap.txt");
        check("RailMap.capitalCity: nem a fovarost adja vissza.", "Budapest".equals(r.capitalCity()));
    }

    public String description() { return "5. resz"; }
    public String className() { return "rail.RailMap"; }

    public Object[] expectedMethods() throws Exception {
        return new Object[]
            { constructor(className(), new Class[] {String.class, String.class})
            , optionalMethod(className() + ".toString")
            , optionalMethod(className() + ".getNeighbours", String.class)
            , optionalMethod(className() + ".getCities")
            , method(className() + ".capitalCity")
            };
    }

    public Object[] expectedFields() throws Exception {
        return new Object[] {};
    }

    public static void main(String... args) {
        Test.main(new Part5());
    }
}
