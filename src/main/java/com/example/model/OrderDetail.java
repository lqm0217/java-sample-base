package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class OrderDetail extends OrderDetailKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_id
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.warehouse_id
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer warehouseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.specify_warehouse_id
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer specifyWarehouseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.demand_count
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer demandCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.allocated_count
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer allocatedCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.unallocated_count
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer unallocatedCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.shipment_order_count
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    private Integer shipmentOrderCount;
}