package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Warehouse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.id
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.name
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.delete_flag
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Boolean deleteFlag;
}