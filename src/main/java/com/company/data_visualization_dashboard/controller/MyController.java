package com.company.data_visualization_dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.data_visualization_dashboard.dao.DataVisualRepo;
import com.company.data_visualization_dashboard.entity.DataVisual;
import com.company.data_visualization_dashboard.service.DataVisualService;

@RestController
@CrossOrigin("*")
public class MyController {
    @Autowired
    private DataVisualService dataVisualService;

      @GetMapping("/home")
    public String home()
    {
        return "this is my first project";
    }

    @GetMapping("/data")
    public  List<DataVisual>  getalldata()
    {
        return dataVisualService.getAllData();

    }
    @GetMapping("/data/{id}")
    public DataVisual getsingledata(@PathVariable("id") int id)
    {
        return dataVisualService.getDataById(id);
    }


    @DeleteMapping("/data/{id}")
    public void deleteDataVisual(@PathVariable("id") int id)
    {
        this.dataVisualService.deleteDataById(id);
        System.out.println("data deleted");
    }


    @PostMapping("/add")
    public String addDataVisual(@RequestBody DataVisual datavisual)
    {
         this.dataVisualService.saveData(datavisual);
         return "new data added";
    }

    
    @PutMapping("/update/{id}")
    public DataVisual  updateDataVisual(@RequestBody DataVisual newdatavisual,@PathVariable int id)
    {
         this.dataVisualService.updateData(newdatavisual,id);
         return newdatavisual;

    }
    /*****************************visual data********* */

    @GetMapping("/data/cities")
    public  List<String>  getalldatacity()
    {
        return dataVisualService.getAllCities();

    } 

    @GetMapping("/data/countries")
    public  List<String>  getalldatacountry()
    {
        return dataVisualService.getAllCountries();

    } 

    @GetMapping("/data/region")
    public  List<String>  getalldataregion()
    {
        return dataVisualService.getAllRegion();

    } 


    @GetMapping("/data/intensity")
    public  List<String>  getalldataintensity()
    {
        return dataVisualService.getAllintensity();

    } 

    @GetMapping("/data/likelihood")
    public  List<String>  getalldatalikelihood()
    {
        return dataVisualService.getAlllikelihood();

    } 

    @GetMapping("/data/topics")
    public  List<String>  getalldatatopics()
    {
        return dataVisualService.getAlltopic();

    } 

/**********************filtering content **************** */
  /* @GetMapping("/filter/city/{city}")
    public List<DataVisual> citydata(@PathVariable String city)
    {
       return this.dataVisualService.getDataCity(city);
    }

     @GetMapping("/filter/sector/{sector}")
    public List<DataVisual> sectordata(@PathVariable String sector)
    {
       return this.dataVisualService.getDataSetor(Sector);
    }
    @GetMapping("/filter/topic/{topic}")
    public List<DataVisual> topicdata(@PathVariable String topic)
    {
       return this.dataVisualService.getDataTopic(topic);
    }
    

    @GetMapping("/filter/swot/{swot}")
    public List<DataVisual> swotdata(@PathVariable String swot)
    {
       return this.dataVisualService.getDataSwot(swot);
    }
    

    @GetMapping("/filter/region/{region}")
    public List<DataVisual> regiondata(@PathVariable String region)
    {
       return this.dataVisualService.getDataRegion(region);
    }
    @GetMapping("/filter/country/{country}")
    public List<DataVisual> countrydat(@PathVariable String country)
    {
       return this.dataVisualService.getDataCountry(country);
    }
    @GetMapping("/filter/pestle/{pestle}")
    public List<DataVisual> pestledata(@PathVariable String pestle)
    {
       return this.dataVisualService.getDataPestle(pestle);
    }
    @GetMapping("/filter/source/{source}")
    public List<DataVisual> sourcedata(@PathVariable String source)
    {
       return this.dataVisualService.getDataSource(source);
    }
    @GetMapping("/filter/endyear/{end_year}")
    public List<DataVisual> yeardata(@PathVariable String end_year)
    {
       return this.dataVisualService.getDataEnd_Year( end_year);
    }
  */

    
} 
    
        
   

            
    

    
    

    


