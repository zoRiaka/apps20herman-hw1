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
        double expAver = -1.0;
        double expDevit = 0.0;
        double expMin = -1.0;
        double expMax = -1.0;
        double expClosest0 = -1.0;
        double expClosest2 = -1.0;
        double expLenght = 5;
        double actualAver = seriesAnalysis.average();
        double actualDevit = seriesAnalysis.deviation();
        double actualClosest0 = seriesAnalysis.findTempClosestToZero();
        double actualMin = seriesAnalysis.min();
        double actualMax = seriesAnalysis.max();
        double actualClosest2 = seriesAnalysis.findTempClosestToValue((double)2);
        double actualLenght = seriesAnalysis.addTemps(7.8, 145, 3, -4,7);
        assertEquals(expAver, actualAver, 0.00001);
        assertEquals(expDevit, actualDevit, 0.00001);
        assertEquals(expMin, actualMin, 0.00001);
        assertEquals(expMax, actualMax, 0.00001);
        assertEquals(expClosest0, actualClosest0, 0.00001);
        assertEquals(expClosest2, actualClosest2, 0.00001);
        assertEquals(expLenght, actualLenght, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
        seriesAnalysis.deviation();
        seriesAnalysis.max();
        seriesAnalysis.min();
        seriesAnalysis.findTempClosestToZero();
        seriesAnalysis.findTempClosestToValue((double) 3);
        seriesAnalysis.summaryStatistics();

    }

    @Ignore
    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expAver = 1.0;
        double expDevit = 14.0;
        double expMin = -5.0;
        double expMax = 5.0;
        double expClosest0 = 1.0;
        double expClosest2 = 3.0;
        double expLenght = 8;
        double actualAver = seriesAnalysis.average();
        double actualDevit = seriesAnalysis.deviation();
        double actualClosest0 = seriesAnalysis.findTempClosestToZero();
        double actualMin = seriesAnalysis.min();
        double actualMax = seriesAnalysis.max();
        double actualClosest2 = seriesAnalysis.findTempClosestToValue((double)2);
        double actualLenght = seriesAnalysis.addTemps(7.8, 145, 3, -4,7);
        assertEquals(expAver, actualAver, 0.00001);
        assertEquals(expDevit, actualDevit, 0.00001);
        assertEquals(expMin, actualMin, 0.00001);
        assertEquals(expMax, actualMax, 0.00001);
        assertEquals(expClosest0, actualClosest0, 0.00001);
        assertEquals(expClosest2, actualClosest2, 0.00001);
        assertEquals(expLenght, actualLenght, 0.00001);
    }

}

