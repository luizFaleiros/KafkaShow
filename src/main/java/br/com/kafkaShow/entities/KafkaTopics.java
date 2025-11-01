package br.com.kafkaShow.entities;

public record KafkaTopics(
        Integer id,
        String name,
        String config){}
