package com.march.LibraryManagementSyatem.Repository;

import com.march.LibraryManagementSyatem.Entity.Student;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
