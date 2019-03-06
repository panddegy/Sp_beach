package com.biz.beach.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BeachVO {

    private int b_id, hotm;
    private String title, subtitle, topic, area, addr, tel, homepage, mapurl, imgurl;
    
}
