package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Ignore
    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        double[] addToSeries = {7.8, 145,3, -4,7};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expAver = 1.0;
        double expDevit = 14.0;
        double actualAver = seriesAnalysis.average();
        double devit = seriesAnalysis.deviation();
        double closest = seriesAnalysis.findTempClosestToZero();
        System.out.println(actualAver);
        System.out.println(devit);
        System.out.println(seriesAnalysis.min());
        System.out.println(seriesAnalysis.max());
        System.out.println(closest);
        double closest2 = seriesAnalysis.findTempClosestToValue((double)2);
        System.out.println(closest2);
        System.out.println(Arrays.toString(seriesAnalysis.findTempsLessThen((double) 3)));
        System.out.println(Arrays.toString(seriesAnalysis.findTempsGreaterThen(((double) 2))));
        assertEquals(expAver, actualAver, 0.00001);
        seriesAnalysis.addTemps(7.8, 145,3, -4,7);
        System.out.println(Arrays.toString(seriesAnalysis.temperatureSeries));
        TempSummaryStatistics summary = seriesAnalysis.summaryStatistics();
        System.out.println(summary.avgTemp);

    }
    

}
