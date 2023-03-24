package com.company.data_visualization_dashboard.service;

import java.util.List;

import com.company.data_visualization_dashboard.entity.DataVisual;

public interface DataVisualService {

   

    List<DataVisual> getAllData() ;
    List<String> getAllCities();
    List<String> getAllCountries();
    List<String> getAllRegion();
    List<String> getAllintensity();
    List<String> getAlllikelihood();
    List<String> getAlltopic();

    List<DataVisual> getDataEnd_Year(int end_year);
    List<DataVisual> getDataSector(String sector);
    List<DataVisual> getDataTopic(String topic);
    List<DataVisual> getDataSwot(String swot);
    List<DataVisual> getDataRegion(String region);
    List<DataVisual> getDataCity(String city);
    List<DataVisual> getDataCountry(String country);
    List<DataVisual> getDataPestle(String pestle);
    List<DataVisual> getDataSource(String source);

    DataVisual saveData(DataVisual dataVisual);

    DataVisual getDataById(int id);

    DataVisual updateData(DataVisual newdataVisual,int id);
    
    void deleteDataById(int id);



}
