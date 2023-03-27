package com.ohashi.commandmanagerservice.application.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(
    KafkaTopicProperties::class,
    ProducerConfig::class,
)
class PropertiesConfig

@ConfigurationProperties("spring.kafka.config.topic")
@ConstructorBinding
data class KafkaTopicProperties(
    val partitions: Int,
    val replicas: Int,
    val partitionsDlq: Int,
    val replicasDlq: Int,
)

@ConfigurationProperties("app.producer.kafka")
@ConstructorBinding
data class ProducerConfig(
    val shellCommandTopicName: String,
)
