package com.company.data_visualization_dashboard.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.data_visualization_dashboard.entity.DataVisual;
@Repository

public interface DataVisualRepo extends JpaRepository<DataVisual,Integer>
{

    @Query("SELECT p FROM DataVisual p WHERE p.city=?1" )
    public List<DataVisual> getDataCity(String city) ;

    @Query("SELECT p FROM DataVisual p WHERE p.end_year=?1" )
   public List<DataVisual> getDataEnd_Year(int end_year);

    @Query("SELECT p FROM DataVisual p WHERE p.sector=?1" )
    public List<DataVisual> getDataSector(String sector);

    @Query("SELECT p FROM DataVisual p WHERE p.topic=?1" )
    public List<DataVisual> getDataTopic(String topic);

    @Query("SELECT p FROM DataVisual p WHERE p.swot=?1" )
    public List<DataVisual> getDataSwot(String swot);

    @Query("SELECT p FROM DataVisual p WHERE p.region=?1" )
    public List<DataVisual> getDataRegion(String region);

    @Query("SELECT p FROM DataVisual p WHERE p.country=?1" )
    public List<DataVisual> getDataCountry(String country);

    @Query("SELECT p FROM DataVisual p WHERE p.pestle=?1" )
    public List<DataVisual> getDataPestle(String pestle);

    @Query("SELECT p FROM DataVisual p WHERE p.source=?1" )
    public List<DataVisual> getDataSource(String source);




    /********* fetch entire fields************/
    @Query("SELECT d.city FROM DataVisual d")
    List<String> getAllCities();

    @Query("SELECT d.country FROM DataVisual d")
    List<String> getAllCountries();

    @Query("SELECT d.region FROM DataVisual d")
    List<String> getAllRegion();

    @Query("SELECT d.intensity FROM DataVisual d")
    List<String> getAllintensity();

    @Query("SELECT d.likelihood FROM DataVisual d")
    List<String> getAlllikelihood();

    @Query("SELECT d.topic FROM DataVisual d")
    List<String> getAlltopic();
}   
   