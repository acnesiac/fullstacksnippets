# BillingAccountManagement
Billing account management

1. Follow step 1 and step 2 of [Kafka Quickstart](https://kafka.apache.org/quickstart) 

2. Create two topics: data-in and data-out

   ```kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic onstar-profile```
  
3. Clone and build java project
    
   ```git clone https://github.com/billingaccountteam/BillingAccountManagement.git```
   
   ```cd BillingAccountManagement```
   
   ```mvn clean package```

4. Run producer

