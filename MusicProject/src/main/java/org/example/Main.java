package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.ChartScraper.getChartData;
import static org.example.YearScraper.getYears;

public class Main {
    public static void main(String[] args)
    {
        new ManageScreen() ;
        List<String> years = getYears();
        int year = 1900;
        String chartType = "top-songs";

        List<ChartEntry> chartData = getChartData(year, chartType);

        // Print the chart data
        for (ChartEntry entry : chartData) {
            System.out.println(entry.getRank() + ": " + entry.getTitle() + " - " + entry.getArtist());
        }
    }
}



