package com.ohashi.commandmanagerservice.application.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaAdminConfig(
    private val producer: ProducerConfig,
    private val topicConfig: KafkaTopicProperties,
) {

    @Bean
    fun createTopics() = KafkaAdmin.NewTopics(
        TopicBuilder.name(producer.shellCommandTopicName)
            .partitions(topicConfig.partitions)
            .replicas(topicConfig.replicas)
            .build(),
    )
}
