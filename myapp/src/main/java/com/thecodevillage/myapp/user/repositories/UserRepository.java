package com.thecodevillage.myapp.user.repositories;

import com.thecodevillage.myapp.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> fetchAllUsers();

    Optional<User> findUsersByCode(@Param("userCode") String userCode);
}
