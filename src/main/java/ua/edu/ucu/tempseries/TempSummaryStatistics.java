package ua.edu.ucu.tempseries;

public final class TempSummaryStatistics extends TemperatureSeriesAnalysis {
    private final double avgTemp = this.average();
    private final double devTemp = this.deviation();
    private final double minTemp = this.min();
    private final double maxTemp = this.max();
}
