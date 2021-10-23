package com.desafiocap1.desafiocap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.net.server.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
