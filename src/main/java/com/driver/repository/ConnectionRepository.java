//package com.driver.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ConnectionRepository extends JpaRepository<Connection, Integer> {
//}
package com.driver.repository;

import com.driver.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Integer> {
    //Normal Repository
}