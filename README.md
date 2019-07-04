**Steps for running the project**

1. Just run this spring boot application using this command **mvn spring-boot:run**

**Git Operations**:

1. **Get Details Of All Cars**
   
   `localhost:8080/api/v1/cars`
  
2. **Search Car Details By brand**

     To get the search result of cars by brand (e.g. ["audi", "ford", "mercedes"]) hit
    ` localhost:8080/api/v1/cars/get-cars-by-brand`
    
3. **Search car Details By car Brand, Minimum and Maximum price**

    To get the search results of cars by car brand, minimum and maximum price, hit
    `localhost:8080/api/v1/cars/search-by-brand`
     
     brand e.g.- audi, mercedes, ford, dodge, mini, bmw, porsche, suzuki, honda
     
     minimum price e.g. - 10107
     
     maximum price e.g. - 173560
     
4. **Search car Details By car Type, Minimum and Maximum price**

    To get the search results of cars by car Type, minimum and maximum price, hit
    `localhost:8080/api/v1/cars/search-by-type`
    
     brand e.g.- suv, sedan, wagon, sports, truck
         
     minimum price e.g. - 10107
         
     maximum price e.g. - 173560
     
     
 **Note :**  `If the file name -{ cars.mv.db } is not present, then go to resource package
             and find data.sql file, open it and uncomment it.
             Then re-run the project and comment all the line in data.sql.`