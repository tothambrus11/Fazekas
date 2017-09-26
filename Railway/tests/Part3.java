package tests;

import rail.RailMap;
import utest.*;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

import java.io.IOException;

public class Part3 extends Testable {
    public void assertion() throws IOException {
        RailMap r = new RailMap("Magyarorszag", "railmap.txt");
        List<String> expectedCities = new LinkedList<>();
        expectedCities.add("Szigliget");
        expectedCities.add("Salakszentmotoros");
        expectedCities.add("Bubanatvolgy");
        expectedCities.add("Budapest");
        expectedCities.add("Siofok");
        expectedCities.add("Keszthely");

        List<String> actualCities = r.getCities();
        Collections.sort(expectedCities);

        check("RailMap.getCities(): null az eredmeny.", actualCities != null);
        Collections.sort(actualCities);

        check("RailMap.getCities(): nem adja vissza az osszes varost.", expectedCities.equals(actualCities));
    }

    public String description() { return "3. resz"; }
    public String className() { return "rail.RailMap"; }

    public Object[] expectedMethods() throws Exception {
        return new Object[]
            { constructor(className(), new Class[] {String.class, String.class})
            , optionalMethod(className() + ".toString")
            , optionalMethod(className() + ".getNeighbours", String.class)
            , method(className() + ".getCities")
            , optionalMethod(className() + ".capitalCity")
            };
    }

    public Object[] expectedFields() throws Exception {
        return new Object[] {};
    }

    public static void main(String... args) {
        Test.main(new Part3());
    }
}
