package com.all4land.asd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class basiginfo_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    private category_entity category;

    @ManyToOne
    @JoinColumn(name = "aid", referencedColumnName = "aid", nullable = false)
    private action_entity action;

    @Column(name = "detail",nullable = false)
    private String detail;

    @Column(name = "urllink")
    private String urllink;

    @Column(name = "urlcall")
    private String urlcall;


}
