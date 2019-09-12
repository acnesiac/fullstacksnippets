package gmc.com.mockservice.billingaccountmanagement;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;
import java.util.Random;

@SpringBootApplication
public class BillingaccountmanagementApplication {

	public static void main(String[] args) throws  Exception {
		SpringApplication.run(BillingaccountmanagementApplication.class, args);
	}

	@Bean
	public KafkaConsumerListener messageListener() {
		return new KafkaConsumerListener();
	}

}
