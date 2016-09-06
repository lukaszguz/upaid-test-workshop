package pl.upaid.sample;

public class Sample {

    private SampleService sampleService;

    public Sample(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public int calculate(int value) {
        return value + sampleService.getValue() + SampleThrown.importantValueFromDb();
    }
}
