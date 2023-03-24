package com.company.data_visualization_dashboard.Imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.company.data_visualization_dashboard.dao.DataVisualRepo;
import com.company.data_visualization_dashboard.entity.DataVisual;
import com.company.data_visualization_dashboard.exception.UserNotFoundException;
import com.company.data_visualization_dashboard.service.DataVisualService;

@Service
public class DataVisualImple implements DataVisualService {
    @Autowired
    private DataVisualRepo dataVisualRepo;


    @Override
    public List<DataVisual> getAllData() {
       
        return dataVisualRepo.findAll();
    }

    @Override
    public DataVisual saveData(DataVisual dataVisual) {
       
       return dataVisualRepo.save(dataVisual);
    }

    @Override
    public DataVisual getDataById(int id) {
     
        return dataVisualRepo.findById(id).get();
    }

    @Override
    public void deleteDataById(int id) {
    
     dataVisualRepo.deleteById(id);
        
    }


    @Override
    @PutMapping
    public DataVisual updateData(DataVisual newdataVisual ,int id) {
      
        DataVisual dataVisual=dataVisualRepo.findById
                    (id).orElseThrow(() -> new UserNotFoundException(id));
        dataVisual.setEnd_year(newdataVisual.getEnd_year());
        dataVisual.setCitylng(newdataVisual.getCitylng());
        dataVisual.setCitylat(newdataVisual.getCitylat());
        dataVisual.setIntensity(newdataVisual.getIntensity());
        dataVisual.setSector(newdataVisual.getSector());
        dataVisual.setTopic(newdataVisual.getTopic());
        dataVisual.setInsight(newdataVisual.getInsight());
        dataVisual.setSwot(newdataVisual.getSwot());
        dataVisual.setUrl(newdataVisual.getUrl());
        dataVisual.setRegion(newdataVisual.getRegion());
        dataVisual.setImpact(newdataVisual.getImpact());
        dataVisual.setStart_year(newdataVisual.getStart_year());
        dataVisual.setAdded(newdataVisual.getAdded());
        dataVisual.setPublished(newdataVisual.getPublished());
        dataVisual.setCity(newdataVisual.getCity()); 

         dataVisual.setCountry(newdataVisual.getCountry());
        dataVisual.setRelevance(newdataVisual.getRelevance());
        dataVisual.setPestle(newdataVisual.getPestle());  
         dataVisual.setSource(newdataVisual.getSource());
        dataVisual.setTitle(newdataVisual.getTitle());
        dataVisual.setLikelihood(newdataVisual.getLikelihood());
        
        return dataVisualRepo.save(newdataVisual);
    }

    @Override

    public List<DataVisual> getDataCity(String city) {
        
        return dataVisualRepo.getDataCity(city);
    }

    @Override
    public List<DataVisual> getDataEnd_Year(int end_year) {
        
        return dataVisualRepo.getDataEnd_Year(end_year);
    }

    @Override
    public List<DataVisual> getDataSector(String sector) {
        
        return dataVisualRepo.getDataSector(sector) ;
    }

    @Override
    public List<DataVisual> getDataTopic(String topic) {
        
        return dataVisualRepo.getDataTopic(topic);
    }

    @Override
    public List<DataVisual> getDataSwot(String swot) {
      
        return dataVisualRepo.getDataSwot(swot);
    }

    @Override
    public List<DataVisual> getDataRegion(String region) {
        
        return dataVisualRepo.getDataRegion(region);
    }

    @Override
    public List<DataVisual> getDataCountry(String country) {
       
        return dataVisualRepo.getDataCountry(country);
    }

    @Override
    public List<DataVisual> getDataPestle(String pestle) {
        
        return dataVisualRepo.getDataPestle(pestle);
    }

    @Override
    public List<DataVisual> getDataSource(String source) {
       
        return dataVisualRepo.getDataSource(source);
    }

    @Override
    public List<String> getAllCities() {
       return dataVisualRepo.getAllCities();
      
    }
    @Override
    public List<String> getAllCountries() {
       return dataVisualRepo.getAllCountries();
      
    }
    @Override
    public List<String> getAllRegion() {
       return dataVisualRepo.getAllRegion();
      
    }

    @Override
    public List<String> getAllintensity() {
        return dataVisualRepo.getAllintensity();
    }

    @Override
    public List<String> getAlllikelihood() {
        return dataVisualRepo.getAlllikelihood();
    }
    @Override
    public List<String> getAlltopic() {
        return dataVisualRepo.getAlltopic();
    }

      
}
    
    

