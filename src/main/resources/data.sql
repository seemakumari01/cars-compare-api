

/*

insert into cars ( brand,model,type,origin,drive_train,msrp,invoice,engine_size,cyclinders,horsepower,mpg_city,mpg_highway,weight,wheelbase,length )
select *
from CSVREAD('CARS.csv', null, null);

ALTER TABLE cars ALTER COLUMN invoice SET DATA TYPE INT;

CREATE ALIAS IF NOT EXISTS FT_INIT FOR "org.h2.fulltext.FullText.init";
CALL FT_INIT();
CALL FT_CREATE_INDEX('PUBLIC', 'CARS', 'BRAND');

*/