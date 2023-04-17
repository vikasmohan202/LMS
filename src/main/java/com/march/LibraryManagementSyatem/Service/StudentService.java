package com.march.LibraryManagementSyatem.Service;

import com.march.LibraryManagementSyatem.Entity.LibraryCard;
import com.march.LibraryManagementSyatem.Entity.Student;
import com.march.LibraryManagementSyatem.Enums.CardStatus;
import com.march.LibraryManagementSyatem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        LibraryCard card=new LibraryCard();
        card.setStatus(CardStatus.ACTIVATE);
        card.setExpirydate("20/08/1998");
        card.setStudent(student);
        //set the card attribute in student
        student.setCard(card);
        studentRepository.save(student);
    }






















}
