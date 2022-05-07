package com.nvt.media_backend.repository;

import com.nvt.media_backend.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    //list authentication
    @Query(
            value = "select r.id, r.role_code, r.role_name, r.create_date, r.description, r.status from roles r" +
            " join role_user ru on r.id = ru.role_id" +
            " join users u on ru.user_id = u.id" +
            " where u.username =?1",
            nativeQuery = true)
    List<Role> Authentications(String username);
}
