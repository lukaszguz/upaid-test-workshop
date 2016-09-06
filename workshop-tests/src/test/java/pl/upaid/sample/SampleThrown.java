package pl.upaid.sample;

public class SampleThrown {

    public static int importantValueFromDb() {
        throw new RuntimeException("Can't connect to db");
    }
}
