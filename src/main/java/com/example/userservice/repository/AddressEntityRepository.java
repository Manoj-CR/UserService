package com.example.userservice.repository;

import com.example.userservice.models.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressEntityRepository extends JpaRepository<AddressEntity,Long> {

    List<AddressEntity> findAddressEntitiesByUserId(Long userId);

    AddressEntity findAddressEntitiesById(Long userid);

}
