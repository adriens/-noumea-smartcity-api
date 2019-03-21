/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.noumeasmartcityapi.service;

import com.github.adriens.scalair4j.IGA;
import com.github.adriens.scalair4j.Station;
import com.github.adriens.scalair4j.StationCrawler;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author salad74
 */
@Service
public class ScalairService {
    private final Logger log = LoggerFactory.getLogger(ScalairService.class);
    
    public HashMap<String, Station> getAllLiveStationsStatuses() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses();
    }
    
    public Station getLogicoopLiveStatus() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses().get(Station.NOM_STATION_LOGICOOP);
    }
    
    public Station getMontravelLiveStatus() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses().get(Station.NOM_STATION_MONTRAVEL);
    }
    
    public Station getFaubourgLiveStatus() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses().get(Station.NOM_STATION_FAUBOURG_BLANCHOT);
    }
    
    public Station getAnseVataLiveStatus() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses().get(Station.NOM_STATION_ANSE_VATA);
    }
    
    public Station getGeneralLiveStatus() throws Exception{
        StationCrawler crawler = new StationCrawler();
        return crawler.getStationsStatuses().get(Station.NOM_STATION_GENERAL);
    }
    
    // IGAs
    public HashMap<Integer,IGA> getIGAs() throws Exception {
        return IGA.getIGAs();
    }
    
}
