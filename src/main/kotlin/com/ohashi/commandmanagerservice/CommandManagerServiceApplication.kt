package com.ohashi.commandmanagerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class CommandManagerServiceApplication

fun main(args: Array<String>) {
    runApplication<CommandManagerServiceApplication>(*args)
}
