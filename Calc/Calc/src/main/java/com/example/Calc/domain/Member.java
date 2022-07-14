package com.example.Calc.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String loginId;
    private String name;
    private String password;
//
//    @OneToMany(mappedBy = "member")
//    private List<Calculator> calculatorList = new ArrayList<>();
}
