package com.example.enverssample.domain.team.model;

import com.example.enverssample.domain.member.model.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Audited
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String location;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();
}
